package typings.three.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "SceneUtils")
@js.native
object SceneUtils extends js.Object {
  def attach(
    child: typings.three.srcCoreObject3DMod.Object3D,
    scene: typings.three.srcScenesSceneMod.Scene,
    parent: typings.three.srcCoreObject3DMod.Object3D
  ): Unit = js.native
  def createMultiMaterialObject(
    geometry: typings.three.srcCoreGeometryMod.Geometry,
    materials: js.Array[typings.three.srcMaterialsMaterialMod.Material]
  ): typings.three.srcCoreObject3DMod.Object3D = js.native
  def detach(
    child: typings.three.srcCoreObject3DMod.Object3D,
    parent: typings.three.srcCoreObject3DMod.Object3D,
    scene: typings.three.srcScenesSceneMod.Scene
  ): Unit = js.native
}

