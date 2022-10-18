package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPURenderPassColorAttachment extends StObject {
  
  /**
    * Indicates the value to clear {@link GPURenderPassColorAttachment#view} to prior to executing the
    * render pass. If not map/exist|provided, defaults to `{r: 0, g: 0, b: 0, a: 0}`. Ignored
    * if {@link GPURenderPassColorAttachment#loadOp} is not {@link GPULoadOp#"clear"}.
    * The components of {@link GPURenderPassColorAttachment#clearValue} are all double values.
    * They are converted [$to a texel value of texture format$] matching the render attachment.
    * If conversion fails, a validation error is generated.
    */
  var clearValue: js.UndefOr[GPUColor] = js.undefined
  
  /**
    * Indicates the load operation to perform on {@link GPURenderPassColorAttachment#view} prior to
    * executing the render pass.
    * Note: It is recommended to prefer clearing; see {@link GPULoadOp#"clear"} for details.
    */
  var loadOp: GPULoadOp
  
  /**
    * A {@link GPUTextureView} describing the texture subresource that will receive the resolved
    * output for this color attachment if {@link GPURenderPassColorAttachment#view} is
    * multisampled.
    */
  var resolveTarget: js.UndefOr[GPUTextureView] = js.undefined
  
  /**
    * The store operation to perform on {@link GPURenderPassColorAttachment#view}
    * after executing the render pass.
    */
  var storeOp: GPUStoreOp
  
  /**
    * A {@link GPUTextureView} describing the texture subresource that will be output to for this
    * color attachment.
    */
  var view: GPUTextureView
}
object GPURenderPassColorAttachment {
  
  inline def apply(loadOp: GPULoadOp, storeOp: GPUStoreOp, view: GPUTextureView): GPURenderPassColorAttachment = {
    val __obj = js.Dynamic.literal(loadOp = loadOp.asInstanceOf[js.Any], storeOp = storeOp.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPURenderPassColorAttachment]
  }
  
  extension [Self <: GPURenderPassColorAttachment](x: Self) {
    
    inline def setClearValue(value: GPUColor): Self = StObject.set(x, "clearValue", value.asInstanceOf[js.Any])
    
    inline def setClearValueUndefined: Self = StObject.set(x, "clearValue", js.undefined)
    
    inline def setLoadOp(value: GPULoadOp): Self = StObject.set(x, "loadOp", value.asInstanceOf[js.Any])
    
    inline def setResolveTarget(value: GPUTextureView): Self = StObject.set(x, "resolveTarget", value.asInstanceOf[js.Any])
    
    inline def setResolveTargetUndefined: Self = StObject.set(x, "resolveTarget", js.undefined)
    
    inline def setStoreOp(value: GPUStoreOp): Self = StObject.set(x, "storeOp", value.asInstanceOf[js.Any])
    
    inline def setView(value: GPUTextureView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
