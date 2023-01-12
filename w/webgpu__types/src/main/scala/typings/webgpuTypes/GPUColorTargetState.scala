package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUColorTargetState extends StObject {
  
  var blend: js.UndefOr[GPUBlendState] = js.undefined
  
  var format: GPUTextureFormat
  
  var writeMask: js.UndefOr[GPUColorWriteFlags] = js.undefined
}
object GPUColorTargetState {
  
  inline def apply(format: GPUTextureFormat): GPUColorTargetState = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUColorTargetState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUColorTargetState] (val x: Self) extends AnyVal {
    
    inline def setBlend(value: GPUBlendState): Self = StObject.set(x, "blend", value.asInstanceOf[js.Any])
    
    inline def setBlendUndefined: Self = StObject.set(x, "blend", js.undefined)
    
    inline def setFormat(value: GPUTextureFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setWriteMask(value: GPUColorWriteFlags): Self = StObject.set(x, "writeMask", value.asInstanceOf[js.Any])
    
    inline def setWriteMaskUndefined: Self = StObject.set(x, "writeMask", js.undefined)
  }
}
