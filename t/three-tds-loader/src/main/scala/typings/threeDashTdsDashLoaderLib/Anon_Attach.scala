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

object Anon_Attach {
  @scala.inline
  def apply(
    attach: (threeLib.threeDashCoreMod.Object3D, threeLib.threeDashCoreMod.Scene, threeLib.threeDashCoreMod.Object3D) => scala.Unit,
    createMultiMaterialObject: (threeLib.threeDashCoreMod.Geometry, js.Array[threeLib.threeDashCoreMod.Material]) => threeLib.threeDashCoreMod.Object3D,
    detach: (threeLib.threeDashCoreMod.Object3D, threeLib.threeDashCoreMod.Object3D, threeLib.threeDashCoreMod.Scene) => scala.Unit
  ): Anon_Attach = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction3(attach), createMultiMaterialObject = js.Any.fromFunction2(createMultiMaterialObject), detach = js.Any.fromFunction3(detach))
  
    __obj.asInstanceOf[Anon_Attach]
  }
}

