package typings.wonderDotJs.distEs2015CoreEntityObjectSceneSceneDispatcherMod

import typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject
import typings.wonderDotJs.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject
import typings.wonderDotJs.distEs2015CoreEntityObjectSceneGameObjectSceneGameObjectSceneMod.GameObjectScene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/core/entityObject/scene/SceneDispatcher", "SceneDispatcher")
@js.native
class SceneDispatcher () extends EntityObject {
  var currentCamera: GameObject = js.native
  var gameObjectScene: GameObjectScene = js.native
  def addChildren(
    children: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Collection<EntityObject> */ js.Any
  ): js.Any = js.native
  def addChildren(children: js.Array[EntityObject]): js.Any = js.native
  def addChildren(children: EntityObject): js.Any = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/core/entityObject/scene/SceneDispatcher", "SceneDispatcher")
@js.native
object SceneDispatcher extends js.Object {
  def create(): SceneDispatcher = js.native
}

