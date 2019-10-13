package typings.wonderDotJs

import typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject
import typings.wonderDotJs.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject
import typings.wonderDotJs.distEs2015CoreEntityObjectSceneGameObjectSceneGameObjectSceneMod.GameObjectScene
import typings.wonderDotJs.distEs2015RendererRendererRendererMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/core/entityObject/scene/gameObjectScene/GameObjectScene", JSImport.Namespace)
@js.native
object distEs2015CoreEntityObjectSceneGameObjectSceneGameObjectSceneMod extends js.Object {
  @js.native
  class GameObjectScene () extends EntityObject {
    var currentCamera: js.Any = js.native
    def addChild(child: GameObject): GameObject = js.native
    def render(renderer: Renderer): Unit = js.native
  }
  
  /* static members */
  @js.native
  object GameObjectScene extends js.Object {
    def create(): GameObjectScene = js.native
  }
  
}

