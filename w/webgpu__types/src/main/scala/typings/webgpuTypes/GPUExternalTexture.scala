package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUExternalTexture
  extends StObject
     with GPUObjectBase
     with GPUBindingResource {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPUExternalTexture
}
object GPUExternalTexture {
  
  inline def apply(label: String): GPUExternalTexture = {
    val __obj = js.Dynamic.literal(__brand = "GPUExternalTexture", label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUExternalTexture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUExternalTexture] (val x: Self) extends AnyVal {
    
    inline def set__brand(value: typings.webgpuTypes.webgpuTypesStrings.GPUExternalTexture): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
