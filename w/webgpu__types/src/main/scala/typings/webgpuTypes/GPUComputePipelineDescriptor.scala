package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUComputePipelineDescriptor
  extends StObject
     with GPUPipelineDescriptorBase {
  
  /**
    * Describes the compute shader entry point of the pipeline.
    */
  var compute: GPUProgrammableStage
}
object GPUComputePipelineDescriptor {
  
  inline def apply(compute: GPUProgrammableStage, layout: GPUPipelineLayout | GPUAutoLayoutMode): GPUComputePipelineDescriptor = {
    val __obj = js.Dynamic.literal(compute = compute.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUComputePipelineDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUComputePipelineDescriptor] (val x: Self) extends AnyVal {
    
    inline def setCompute(value: GPUProgrammableStage): Self = StObject.set(x, "compute", value.asInstanceOf[js.Any])
  }
}
