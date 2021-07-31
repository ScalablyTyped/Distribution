package typings.wonderJs

import typings.wonderJs.gameObjectMod.GameObject
import typings.wonderJs.geometryMod.Geometry
import typings.wonderJs.quadCommandMod.QuadCommand
import typings.wonderJs.rendererComponentMod.RendererComponent
import typings.wonderJs.rendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshRendererMod {
  
  @JSImport("wonder.js/dist/es2015/component/renderer/MeshRenderer", "MeshRenderer")
  @js.native
  class MeshRenderer () extends RendererComponent {
    
    /* protected */ def createDrawCommand(target: GameObject, geometry: Geometry, camera: GameObject): QuadCommand = js.native
    
    @JSName("entityObject")
    var entityObject_MeshRenderer: GameObject = js.native
    
    def render(renderer: Renderer, target: GameObject, camera: GameObject): Unit = js.native
  }
  /* static members */
  object MeshRenderer {
    
    @JSImport("wonder.js/dist/es2015/component/renderer/MeshRenderer", "MeshRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(): MeshRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[MeshRenderer]
  }
}
