package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUTextureView
  extends StObject
     with GPUObjectBase
     with GPUBindingResource {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPUTextureView
}
object GPUTextureView {
  
  inline def apply(label: String): GPUTextureView = {
    val __obj = js.Dynamic.literal(__brand = "GPUTextureView", label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUTextureView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUTextureView] (val x: Self) extends AnyVal {
    
    inline def set__brand(value: typings.webgpuTypes.webgpuTypesStrings.GPUTextureView): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
