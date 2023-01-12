package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUMultisampleState extends StObject {
  
  /**
    * When `true` indicates that a fragment's alpha channel should be used to generate a sample
    * coverage mask.
    */
  var alphaToCoverageEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Number of samples per pixel. This {@link GPURenderPipeline} will be compatible only
    * with attachment textures ({@link GPURenderPassDescriptor#colorAttachments}
    * and {@link GPURenderPassDescriptor#depthStencilAttachment})
    * with matching {@link GPUTextureDescriptor#sampleCount}s.
    */
  var count: js.UndefOr[GPUSize32] = js.undefined
  
  /**
    * Mask determining which samples are written to.
    */
  var mask: js.UndefOr[GPUSampleMask] = js.undefined
}
object GPUMultisampleState {
  
  inline def apply(): GPUMultisampleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPUMultisampleState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUMultisampleState] (val x: Self) extends AnyVal {
    
    inline def setAlphaToCoverageEnabled(value: Boolean): Self = StObject.set(x, "alphaToCoverageEnabled", value.asInstanceOf[js.Any])
    
    inline def setAlphaToCoverageEnabledUndefined: Self = StObject.set(x, "alphaToCoverageEnabled", js.undefined)
    
    inline def setCount(value: GPUSize32): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setMask(value: GPUSampleMask): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
  }
}
