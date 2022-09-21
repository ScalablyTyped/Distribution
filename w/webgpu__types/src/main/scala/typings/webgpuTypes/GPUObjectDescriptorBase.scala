package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUObjectDescriptorBase extends StObject {
  
  /**
    * The initial value of {@link GPUObjectBase#label|GPUObjectBase.label}.
    */
  var label: js.UndefOr[String] = js.undefined
}
object GPUObjectDescriptorBase {
  
  inline def apply(): GPUObjectDescriptorBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPUObjectDescriptorBase]
  }
  
  extension [Self <: GPUObjectDescriptorBase](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
