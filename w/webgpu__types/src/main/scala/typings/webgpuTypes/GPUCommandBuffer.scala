package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUCommandBuffer
  extends StObject
     with GPUObjectBase {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPUCommandBuffer
}
object GPUCommandBuffer {
  
  inline def apply(label: String): GPUCommandBuffer = {
    val __obj = js.Dynamic.literal(__brand = "GPUCommandBuffer", label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUCommandBuffer]
  }
  
  extension [Self <: GPUCommandBuffer](x: Self) {
    
    inline def set__brand(value: typings.webgpuTypes.webgpuTypesStrings.GPUCommandBuffer): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
