package typings.tmp.tmpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirOptions extends TmpNameOptions {
  var keep: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
  var unsafeCleanup: js.UndefOr[Boolean] = js.undefined
}

object DirOptions {
  @scala.inline
  def apply(
    dir: String = null,
    keep: js.UndefOr[Boolean] = js.undefined,
    mode: Int | Double = null,
    postfix: String = null,
    prefix: String = null,
    template: String = null,
    tries: Int | Double = null,
    unsafeCleanup: js.UndefOr[Boolean] = js.undefined
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

