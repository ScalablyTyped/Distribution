package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPURenderPassDepthStencilAttachment extends StObject {
  
  /**
    * Indicates the value to clear {@link GPURenderPassDepthStencilAttachment#view}'s depth component
    * to prior to executing the render pass. Ignored if {@link GPURenderPassDepthStencilAttachment#depthLoadOp}
    * is not {@link GPULoadOp#"clear"}. Must be between 0.0 and 1.0, inclusive.
    * <!-- unless unrestricted depth is enabled -->
    */
  var depthClearValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates the load operation to perform on {@link GPURenderPassDepthStencilAttachment#view}'s
    * depth component prior to executing the render pass.
    * Note: It is recommended to prefer clearing; see {@link GPULoadOp#"clear"} for details.
    */
  var depthLoadOp: js.UndefOr[GPULoadOp] = js.undefined
  
  /**
    * Indicates that the depth component of {@link GPURenderPassDepthStencilAttachment#view}
    * is read only.
    */
  var depthReadOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The store operation to perform on {@link GPURenderPassDepthStencilAttachment#view}'s
    * depth component after executing the render pass.
    * Note: It is recommended to prefer a clear-value; see {@link GPULoadOp#"load"}.
    */
  var depthStoreOp: js.UndefOr[GPUStoreOp] = js.undefined
  
  /**
    * Indicates the value to clear {@link GPURenderPassDepthStencilAttachment#view}'s stencil component
    * to prior to executing the render pass. Ignored if {@link GPURenderPassDepthStencilAttachment#stencilLoadOp}
    * is not {@link GPULoadOp#"clear"}.
    * The value will be converted to the type of the stencil aspect of `view` by taking the same
    * number of LSBs as the number of bits in the stencil aspect of one texel block of `view`.
    */
  var stencilClearValue: js.UndefOr[GPUStencilValue] = js.undefined
  
  /**
    * Indicates the load operation to perform on {@link GPURenderPassDepthStencilAttachment#view}'s
    * stencil component prior to executing the render pass.
    * Note: It is recommended to prefer clearing; see {@link GPULoadOp#"clear"} for details.
    */
  var stencilLoadOp: js.UndefOr[GPULoadOp] = js.undefined
  
  /**
    * Indicates that the stencil component of {@link GPURenderPassDepthStencilAttachment#view}
    * is read only.
    */
  var stencilReadOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The store operation to perform on {@link GPURenderPassDepthStencilAttachment#view}'s
    * stencil component after executing the render pass.
    */
  var stencilStoreOp: js.UndefOr[GPUStoreOp] = js.undefined
  
  /**
    * A {@link GPUTextureView} describing the texture subresource that will be output to
    * and read from for this depth/stencil attachment.
    */
  var view: GPUTextureView
}
object GPURenderPassDepthStencilAttachment {
  
  inline def apply(view: GPUTextureView): GPURenderPassDepthStencilAttachment = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPURenderPassDepthStencilAttachment]
  }
  
  extension [Self <: GPURenderPassDepthStencilAttachment](x: Self) {
    
    inline def setDepthClearValue(value: Double): Self = StObject.set(x, "depthClearValue", value.asInstanceOf[js.Any])
    
    inline def setDepthClearValueUndefined: Self = StObject.set(x, "depthClearValue", js.undefined)
    
    inline def setDepthLoadOp(value: GPULoadOp): Self = StObject.set(x, "depthLoadOp", value.asInstanceOf[js.Any])
    
    inline def setDepthLoadOpUndefined: Self = StObject.set(x, "depthLoadOp", js.undefined)
    
    inline def setDepthReadOnly(value: Boolean): Self = StObject.set(x, "depthReadOnly", value.asInstanceOf[js.Any])
    
    inline def setDepthReadOnlyUndefined: Self = StObject.set(x, "depthReadOnly", js.undefined)
    
    inline def setDepthStoreOp(value: GPUStoreOp): Self = StObject.set(x, "depthStoreOp", value.asInstanceOf[js.Any])
    
    inline def setDepthStoreOpUndefined: Self = StObject.set(x, "depthStoreOp", js.undefined)
    
    inline def setStencilClearValue(value: GPUStencilValue): Self = StObject.set(x, "stencilClearValue", value.asInstanceOf[js.Any])
    
    inline def setStencilClearValueUndefined: Self = StObject.set(x, "stencilClearValue", js.undefined)
    
    inline def setStencilLoadOp(value: GPULoadOp): Self = StObject.set(x, "stencilLoadOp", value.asInstanceOf[js.Any])
    
    inline def setStencilLoadOpUndefined: Self = StObject.set(x, "stencilLoadOp", js.undefined)
    
    inline def setStencilReadOnly(value: Boolean): Self = StObject.set(x, "stencilReadOnly", value.asInstanceOf[js.Any])
    
    inline def setStencilReadOnlyUndefined: Self = StObject.set(x, "stencilReadOnly", js.undefined)
    
    inline def setStencilStoreOp(value: GPUStoreOp): Self = StObject.set(x, "stencilStoreOp", value.asInstanceOf[js.Any])
    
    inline def setStencilStoreOpUndefined: Self = StObject.set(x, "stencilStoreOp", js.undefined)
    
    inline def setView(value: GPUTextureView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
