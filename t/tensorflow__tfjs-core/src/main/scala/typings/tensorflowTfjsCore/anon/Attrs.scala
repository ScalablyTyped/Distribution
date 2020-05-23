package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.kernelRegistryMod.NamedAttrMap
import typings.tensorflowTfjsCore.kernelRegistryMod.NamedTensorInfoMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attrs extends js.Object {
  var attrs: js.UndefOr[NamedAttrMap] = js.undefined
  var inputs: NamedTensorInfoMap
}

object Attrs {
  @scala.inline
  def apply(inputs: NamedTensorInfoMap, attrs: NamedAttrMap = null): Attrs = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any])
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attrs]
  }
}

