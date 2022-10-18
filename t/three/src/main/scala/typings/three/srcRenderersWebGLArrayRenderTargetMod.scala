package typings.three

import typings.three.srcRenderersWebGLRenderTargetMod.WebGLRenderTarget
import typings.three.srcTexturesDataArrayTextureMod.DataArrayTexture
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersWebGLArrayRenderTargetMod {
  
  @JSImport("three/src/renderers/WebGLArrayRenderTarget", "WebGLArrayRenderTarget")
  @js.native
  open class WebGLArrayRenderTarget protected () extends WebGLRenderTarget {
    /**
      * Creates a new WebGLArrayRenderTarget.
      *
      * @param width the width of the render target, in pixels.
      * @param height the height of the render target, in pixels.
      * @param depth the depth/layer count of the render target.
      */
    def this(width: Double, height: Double, depth: Double) = this()
    
    val isWebGLArrayRenderTarget: `true` = js.native
    
    /**
      * The texture property is overwritten with an instance of {@link DataArrayTexture}.
      */
    @JSName("texture")
    var texture_WebGLArrayRenderTarget: DataArrayTexture = js.native
  }
}
