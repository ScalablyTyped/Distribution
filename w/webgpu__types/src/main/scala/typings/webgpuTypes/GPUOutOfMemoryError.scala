package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUOutOfMemoryError
  extends StObject
     with GPUError {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPUOutOfMemoryError
}
object GPUOutOfMemoryError {
  
  inline def apply(message: String): GPUOutOfMemoryError = {
    val __obj = js.Dynamic.literal(__brand = "GPUOutOfMemoryError", message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUOutOfMemoryError]
  }
  
  extension [Self <: GPUOutOfMemoryError](x: Self) {
    
    inline def set__brand(value: typings.webgpuTypes.webgpuTypesStrings.GPUOutOfMemoryError): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
