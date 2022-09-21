package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUBlendComponent extends StObject {
  
  /**
    * Defines the {@link GPUBlendFactor} operation to be performed on values from the target attachment.
    */
  var dstFactor: js.UndefOr[GPUBlendFactor] = js.undefined
  
  /**
    * Defines the {@link GPUBlendOperation} used to calculate the values written to the target
    * attachment components.
    */
  var operation: js.UndefOr[GPUBlendOperation] = js.undefined
  
  /**
    * Defines the {@link GPUBlendFactor} operation to be performed on values from the fragment shader.
    */
  var srcFactor: js.UndefOr[GPUBlendFactor] = js.undefined
}
object GPUBlendComponent {
  
  inline def apply(): GPUBlendComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPUBlendComponent]
  }
  
  extension [Self <: GPUBlendComponent](x: Self) {
    
    inline def setDstFactor(value: GPUBlendFactor): Self = StObject.set(x, "dstFactor", value.asInstanceOf[js.Any])
    
    inline def setDstFactorUndefined: Self = StObject.set(x, "dstFactor", js.undefined)
    
    inline def setOperation(value: GPUBlendOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setSrcFactor(value: GPUBlendFactor): Self = StObject.set(x, "srcFactor", value.asInstanceOf[js.Any])
    
    inline def setSrcFactorUndefined: Self = StObject.set(x, "srcFactor", js.undefined)
  }
}
