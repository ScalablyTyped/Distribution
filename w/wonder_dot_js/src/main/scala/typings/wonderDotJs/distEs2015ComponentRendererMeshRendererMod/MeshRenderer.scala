package typings.wonderDotJs.distEs2015ComponentRendererMeshRendererMod

import typings.wonderDotJs.distEs2015ComponentGeometryGeometryMod.Geometry
import typings.wonderDotJs.distEs2015ComponentRendererRendererComponentMod.RendererComponent
import typings.wonderDotJs.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject
import typings.wonderDotJs.distEs2015RendererCommandQuadCommandMod.QuadCommand
import typings.wonderDotJs.distEs2015RendererRendererRendererMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/renderer/MeshRenderer", "MeshRenderer")
@js.native
class MeshRenderer () extends RendererComponent {
  @JSName("entityObject")
  var entityObject_MeshRenderer: GameObject = js.native
  /* protected */ def createDrawCommand(target: GameObject, geometry: Geometry, camera: GameObject): QuadCommand = js.native
  def render(renderer: Renderer, target: GameObject, camera: GameObject): Unit = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/component/renderer/MeshRenderer", "MeshRenderer")
@js.native
object MeshRenderer extends js.Object {
  def create(): MeshRenderer = js.native
}

