package typings.webxr

import typings.std.GLenum
import typings.std.WebGLRenderbuffer
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OVRMultiview2 extends StObject {
  
  val FRAMEBUFFER_ATTACHMENT_TEXTURE_BASE_VIEW_INDEX_OVR: Double
  
  val FRAMEBUFFER_ATTACHMENT_TEXTURE_NUM_VIEWS_OVR: Double
  
  val FRAMEBUFFER_INCOMPLETE_VIEW_TARGETS_OVR: Double
  
  val MAX_VIEWS_OVR: Double
  
  def framebufferTextureMultiviewOVR(
    target: GLenum,
    attachment: GLenum,
    texture: WebGLTexture,
    level: Double,
    baseViewIndex: Double,
    numViews: Double
  ): WebGLRenderbuffer
}
object OVRMultiview2 {
  
  inline def apply(
    FRAMEBUFFER_ATTACHMENT_TEXTURE_BASE_VIEW_INDEX_OVR: Double,
    FRAMEBUFFER_ATTACHMENT_TEXTURE_NUM_VIEWS_OVR: Double,
    FRAMEBUFFER_INCOMPLETE_VIEW_TARGETS_OVR: Double,
    MAX_VIEWS_OVR: Double,
    framebufferTextureMultiviewOVR: (GLenum, GLenum, WebGLTexture, Double, Double, Double) => WebGLRenderbuffer
  ): OVRMultiview2 = {
    val __obj = js.Dynamic.literal(FRAMEBUFFER_ATTACHMENT_TEXTURE_BASE_VIEW_INDEX_OVR = FRAMEBUFFER_ATTACHMENT_TEXTURE_BASE_VIEW_INDEX_OVR.asInstanceOf[js.Any], FRAMEBUFFER_ATTACHMENT_TEXTURE_NUM_VIEWS_OVR = FRAMEBUFFER_ATTACHMENT_TEXTURE_NUM_VIEWS_OVR.asInstanceOf[js.Any], FRAMEBUFFER_INCOMPLETE_VIEW_TARGETS_OVR = FRAMEBUFFER_INCOMPLETE_VIEW_TARGETS_OVR.asInstanceOf[js.Any], MAX_VIEWS_OVR = MAX_VIEWS_OVR.asInstanceOf[js.Any], framebufferTextureMultiviewOVR = js.Any.fromFunction6(framebufferTextureMultiviewOVR))
    __obj.asInstanceOf[OVRMultiview2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OVRMultiview2] (val x: Self) extends AnyVal {
    
    inline def setFRAMEBUFFER_ATTACHMENT_TEXTURE_BASE_VIEW_INDEX_OVR(value: Double): Self = StObject.set(x, "FRAMEBUFFER_ATTACHMENT_TEXTURE_BASE_VIEW_INDEX_OVR", value.asInstanceOf[js.Any])
    
    inline def setFRAMEBUFFER_ATTACHMENT_TEXTURE_NUM_VIEWS_OVR(value: Double): Self = StObject.set(x, "FRAMEBUFFER_ATTACHMENT_TEXTURE_NUM_VIEWS_OVR", value.asInstanceOf[js.Any])
    
    inline def setFRAMEBUFFER_INCOMPLETE_VIEW_TARGETS_OVR(value: Double): Self = StObject.set(x, "FRAMEBUFFER_INCOMPLETE_VIEW_TARGETS_OVR", value.asInstanceOf[js.Any])
    
    inline def setFramebufferTextureMultiviewOVR(value: (GLenum, GLenum, WebGLTexture, Double, Double, Double) => WebGLRenderbuffer): Self = StObject.set(x, "framebufferTextureMultiviewOVR", js.Any.fromFunction6(value))
    
    inline def setMAX_VIEWS_OVR(value: Double): Self = StObject.set(x, "MAX_VIEWS_OVR", value.asInstanceOf[js.Any])
  }
}
