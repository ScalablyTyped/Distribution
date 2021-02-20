package typings.three

import typings.three.geometryMod.Geometry
import typings.three.materialMod.Material
import typings.three.object3DMod.Object3D
import typings.three.sceneMod.Scene
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object threeLegacyMod {
  
  @js.native
  sealed trait Colors extends StObject
  @JSImport("three/src/Three.Legacy", "Colors")
  @js.native
  def Colors(value: scala.Nothing): js.UndefOr[Colors with scala.Nothing] = js.native
  
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
    
    @JSImport("three/src/Three.Legacy", "SceneUtils.attach")
    @js.native
    def attach(child: Object3D, scene: Scene, parent: Object3D): Unit = js.native
    
    @JSImport("three/src/Three.Legacy", "SceneUtils.createMultiMaterialObject")
    @js.native
    def createMultiMaterialObject(geometry: Geometry, materials: js.Array[Material]): Object3D = js.native
    
    @JSImport("three/src/Three.Legacy", "SceneUtils.detach")
    @js.native
    def detach(child: Object3D, parent: Object3D, scene: Scene): Unit = js.native
  }
  
  @JSImport("three/src/Three.Legacy", "VertexColors")
  @js.native
  val VertexColors: Colors = js.native
}
