package typings.wonderJs

import typings.wonderJs.gameObjectMod.GameObject
import typings.wonderJs.rendererMod.Renderer
import typings.wonderJs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gameObjectSceneMod {
  
  @JSImport("wonder.js/dist/es2015/core/entityObject/scene/gameObjectScene/GameObjectScene", "GameObjectScene")
  @js.native
  class GameObjectScene () extends Scene {
    
    def addChild(child: GameObject): GameObject = js.native
    
    var currentCamera: js.Any = js.native
    
    def render(renderer: Renderer): Unit = js.native
  }
  /* static members */
  object GameObjectScene {
    
    @JSImport("wonder.js/dist/es2015/core/entityObject/scene/gameObjectScene/GameObjectScene", "GameObjectScene")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): GameObjectScene = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[GameObjectScene]
  }
}
