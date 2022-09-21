package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUSampler
  extends StObject
     with GPUObjectBase
     with GPUBindingResource {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPUSampler
}
object GPUSampler {
  
  inline def apply(label: String): GPUSampler = {
    val __obj = js.Dynamic.literal(__brand = "GPUSampler", label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUSampler]
  }
  
  extension [Self <: GPUSampler](x: Self) {
    
    inline def set__brand(value: typings.webgpuTypes.webgpuTypesStrings.GPUSampler): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
