package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.distKernelRegistryMod.NamedAttrMap
import typings.tensorflowTfjsCore.distKernelRegistryMod.NamedTensorInfoMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attrs extends StObject {
  
  var attrs: js.UndefOr[NamedAttrMap] = js.undefined
  
  var inputs: NamedTensorInfoMap
}
object Attrs {
  
  inline def apply(inputs: NamedTensorInfoMap): Attrs = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attrs]
  }
  
  extension [Self <: Attrs](x: Self) {
    
    inline def setAttrs(value: NamedAttrMap): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
    
    inline def setInputs(value: NamedTensorInfoMap): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
