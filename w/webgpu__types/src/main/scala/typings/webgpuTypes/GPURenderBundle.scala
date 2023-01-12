package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPURenderBundle
  extends StObject
     with GPUObjectBase {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPURenderBundle
}
object GPURenderBundle {
  
  inline def apply(label: String): GPURenderBundle = {
    val __obj = js.Dynamic.literal(__brand = "GPURenderBundle", label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPURenderBundle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPURenderBundle] (val x: Self) extends AnyVal {
    
    inline def set__brand(value: typings.webgpuTypes.webgpuTypesStrings.GPURenderBundle): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
