package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLTextures", JSImport.Namespace)
@js.native
object webGLTexturesMod extends js.Object {
  @js.native
  class WebGLTextures protected () extends js.Object {
    def this(
      gl: js.Any,
      extensions: js.Any,
      state: js.Any,
      properties: js.Any,
      capabilities: js.Any,
      paramThreeToGL: js.Function,
      info: js.Any
    ) = this()
    def setTexture2D(texture: js.Any, slot: Double): Unit = js.native
    def setTextureCube(texture: js.Any, slot: Double): Unit = js.native
    def setTextureCubeDynamic(texture: js.Any, slot: Double): Unit = js.native
    def setupRenderTarget(renderTarget: js.Any): Unit = js.native
    def updateRenderTargetMipmap(renderTarget: js.Any): Unit = js.native
  }
  
}

