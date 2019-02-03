package typings
package wonderDotJsLib.distEs2015CoreEntityObjectSceneGameObjectSceneGameObjectSceneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/core/entityObject/scene/gameObjectScene/GameObjectScene", "GameObjectScene")
@js.native
class GameObjectScene ()
  extends wonderDotJsLib.distEs2015CoreEntityObjectSceneSceneMod.Scene {
  var currentCamera: js.Any = js.native
  def addChild(child: wonderDotJsLib.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject): wonderDotJsLib.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject = js.native
  def render(renderer: wonderDotJsLib.distEs2015RendererRendererRendererMod.Renderer): scala.Unit = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/core/entityObject/scene/gameObjectScene/GameObjectScene", "GameObjectScene")
@js.native
object GameObjectScene extends js.Object {
  def create(): wonderDotJsLib.distEs2015CoreEntityObjectSceneGameObjectSceneGameObjectSceneMod.GameObjectScene = js.native
}

