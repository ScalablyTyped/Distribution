package typings.wonderJs

import typings.wonderJs.componentMod.Component
import typings.wonderJs.entityObjectMod.EntityObject
import typings.wonderJs.gameObjectMod.GameObject
import typings.wonderJs.rendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererComponentMod {
  
  @JSImport("wonder.js/dist/es2015/component/renderer/RendererComponent", "RendererComponent")
  @js.native
  abstract class RendererComponent () extends Component {
    
    def render(renderer: Renderer, target: EntityObject, camera: GameObject): Any = js.native
  }
}
