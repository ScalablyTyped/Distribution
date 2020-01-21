package typings.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "SceneUtils")
@js.native
object SceneUtils extends js.Object {
  def attach(
    child: typings.three.object3DMod.Object3D,
    scene: typings.three.sceneMod.Scene,
    parent: typings.three.object3DMod.Object3D
  ): Unit = js.native
  def createMultiMaterialObject(
    geometry: typings.three.geometryMod.Geometry,
    materials: js.Array[typings.three.materialMod.Material]
  ): typings.three.object3DMod.Object3D = js.native
  def detach(
    child: typings.three.object3DMod.Object3D,
    parent: typings.three.object3DMod.Object3D,
    scene: typings.three.sceneMod.Scene
  ): Unit = js.native
}

