package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPURenderPassDescriptor
  extends StObject
     with GPUObjectDescriptorBase {
  
  /**
    * The set of {@link GPURenderPassColorAttachment} values in this sequence defines which
    * color attachments will be output to when executing this render pass.
    * Due to compatible usage list|usage compatibility, no color attachment
    * may alias another attachment or any resource used inside the render pass.
    */
  var colorAttachments: js.Iterable[GPURenderPassColorAttachment | Null]
  
  /**
    * The {@link GPURenderPassDepthStencilAttachment} value that defines the depth/stencil
    * attachment that will be output to and tested against when executing this render pass.
    * Due to compatible usage list|usage compatibility, no writable depth/stencil attachment
    * may alias another attachment or any resource used inside the render pass.
    */
  var depthStencilAttachment: js.UndefOr[GPURenderPassDepthStencilAttachment] = js.undefined
  
  /**
    * The maximum number of draw calls that will be done in the render pass. Used by some
    * implementations to size work injected before the render pass. Keeping the default value
    * is a good default, unless it is known that more draw calls will be done.
    */
  var maxDrawCount: js.UndefOr[GPUSize64] = js.undefined
  
  /**
    * The {@link GPUQuerySet} value defines where the occlusion query results will be stored for this pass.
    */
  var occlusionQuerySet: js.UndefOr[GPUQuerySet] = js.undefined
  
  /**
    * Defines which timestamp values will be written for this pass, and where to write them to.
    */
  var timestampWrites: js.UndefOr[GPURenderPassTimestampWrites] = js.undefined
}
object GPURenderPassDescriptor {
  
  inline def apply(colorAttachments: js.Iterable[GPURenderPassColorAttachment | Null]): GPURenderPassDescriptor = {
    val __obj = js.Dynamic.literal(colorAttachments = colorAttachments.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPURenderPassDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPURenderPassDescriptor] (val x: Self) extends AnyVal {
    
    inline def setColorAttachments(value: js.Iterable[GPURenderPassColorAttachment | Null]): Self = StObject.set(x, "colorAttachments", value.asInstanceOf[js.Any])
    
    inline def setDepthStencilAttachment(value: GPURenderPassDepthStencilAttachment): Self = StObject.set(x, "depthStencilAttachment", value.asInstanceOf[js.Any])
    
    inline def setDepthStencilAttachmentUndefined: Self = StObject.set(x, "depthStencilAttachment", js.undefined)
    
    inline def setMaxDrawCount(value: GPUSize64): Self = StObject.set(x, "maxDrawCount", value.asInstanceOf[js.Any])
    
    inline def setMaxDrawCountUndefined: Self = StObject.set(x, "maxDrawCount", js.undefined)
    
    inline def setOcclusionQuerySet(value: GPUQuerySet): Self = StObject.set(x, "occlusionQuerySet", value.asInstanceOf[js.Any])
    
    inline def setOcclusionQuerySetUndefined: Self = StObject.set(x, "occlusionQuerySet", js.undefined)
    
    inline def setTimestampWrites(value: GPURenderPassTimestampWrites): Self = StObject.set(x, "timestampWrites", value.asInstanceOf[js.Any])
    
    inline def setTimestampWritesUndefined: Self = StObject.set(x, "timestampWrites", js.undefined)
  }
}
