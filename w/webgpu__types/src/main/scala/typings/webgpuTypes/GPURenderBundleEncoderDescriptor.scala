package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPURenderBundleEncoderDescriptor
  extends StObject
     with GPURenderPassLayout {
  
  /**
    * If `true`, indicates that the render bundle does not modify the depth component of the
    * {@link GPURenderPassDepthStencilAttachment} of any render pass the render bundle is executed
    * in.
    */
  var depthReadOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, indicates that the render bundle does not modify the stencil component of the
    * {@link GPURenderPassDepthStencilAttachment} of any render pass the render bundle is executed
    * in.
    */
  var stencilReadOnly: js.UndefOr[Boolean] = js.undefined
}
object GPURenderBundleEncoderDescriptor {
  
  inline def apply(colorFormats: js.Iterable[GPUTextureFormat | Null]): GPURenderBundleEncoderDescriptor = {
    val __obj = js.Dynamic.literal(colorFormats = colorFormats.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPURenderBundleEncoderDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPURenderBundleEncoderDescriptor] (val x: Self) extends AnyVal {
    
    inline def setDepthReadOnly(value: Boolean): Self = StObject.set(x, "depthReadOnly", value.asInstanceOf[js.Any])
    
    inline def setDepthReadOnlyUndefined: Self = StObject.set(x, "depthReadOnly", js.undefined)
    
    inline def setStencilReadOnly(value: Boolean): Self = StObject.set(x, "stencilReadOnly", value.asInstanceOf[js.Any])
    
    inline def setStencilReadOnlyUndefined: Self = StObject.set(x, "stencilReadOnly", js.undefined)
  }
}
