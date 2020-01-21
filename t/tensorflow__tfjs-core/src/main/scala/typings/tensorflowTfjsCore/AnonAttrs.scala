package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.kernelRegistryMod.NamedAttrMap
import typings.tensorflowTfjsCore.kernelRegistryMod.NamedTensorInfoMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttrs extends js.Object {
  var attrs: js.UndefOr[NamedAttrMap] = js.undefined
  var inputs: NamedTensorInfoMap
}

object AnonAttrs {
  @scala.inline
  def apply(inputs: NamedTensorInfoMap, attrs: NamedAttrMap = null): AnonAttrs = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any])
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttrs]
  }
}

