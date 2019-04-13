package typings
package tempDashFsLib.tempDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options.
  */
trait options extends js.Object {
  /**
    * Where to put the generated tempfile or tempdir.
    *
    * Also see {@link options#name}. Default: <code>tempfs.dir()</code>
    */
  var dir: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum number of chance to retry before throwing an error.
    *
    * It should be a finite number. Default: 5
    */
  var limit: js.UndefOr[stdLib.Number] = js.undefined
  /**
    * File mode (default: 0600) or directory mode (default: 0700) to use.
    */
  var mode: js.UndefOr[stdLib.Number] = js.undefined
  /**
    * If set, join the two paths <code>{@link options#dir} ||
    * tempfs.dir()</code> and {@link options#name} together and use the
    * result as the customized filename/pathname.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The prefix for the generated random name.
    *
    * Default: "tmp-"
    */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether {@link dir#unlink} should remove a directory recursively.
    *
    * Default: false
    */
  var recursive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The suffix for the generated random name.
    *
    * Default: ""
    */
  var suffix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A string containing some capital letters Xs for substitution with
    * random characters.
    *
    * Then it is used as part of the filename/dirname. Just like what you
    * do with the <code>mktemp(3)</code> function in the C library.
    */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If set to true, let temp-fs manage the the current file/directory for
    * you even if the global tracking is off. If set to false, don't let
    * temp-fs manage it even if the global tracking is on. Otherwise, use
    * the current global setting.
    */
  var track: js.UndefOr[scala.Boolean] = js.undefined
}

object options {
  @scala.inline
  def apply(
    dir: java.lang.String = null,
    limit: stdLib.Number = null,
    mode: stdLib.Number = null,
    name: java.lang.String = null,
    prefix: java.lang.String = null,
    recursive: js.UndefOr[scala.Boolean] = js.undefined,
    suffix: java.lang.String = null,
    template: java.lang.String = null,
    track: js.UndefOr[scala.Boolean] = js.undefined
  ): options = {
    val __obj = js.Dynamic.literal()
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (limit != null) __obj.updateDynamic("limit")(limit)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (name != null) __obj.updateDynamic("name")(name)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (template != null) __obj.updateDynamic("template")(template)
    if (!js.isUndefined(track)) __obj.updateDynamic("track")(track)
    __obj.asInstanceOf[options]
  }
}

