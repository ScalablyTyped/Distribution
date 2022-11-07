package typings.three

import typings.three.srcRenderersWebGLRenderTargetMod.WebGLRenderTarget
import typings.three.srcRenderersWebGLRenderTargetMod.WebGLRenderTargetOptions
import typings.three.srcRenderersWebGLRendererMod.WebGLRenderer
import typings.three.srcTexturesCubeTextureMod.CubeTexture
import typings.three.srcTexturesTextureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersWebGLCubeRenderTargetMod {
  
  @JSImport("three/src/renderers/WebGLCubeRenderTarget", "WebGLCubeRenderTarget")
  @js.native
  open class WebGLCubeRenderTarget () extends WebGLRenderTarget {
    def this(size: Double) = this()
    def this(size: Double, options: WebGLRenderTargetOptions) = this()
    def this(size: Unit, options: WebGLRenderTargetOptions) = this()
    
    def clear(renderer: WebGLRenderer, color: Boolean, depth: Boolean, stencil: Boolean): Unit = js.native
    
    def fromEquirectangularTexture(renderer: WebGLRenderer, texture: Texture): this.type = js.native
    
    @JSName("texture")
    var texture_WebGLCubeRenderTarget: CubeTexture = js.native
  }
}
