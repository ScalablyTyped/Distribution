package typings
package wonderDotJsLib.distEs2015CoreEntityObjectSceneSceneDispatcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/core/entityObject/scene/SceneDispatcher", "SceneDispatcher")
@js.native
class SceneDispatcher ()
  extends wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject {
  var currentCamera: wonderDotJsLib.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject = js.native
  var gameObjectScene: wonderDotJsLib.distEs2015CoreEntityObjectSceneGameObjectSceneGameObjectSceneMod.GameObjectScene = js.native
  def addChildren(
    children: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Collection<EntityObject> */ js.Any
  ): js.Any = js.native
  def addChildren(children: js.Array[wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject]): js.Any = js.native
  def addChildren(children: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject): js.Any = js.native
}

@JSImport("wonder.js/dist/es2015/core/entityObject/scene/SceneDispatcher", "SceneDispatcher")
@js.native
object SceneDispatcher extends js.Object {
  def create(): wonderDotJsLib.distEs2015CoreEntityObjectSceneSceneDispatcherMod.SceneDispatcher = js.native
}

