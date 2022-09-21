package typings.three

import typings.three.data3DTextureMod.Data3DTexture
import typings.three.threeBooleans.`true`
import typings.three.webGLRenderTargetMod.WebGLRenderTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGL3DRenderTargetMod {
  
  @JSImport("three/src/renderers/WebGL3DRenderTarget", "WebGL3DRenderTarget")
  @js.native
  open class WebGL3DRenderTarget protected () extends WebGLRenderTarget {
    /**
      * Creates a new WebGL3DRenderTarget.
      *
      * @param width the width of the render target, in pixels.
      * @param height the height of the render target, in pixels.
      * @param depth the depth of the render target.
      */
    def this(width: Double, height: Double, depth: Double) = this()
    
    val isWebGL3DRenderTarget: `true` = js.native
    
    /**
      * The texture property is overwritten with an instance of {@link Data3DTexture}.
      */
    @JSName("texture")
    var texture_WebGL3DRenderTarget: Data3DTexture = js.native
  }
}
