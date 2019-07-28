package typings.wonderDotJs.distEs2015CoreEntityObjectSceneGameObjectSceneGameObjectSceneMod

import typings.wonderDotJs.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject
import typings.wonderDotJs.distEs2015CoreEntityObjectSceneSceneMod.Scene
import typings.wonderDotJs.distEs2015RendererRendererRendererMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/core/entityObject/scene/gameObjectScene/GameObjectScene", "GameObjectScene")
@js.native
class GameObjectScene () extends Scene {
  var currentCamera: js.Any = js.native
  def addChild(child: GameObject): GameObject = js.native
  def render(renderer: Renderer): Unit = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/core/entityObject/scene/gameObjectScene/GameObjectScene", "GameObjectScene")
@js.native
object GameObjectScene extends js.Object {
  def create(): GameObjectScene = js.native
}

