package typings.tmp.tmpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileOptions extends TmpNameOptions {
  var detachDescriptor: js.UndefOr[Boolean] = js.undefined
  var discardDescriptor: js.UndefOr[Boolean] = js.undefined
  var keep: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
}

object FileOptions {
  @scala.inline
  def apply(
    detachDescriptor: js.UndefOr[Boolean] = js.undefined,
    dir: String = null,
    discardDescriptor: js.UndefOr[Boolean] = js.undefined,
    keep: js.UndefOr[Boolean] = js.undefined,
    mode: Int | Double = null,
    postfix: String = null,
    prefix: String = null,
    template: String = null,
    tries: Int | Double = null
  ): FileOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detachDescriptor)) __obj.updateDynamic("detachDescriptor")(detachDescriptor)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (!js.isUndefined(discardDescriptor)) __obj.updateDynamic("discardDescriptor")(discardDescriptor)
    if (!js.isUndefined(keep)) __obj.updateDynamic("keep")(keep)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (postfix != null) __obj.updateDynamic("postfix")(postfix)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (template != null) __obj.updateDynamic("template")(template)
    if (tries != null) __obj.updateDynamic("tries")(tries.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileOptions]
  }
}

