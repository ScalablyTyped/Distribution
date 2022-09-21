package typings.webxr.global

import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("XRWebGLSubImage")
@js.native
abstract class XRWebGLSubImage ()
  extends StObject
     with typings.webxr.XRWebGLSubImage {
  
  /* CompleteClass */
  override val colorTexture: WebGLTexture = js.native
  
  /* CompleteClass */
  override val depthStencilTexture: WebGLTexture = js.native
  
  /* CompleteClass */
  override val imageIndex: Double = js.native
  
  /* CompleteClass */
  override val textureHeight: Double = js.native
  
  /* CompleteClass */
  override val textureWidth: Double = js.native
  
  /* CompleteClass */
  override val viewport: typings.webxr.XRViewport = js.native
}
