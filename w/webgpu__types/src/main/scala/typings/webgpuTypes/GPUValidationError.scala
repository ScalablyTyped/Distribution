package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUValidationError
  extends StObject
     with GPUError {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPUValidationError
}
object GPUValidationError {
  
  inline def apply(message: String): GPUValidationError = {
    val __obj = js.Dynamic.literal(__brand = "GPUValidationError", message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUValidationError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUValidationError] (val x: Self) extends AnyVal {
    
    inline def set__brand(value: typings.webgpuTypes.webgpuTypesStrings.GPUValidationError): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
