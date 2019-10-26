package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distKernelUnderscoreRegistryMod.NamedAttrMap
import typings.atTensorflowTfjsDashCore.distKernelUnderscoreRegistryMod.NamedTensorInfoMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attrs extends js.Object {
  var attrs: js.UndefOr[NamedAttrMap] = js.undefined
  var inputs: NamedTensorInfoMap
}

object Anon_Attrs {
  @scala.inline
  def apply(inputs: NamedTensorInfoMap, attrs: NamedAttrMap = null): Anon_Attrs = {
    val __obj = js.Dynamic.literal(inputs = inputs)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
    __obj.asInstanceOf[Anon_Attrs]
  }
}

