package typings
package tmpLib.tmpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileOptions extends TmpNameOptions {
  var detachDescriptor: js.UndefOr[scala.Boolean] = js.undefined
  var discardDescriptor: js.UndefOr[scala.Boolean] = js.undefined
  var keep: js.UndefOr[scala.Boolean] = js.undefined
  var mode: js.UndefOr[scala.Double] = js.undefined
}

object FileOptions {
  @scala.inline
  def apply(
    detachDescriptor: js.UndefOr[scala.Boolean] = js.undefined,
    dir: java.lang.String = null,
    discardDescriptor: js.UndefOr[scala.Boolean] = js.undefined,
    keep: js.UndefOr[scala.Boolean] = js.undefined,
    mode: scala.Int | scala.Double = null,
    postfix: java.lang.String = null,
    prefix: java.lang.String = null,
    template: java.lang.String = null,
    tries: scala.Int | scala.Double = null
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

