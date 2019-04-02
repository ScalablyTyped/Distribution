package typings
package tmpLib.tmpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirOptions extends TmpNameOptions {
  var keep: js.UndefOr[scala.Boolean] = js.undefined
  var mode: js.UndefOr[scala.Double] = js.undefined
  var unsafeCleanup: js.UndefOr[scala.Boolean] = js.undefined
}

object DirOptions {
  @scala.inline
  def apply(
    dir: java.lang.String = null,
    keep: js.UndefOr[scala.Boolean] = js.undefined,
    mode: scala.Int | scala.Double = null,
    postfix: java.lang.String = null,
    prefix: java.lang.String = null,
    template: java.lang.String = null,
    tries: scala.Int | scala.Double = null,
    unsafeCleanup: js.UndefOr[scala.Boolean] = js.undefined
  ): DirOptions = {
    val __obj = js.Dynamic.literal()
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (!js.isUndefined(keep)) __obj.updateDynamic("keep")(keep)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (postfix != null) __obj.updateDynamic("postfix")(postfix)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (template != null) __obj.updateDynamic("template")(template)
    if (tries != null) __obj.updateDynamic("tries")(tries.asInstanceOf[js.Any])
    if (!js.isUndefined(unsafeCleanup)) __obj.updateDynamic("unsafeCleanup")(unsafeCleanup)
    __obj.asInstanceOf[DirOptions]
  }
}

