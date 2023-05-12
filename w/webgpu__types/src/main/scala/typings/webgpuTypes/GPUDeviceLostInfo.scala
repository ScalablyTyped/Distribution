package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUDeviceLostInfo extends StObject {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPUDeviceLostInfo
  
  val message: String
  
  val reason: GPUDeviceLostReason
}
object GPUDeviceLostInfo {
  
  inline def apply(message: String, reason: GPUDeviceLostReason): GPUDeviceLostInfo = {
    val __obj = js.Dynamic.literal(__brand = "GPUDeviceLostInfo", message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUDeviceLostInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUDeviceLostInfo] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setReason(value: GPUDeviceLostReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def set__brand(value: typings.webgpuTypes.webgpuTypesStrings.GPUDeviceLostInfo): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
