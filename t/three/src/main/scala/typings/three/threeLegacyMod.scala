package typings.three

import typings.three.geometryMod.Geometry
import typings.three.materialMod.Material
import typings.three.object3DMod.Object3D
import typings.three.sceneMod.Scene
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object threeLegacyMod {
  
  @JSImport("three/src/Three.Legacy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Colors extends StObject
  object Colors {
    
    inline def apply(value: scala.Nothing): js.UndefOr[Colors & scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("Colors")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Colors & scala.Nothing]]
  }
  
  @JSImport("three/src/Three.Legacy", "FaceColors")
  @js.native
  val FaceColors: Colors = js.native
  
  @JSImport("three/src/Three.Legacy", "MultiMaterial")
  @js.native
  class MultiMaterial () extends Material {
    def this(materials: js.Array[Material]) = this()
    
    val isMultiMaterial: `true` = js.native
    
    var materials: js.Array[Material] = js.native
  }
  
  @JSImport("three/src/Three.Legacy", "NoColors")
  @js.native
  val NoColors: Colors = js.native
  
  object SceneUtils {
    
    @JSImport("three/src/Three.Legacy", "SceneUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attach(child: Object3D, scene: Scene, parent: Object3D): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(child.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def createMultiMaterialObject(geometry: Geometry, materials: js.Array[Material]): Object3D = (^.asInstanceOf[js.Dynamic].applyDynamic("createMultiMaterialObject")(geometry.asInstanceOf[js.Any], materials.asInstanceOf[js.Any])).asInstanceOf[Object3D]
    
    inline def detach(child: Object3D, parent: Object3D, scene: Scene): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detach")(child.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("three/src/Three.Legacy", "VertexColors")
  @js.native
  val VertexColors: Colors = js.native
}
