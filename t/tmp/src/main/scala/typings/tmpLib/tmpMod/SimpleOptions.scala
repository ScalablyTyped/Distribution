package typings
package tmpLib.tmpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleOptions extends js.Object {
  var dir: js.UndefOr[java.lang.String] = js.undefined
  var keep: js.UndefOr[scala.Boolean] = js.undefined
  var postfix: js.UndefOr[java.lang.String] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
  var tries: js.UndefOr[scala.Double] = js.undefined
  var unsafeCleanup: js.UndefOr[scala.Boolean] = js.undefined
}

object SimpleOptions {
  @scala.inline
  def apply(
    dir: java.lang.String = null,
    keep: js.UndefOr[scala.Boolean] = js.undefined,
    postfix: java.lang.String = null,
    prefix: java.lang.String = null,
    template: java.lang.String = null,
    tries: scala.Int | scala.Double = null,
    unsafeCleanup: js.UndefOr[scala.Boolean] = js.undefined
  ): SimpleOptions = {
    val __obj = js.Dynamic.literal()
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (!js.isUndefined(keep)) __obj.updateDynamic("keep")(keep)
    if (postfix != null) __obj.updateDynamic("postfix")(postfix)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (template != null) __obj.updateDynamic("template")(template)
    if (tries != null) __obj.updateDynamic("tries")(tries.asInstanceOf[js.Any])
    if (!js.isUndefined(unsafeCleanup)) __obj.updateDynamic("unsafeCleanup")(unsafeCleanup)
    __obj.asInstanceOf[SimpleOptions]
  }
}

