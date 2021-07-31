package typings.wonderJs

import typings.wonderJs.entityObjectMod.EntityObject
import typings.wonderJs.gameObjectMod.GameObject
import typings.wonderJs.gameObjectSceneMod.GameObjectScene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sceneDispatcherMod {
  
  @JSImport("wonder.js/dist/es2015/core/entityObject/scene/SceneDispatcher", "SceneDispatcher")
  @js.native
  class SceneDispatcher () extends EntityObject {
    
    def addChildren(
      children: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<EntityObject> */ js.Any
    ): js.Any = js.native
    def addChildren(children: js.Array[EntityObject]): js.Any = js.native
    def addChildren(children: EntityObject): js.Any = js.native
    
    var currentCamera: GameObject = js.native
    
    var gameObjectScene: GameObjectScene = js.native
  }
  /* static members */
  object SceneDispatcher {
    
    @JSImport("wonder.js/dist/es2015/core/entityObject/scene/SceneDispatcher", "SceneDispatcher")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(): SceneDispatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SceneDispatcher]
  }
}
