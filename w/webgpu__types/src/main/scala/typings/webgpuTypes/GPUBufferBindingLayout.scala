package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUBufferBindingLayout extends StObject {
  
  /**
    * Indicates whether this binding requires a dynamic offset.
    */
  var hasDynamicOffset: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates the minimum buffer binding size.
    * Bindings are always validated against this size in {@link GPUDevice#createBindGroup}.
    * If this *is not* `0`, pipeline creation additionally [$validating shader binding|validates$]
    * that this value is large enough for the bindings declared in the shader.
    * If this *is* `0`, draw/dispatch commands additionally [$Validate encoder bind groups|validate$]
    * that each binding in the {@link GPUBindGroup} is large enough for the bindings declared in the shader.
    * Note:
    * Similar execution-time validation is theoretically possible for other
    * binding-related fields specified for early validation, like
    * {@link GPUTextureBindingLayout#sampleType} and {@link GPUStorageTextureBindingLayout#format},
    * which currently can only be validated in pipeline creation.
    * However, such execution-time validation could be costly or unnecessarily complex, so it is
    * available only for {@link GPUBufferBindingLayout#minBindingSize} which is expected to have the
    * most ergonomic impact.
    */
  var minBindingSize: js.UndefOr[GPUSize64] = js.undefined
  
  /**
    * Indicates the type required for buffers bound to this bindings.
    */
  var `type`: js.UndefOr[GPUBufferBindingType] = js.undefined
}
object GPUBufferBindingLayout {
  
  inline def apply(): GPUBufferBindingLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPUBufferBindingLayout]
  }
  
  extension [Self <: GPUBufferBindingLayout](x: Self) {
    
    inline def setHasDynamicOffset(value: Boolean): Self = StObject.set(x, "hasDynamicOffset", value.asInstanceOf[js.Any])
    
    inline def setHasDynamicOffsetUndefined: Self = StObject.set(x, "hasDynamicOffset", js.undefined)
    
    inline def setMinBindingSize(value: GPUSize64): Self = StObject.set(x, "minBindingSize", value.asInstanceOf[js.Any])
    
    inline def setMinBindingSizeUndefined: Self = StObject.set(x, "minBindingSize", js.undefined)
    
    inline def setType(value: GPUBufferBindingType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
