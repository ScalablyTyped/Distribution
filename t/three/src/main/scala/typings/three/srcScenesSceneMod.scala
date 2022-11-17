package typings.three

import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcMathColorMod.Color
import typings.three.srcScenesFogMod.FogBase
import typings.three.srcTexturesTextureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcScenesSceneMod {
  
  @JSImport("three/src/scenes/Scene", "Scene")
  @js.native
  open class Scene () extends Object3D[Event] {
    
    /**
      * @default null
      */
    var background: Null | Color | Texture = js.native
    
    var backgroundBlurriness: Double = js.native
    
    /**
      * @default null
      */
    var environment: Null | Texture = js.native
    
    /**
      * A fog instance defining the type of fog that affects everything rendered in the scene. Default is null.
      * @default null
      */
    var fog: FogBase | Null = js.native
    
    val isScene: true = js.native
    
    /**
      * If not null, it will force everything in the scene to be rendered with that material. Default is null.
      * @default null
      */
    var overrideMaterial: Material | Null = js.native
    
    def toJSON(meta: Any): Any = js.native
    
    @JSName("type")
    var type_Scene: "Scene" = js.native
  }
}
