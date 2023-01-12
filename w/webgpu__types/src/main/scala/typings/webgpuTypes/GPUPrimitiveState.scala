package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUPrimitiveState extends StObject {
  
  /**
    * Defines which polygon orientation will be culled, if any.
    */
  var cullMode: js.UndefOr[GPUCullMode] = js.undefined
  
  /**
    * Defines which polygons are considered front-facing.
    */
  var frontFace: js.UndefOr[GPUFrontFace] = js.undefined
  
  /**
    * For pipelines with strip topologies
    * ({@link GPUPrimitiveTopology#"line-strip"} or {@link GPUPrimitiveTopology#"triangle-strip"}),
    * this determines the index buffer format and primitive restart value
    * ({@link GPUIndexFormat#"uint16"}/`0xFFFF` or {@link GPUIndexFormat#"uint32"}/`0xFFFFFFFF`).
    * It is not allowed on pipelines with non-strip topologies.
    * Note: Some implementations require knowledge of the primitive restart value to compile
    * pipeline state objects.
    * To use a strip-topology pipeline with an indexed draw call
    * ({@link GPURenderCommandsMixin#drawIndexed()} or {@link GPURenderCommandsMixin#drawIndexedIndirect}),
    * this must be set, and it must match the index buffer format used with the draw call
    * (set in {@link GPURenderCommandsMixin#setIndexBuffer}).
    * See [[#primitive-assembly]] for additional details.
    */
  var stripIndexFormat: js.UndefOr[GPUIndexFormat] = js.undefined
  
  /**
    * The type of primitive to be constructed from the vertex inputs.
    */
  var topology: js.UndefOr[GPUPrimitiveTopology] = js.undefined
  
  /**
    * If true, indicates that depth clipping is disabled. See [[#depth-clip-control]] for additional details.
    * Requires the {@link GPUFeatureName#"depth-clip-control"} feature to be enabled.
    */
  var unclippedDepth: js.UndefOr[Boolean] = js.undefined
}
object GPUPrimitiveState {
  
  inline def apply(): GPUPrimitiveState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPUPrimitiveState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUPrimitiveState] (val x: Self) extends AnyVal {
    
    inline def setCullMode(value: GPUCullMode): Self = StObject.set(x, "cullMode", value.asInstanceOf[js.Any])
    
    inline def setCullModeUndefined: Self = StObject.set(x, "cullMode", js.undefined)
    
    inline def setFrontFace(value: GPUFrontFace): Self = StObject.set(x, "frontFace", value.asInstanceOf[js.Any])
    
    inline def setFrontFaceUndefined: Self = StObject.set(x, "frontFace", js.undefined)
    
    inline def setStripIndexFormat(value: GPUIndexFormat): Self = StObject.set(x, "stripIndexFormat", value.asInstanceOf[js.Any])
    
    inline def setStripIndexFormatUndefined: Self = StObject.set(x, "stripIndexFormat", js.undefined)
    
    inline def setTopology(value: GPUPrimitiveTopology): Self = StObject.set(x, "topology", value.asInstanceOf[js.Any])
    
    inline def setTopologyUndefined: Self = StObject.set(x, "topology", js.undefined)
    
    inline def setUnclippedDepth(value: Boolean): Self = StObject.set(x, "unclippedDepth", value.asInstanceOf[js.Any])
    
    inline def setUnclippedDepthUndefined: Self = StObject.set(x, "unclippedDepth", js.undefined)
  }
}
