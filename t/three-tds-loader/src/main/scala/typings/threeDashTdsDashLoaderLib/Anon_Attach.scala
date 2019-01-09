package typings
package threeDashTdsDashLoaderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attach extends js.Object {
  def attach(
    child: threeLib.threeDashCoreMod.Object3D,
    scene: threeLib.threeDashCoreMod.Scene,
    parent: threeLib.threeDashCoreMod.Object3D
  ): scala.Unit
  def createMultiMaterialObject(
    geometry: threeLib.threeDashCoreMod.Geometry,
    materials: js.Array[threeLib.threeDashCoreMod.Material]
  ): threeLib.threeDashCoreMod.Object3D
  def detach(
    child: threeLib.threeDashCoreMod.Object3D,
    parent: threeLib.threeDashCoreMod.Object3D,
    scene: threeLib.threeDashCoreMod.Scene
  ): scala.Unit
}

