package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUInternalError
  extends StObject
     with GPUError {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPUInternalError
}
object GPUInternalError {
  
  inline def apply(message: String): GPUInternalError = {
    val __obj = js.Dynamic.literal(__brand = "GPUInternalError", message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUInternalError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUInternalError] (val x: Self) extends AnyVal {
    
    inline def set__brand(value: typings.webgpuTypes.webgpuTypesStrings.GPUInternalError): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
