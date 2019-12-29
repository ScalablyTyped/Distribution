package typings.wonderDotJs

import typings.wonderDotJs.distEs2015RendererRendererRendererMod.Renderer
import typings.wonderDotJs.distEs2015StructureColorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/renderer/WebGLRenderer", JSImport.Namespace)
@js.native
object distEs2015RendererRendererWebGLRendererMod extends js.Object {
  @js.native
  class WebGLRenderer () extends Renderer {
    def setClearColor(color: Color): Unit = js.native
  }
  
  /* static members */
  @js.native
  object WebGLRenderer extends js.Object {
    def create(): WebGLRenderer = js.native
  }
  
}

