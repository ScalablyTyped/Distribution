package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.kernelRegistryMod.NamedAttrMap
import typings.tensorflowTfjsCore.kernelRegistryMod.NamedTensorInfoMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attrs extends js.Object {
  
  var attrs: js.UndefOr[NamedAttrMap] = js.native
  
  var inputs: NamedTensorInfoMap = js.native
}
object Attrs {
  
  @scala.inline
  def apply(inputs: NamedTensorInfoMap): Attrs = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attrs]
  }
  
  @scala.inline
  implicit class AttrsOps[Self <: Attrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInputs(value: NamedTensorInfoMap): Self = this.set("inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttrs(value: NamedAttrMap): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttrs: Self = this.set("attrs", js.undefined)
  }
}
