package typings.wonderJs

import typings.wonderJs.componentMod.Component
import typings.wonderJs.entityObjectMod.EntityObject
import typings.wonderJs.gameObjectMod.GameObject
import typings.wonderJs.rendererMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/renderer/RendererComponent", JSImport.Namespace)
@js.native
object rendererComponentMod extends js.Object {
  @js.native
  abstract class RendererComponent () extends Component {
    def render(renderer: Renderer, target: EntityObject, camera: GameObject): js.Any = js.native
  }
  
}

