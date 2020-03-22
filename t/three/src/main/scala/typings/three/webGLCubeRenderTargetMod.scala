package typings.three

import typings.three.textureMod.Texture
import typings.three.webGLRenderTargetMod.WebGLRenderTarget
import typings.three.webGLRenderTargetMod.WebGLRenderTargetOptions
import typings.three.webGLRendererMod.WebGLRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/WebGLCubeRenderTarget", JSImport.Namespace)
@js.native
object webGLCubeRenderTargetMod extends js.Object {
  @js.native
  class WebGLCubeRenderTarget protected () extends WebGLRenderTarget {
    def this(size: Double) = this()
    def this(size: Double, options: WebGLRenderTargetOptions) = this()
    def fromEquirectangularTexture(renderer: WebGLRenderer, texture: Texture): this.type = js.native
  }
  
}

