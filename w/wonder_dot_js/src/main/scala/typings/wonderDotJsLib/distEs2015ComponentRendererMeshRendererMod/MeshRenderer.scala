package typings
package wonderDotJsLib.distEs2015ComponentRendererMeshRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/renderer/MeshRenderer", "MeshRenderer")
@js.native
class MeshRenderer ()
  extends wonderDotJsLib.distEs2015ComponentRendererRendererComponentMod.RendererComponent {
  @JSName("entityObject")
  var entityObject_MeshRenderer: wonderDotJsLib.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject = js.native
  /* protected */ def createDrawCommand(
    target: wonderDotJsLib.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject,
    geometry: wonderDotJsLib.distEs2015ComponentGeometryGeometryMod.Geometry,
    camera: wonderDotJsLib.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject
  ): wonderDotJsLib.distEs2015RendererCommandQuadCommandMod.QuadCommand = js.native
  def render(
    renderer: wonderDotJsLib.distEs2015RendererRendererRendererMod.Renderer,
    target: wonderDotJsLib.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject,
    camera: wonderDotJsLib.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject
  ): scala.Unit = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/component/renderer/MeshRenderer", "MeshRenderer")
@js.native
object MeshRenderer extends js.Object {
  def create(): wonderDotJsLib.distEs2015ComponentRendererMeshRendererMod.MeshRenderer = js.native
}

