package typings.three

import typings.three.srcCoreGeometryMod.Geometry
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcScenesSceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/Three.Legacy", JSImport.Namespace)
@js.native
object srcThreeDotLegacyMod extends js.Object {
  @JSName("SceneUtils")
  @js.native
  object SceneUtilsNs extends js.Object {
    def attach(child: Object3D, scene: Scene, parent: Object3D): Unit = js.native
    def createMultiMaterialObject(geometry: Geometry, materials: js.Array[Material]): Object3D = js.native
    def detach(child: Object3D, parent: Object3D, scene: Scene): Unit = js.native
  }
  
}

