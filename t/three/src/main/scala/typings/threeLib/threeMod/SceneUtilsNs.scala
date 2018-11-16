package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "SceneUtils")
@js.native
object SceneUtilsNs extends js.Object {
  def attach(
    child: threeLib.threeDashCoreMod.Object3D,
    scene: threeLib.threeDashCoreMod.Scene,
    parent: threeLib.threeDashCoreMod.Object3D
  ): scala.Unit = js.native
  def createMultiMaterialObject(
    geometry: threeLib.threeDashCoreMod.Geometry,
    materials: js.Array[threeLib.threeDashCoreMod.Material]
  ): threeLib.threeDashCoreMod.Object3D = js.native
  def detach(
    child: threeLib.threeDashCoreMod.Object3D,
    parent: threeLib.threeDashCoreMod.Object3D,
    scene: threeLib.threeDashCoreMod.Scene
  ): scala.Unit = js.native
}

