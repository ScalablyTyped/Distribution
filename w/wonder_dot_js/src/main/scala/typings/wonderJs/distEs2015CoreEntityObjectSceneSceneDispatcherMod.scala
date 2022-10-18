package typings.wonderJs

import typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject
import typings.wonderJs.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject
import typings.wonderJs.distEs2015CoreEntityObjectSceneGameObjectSceneGameObjectSceneMod.GameObjectScene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015CoreEntityObjectSceneSceneDispatcherMod {
  
  @JSImport("wonder.js/dist/es2015/core/entityObject/scene/SceneDispatcher", "SceneDispatcher")
  @js.native
  open class SceneDispatcher () extends EntityObject {
    
    def addChildren(children: js.Array[EntityObject]): Any = js.native
    def addChildren(
      children: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<EntityObject> */ Any
    ): Any = js.native
    def addChildren(children: EntityObject): Any = js.native
    
    var currentCamera: GameObject = js.native
    
    var gameObjectScene: GameObjectScene = js.native
  }
  /* static members */
  object SceneDispatcher {
    
    @JSImport("wonder.js/dist/es2015/core/entityObject/scene/SceneDispatcher", "SceneDispatcher")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): SceneDispatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SceneDispatcher]
  }
}
