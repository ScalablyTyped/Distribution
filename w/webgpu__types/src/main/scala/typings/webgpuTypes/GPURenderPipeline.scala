package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPURenderPipeline
  extends StObject
     with GPUObjectBase
     with GPUPipelineBase {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPURenderPipeline
}
object GPURenderPipeline {
  
  inline def apply(getBindGroupLayout: Double => GPUBindGroupLayout, label: String): GPURenderPipeline = {
    val __obj = js.Dynamic.literal(__brand = "GPURenderPipeline", getBindGroupLayout = js.Any.fromFunction1(getBindGroupLayout), label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPURenderPipeline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPURenderPipeline] (val x: Self) extends AnyVal {
    
    inline def set__brand(value: typings.webgpuTypes.webgpuTypesStrings.GPURenderPipeline): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
