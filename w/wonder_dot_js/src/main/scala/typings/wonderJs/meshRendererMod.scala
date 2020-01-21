package typings.wonderJs

import typings.wonderJs.gameObjectMod.GameObject
import typings.wonderJs.geometryMod.Geometry
import typings.wonderJs.quadCommandMod.QuadCommand
import typings.wonderJs.rendererComponentMod.RendererComponent
import typings.wonderJs.rendererMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/renderer/MeshRenderer", JSImport.Namespace)
@js.native
object meshRendererMod extends js.Object {
  @js.native
  class MeshRenderer () extends RendererComponent {
    @JSName("entityObject")
    var entityObject_MeshRenderer: GameObject = js.native
    /* protected */ def createDrawCommand(target: GameObject, geometry: Geometry, camera: GameObject): QuadCommand = js.native
    def render(renderer: Renderer, target: GameObject, camera: GameObject): Unit = js.native
  }
  
  /* static members */
  @js.native
  object MeshRenderer extends js.Object {
    def create(): MeshRenderer = js.native
  }
  
}

