package typings.webxr.global

import typings.std.GLenum
import typings.std.WebGLRenderbuffer
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("OCULUS_multiview")
@js.native
abstract class OCULUSMultiview ()
  extends StObject
     with typings.webxr.OCULUSMultiview {
  
  /* CompleteClass */
  override val FRAMEBUFFER_ATTACHMENT_TEXTURE_BASE_VIEW_INDEX_OVR: Double = js.native
  
  /* CompleteClass */
  override val FRAMEBUFFER_ATTACHMENT_TEXTURE_NUM_VIEWS_OVR: Double = js.native
  
  /* CompleteClass */
  override val FRAMEBUFFER_INCOMPLETE_VIEW_TARGETS_OVR: Double = js.native
  
  /* CompleteClass */
  override val MAX_VIEWS_OVR: Double = js.native
  
  /* CompleteClass */
  override def framebufferTextureMultiviewOVR(
    target: GLenum,
    attachment: GLenum,
    texture: WebGLTexture,
    level: Double,
    baseViewIndex: Double,
    numViews: Double
  ): WebGLRenderbuffer = js.native
}
