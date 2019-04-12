package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/Three.Legacy", JSImport.Namespace)
@js.native
object srcThreeDotLegacyMod extends js.Object {
  @JSName("SceneUtils")
  @js.native
  object SceneUtilsNs extends js.Object {
    def attach(
      child: threeLib.srcCoreObject3DMod.Object3D,
      scene: threeLib.srcScenesSceneMod.Scene,
      parent: threeLib.srcCoreObject3DMod.Object3D
    ): scala.Unit = js.native
    def createMultiMaterialObject(
      geometry: threeLib.srcCoreGeometryMod.Geometry,
      materials: js.Array[threeLib.srcMaterialsMaterialMod.Material]
    ): threeLib.srcCoreObject3DMod.Object3D = js.native
    def detach(
      child: threeLib.srcCoreObject3DMod.Object3D,
      parent: threeLib.srcCoreObject3DMod.Object3D,
      scene: threeLib.srcScenesSceneMod.Scene
    ): scala.Unit = js.native
  }
  
}

