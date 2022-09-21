package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPURenderPassColorAttachment extends StObject {
  
  /**
    * Indicates the value to clear {@link GPURenderPassColorAttachment#view} to prior to executing the
    * render pass. If not map/exist|provided defaults to `{r: 0, g: 0, b: 0, a: 0}`. Ignored
    * if {@link GPURenderPassColorAttachment#loadOp} is not {@link GPULoadOp#"clear"}.
    * The members of {@link GPURenderPassColorAttachment#clearValue} are all double values, so
    * they will first be converted to the fully qualified format type of
    * {@link GPURenderPassColorAttachment#view} before being set as the clear value of
    * {@link GPURenderPassColorAttachment#view}.
    * <div algorithm="clearValue to texture value">
    * Let `colorAttachmentFormat` be
    * {@link GPURenderPassColorAttachment#view}.{@link GPUTextureView#[[descriptor]]}.{@link GPUTextureViewDescriptor#format}.
    * `colorAttachmentFormat` has up to four components: `r`, `g`, `b`, and `a`, each
    * component containing one scalar value.
    * For each `componentType` of `colorAttachmentFormat` and corresponding component scalar
    * value `value` in {@link GPURenderPassColorAttachment#clearValue}:
    * 1. If `componentType` is a:
    * <dl class=switch>
    * : floating-point type or normalized type
    * Convert `value` converted to an IDL value|to an IDL value of type {{unrestricted float}} (`f32`).
    * : signed integer type
    * Convert `value` converted to an IDL value|to an IDL value of type {{long long}} (`i32`).
    * : unsigned integer type
    * Convert `value` converted to an IDL value|to an IDL value of type {{unsigned long long}} (`u32`).
    */
  var clearValue: js.UndefOr[GPUColor] = js.undefined
  
  var loadOp: GPULoadOp
  
  /**
    * A {@link GPUTextureView} describing the texture subresource that will receive the resolved
    * output for this color attachment if {@link GPURenderPassColorAttachment#view} is
    * multisampled.
    */
  var resolveTarget: js.UndefOr[GPUTextureView] = js.undefined
  
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
