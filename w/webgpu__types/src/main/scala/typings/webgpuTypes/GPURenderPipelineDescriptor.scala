package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPURenderPipelineDescriptor
  extends StObject
     with GPUPipelineDescriptorBase {
  
  /**
    * Describes the optional depth-stencil properties, including the testing, operations, and bias.
    */
  var depthStencil: js.UndefOr[GPUDepthStencilState] = js.undefined
  
  /**
    * Describes the fragment shader entry point of the pipeline and its output colors. If
    * not map/exist|provided, the [[#no-color-output]] mode is enabled.
    */
  var fragment: js.UndefOr[GPUFragmentState] = js.undefined
  
  /**
    * Describes the multi-sampling properties of the pipeline.
    */
  var multisample: js.UndefOr[GPUMultisampleState] = js.undefined
  
  /**
    * Describes the primitive-related properties of the pipeline.
    */
  var primitive: js.UndefOr[GPUPrimitiveState] = js.undefined
  
  /**
    * Describes the vertex shader entry point of the pipeline and its input buffer layouts.
    */
  var vertex: GPUVertexState
}
object GPURenderPipelineDescriptor {
  
  inline def apply(layout: GPUPipelineLayout | GPUAutoLayoutMode, vertex: GPUVertexState): GPURenderPipelineDescriptor = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], vertex = vertex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPURenderPipelineDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPURenderPipelineDescriptor] (val x: Self) extends AnyVal {
    
    inline def setDepthStencil(value: GPUDepthStencilState): Self = StObject.set(x, "depthStencil", value.asInstanceOf[js.Any])
    
    inline def setDepthStencilUndefined: Self = StObject.set(x, "depthStencil", js.undefined)
    
    inline def setFragment(value: GPUFragmentState): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    inline def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
    
    inline def setMultisample(value: GPUMultisampleState): Self = StObject.set(x, "multisample", value.asInstanceOf[js.Any])
    
    inline def setMultisampleUndefined: Self = StObject.set(x, "multisample", js.undefined)
    
    inline def setPrimitive(value: GPUPrimitiveState): Self = StObject.set(x, "primitive", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveUndefined: Self = StObject.set(x, "primitive", js.undefined)
    
    inline def setVertex(value: GPUVertexState): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
  }
}
