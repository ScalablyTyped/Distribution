package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUBindGroup
  extends StObject
     with GPUObjectBase {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPUBindGroup
}
object GPUBindGroup {
  
  inline def apply(label: String): GPUBindGroup = {
    val __obj = js.Dynamic.literal(__brand = "GPUBindGroup", label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUBindGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUBindGroup] (val x: Self) extends AnyVal {
    
    inline def set__brand(value: typings.webgpuTypes.webgpuTypesStrings.GPUBindGroup): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
