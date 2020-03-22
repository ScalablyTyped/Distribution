package typings.three

import typings.three.geometryMod.Geometry
import typings.three.materialMod.Material
import typings.three.object3DMod.Object3D
import typings.three.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/Three.Legacy", JSImport.Namespace)
@js.native
object threeLegacyMod extends js.Object {
  @js.native
  sealed trait Colors extends js.Object
  
  val FaceColors: Colors = js.native
  val NoColors: Colors = js.native
  val VertexColors: Colors = js.native
  @js.native
  object Colors extends js.Object {
    @JSBracketAccess
    def apply(value: scala.Nothing): js.UndefOr[Colors with scala.Nothing] = js.native
  }
  
  @js.native
  object SceneUtils extends js.Object {
    def attach(child: Object3D, scene: Scene, parent: Object3D): Unit = js.native
    def createMultiMaterialObject(geometry: Geometry, materials: js.Array[Material]): Object3D = js.native
    def detach(child: Object3D, parent: Object3D, scene: Scene): Unit = js.native
  }
  
}

