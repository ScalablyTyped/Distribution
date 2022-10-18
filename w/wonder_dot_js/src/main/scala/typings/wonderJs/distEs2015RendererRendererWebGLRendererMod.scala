package typings.wonderJs

import typings.wonderJs.distEs2015RendererRendererRendererMod.Renderer
import typings.wonderJs.distEs2015StructureColorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015RendererRendererWebGLRendererMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/renderer/WebGLRenderer", "WebGLRenderer")
  @js.native
  open class WebGLRenderer () extends Renderer {
    
    def setClearColor(color: Color): Unit = js.native
  }
  /* static members */
  object WebGLRenderer {
    
    @JSImport("wonder.js/dist/es2015/renderer/renderer/WebGLRenderer", "WebGLRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): WebGLRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[WebGLRenderer]
  }
}
