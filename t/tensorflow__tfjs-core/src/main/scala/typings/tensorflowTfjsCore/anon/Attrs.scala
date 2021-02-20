package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.kernelRegistryMod.NamedAttrMap
import typings.tensorflowTfjsCore.kernelRegistryMod.NamedTensorInfoMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attrs extends StObject {
  
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
  implicit class AttrsMutableBuilder[Self <: Attrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: NamedAttrMap): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
    
    @scala.inline
    def setInputs(value: NamedTensorInfoMap): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
