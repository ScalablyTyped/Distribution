package typings
package threeDashTdsDashLoaderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attach extends js.Object {
  def attach(
    child: threeLib.srcCoreObject3DMod.Object3D,
    scene: threeLib.srcScenesSceneMod.Scene,
    parent: threeLib.srcCoreObject3DMod.Object3D
  ): scala.Unit
  def createMultiMaterialObject(
    geometry: threeLib.srcCoreGeometryMod.Geometry,
    materials: js.Array[threeLib.srcMaterialsMaterialMod.Material]
  ): threeLib.srcCoreObject3DMod.Object3D
  def detach(
    child: threeLib.srcCoreObject3DMod.Object3D,
    parent: threeLib.srcCoreObject3DMod.Object3D,
    scene: threeLib.srcScenesSceneMod.Scene
  ): scala.Unit
}

object Anon_Attach {
  @scala.inline
  def apply(
    attach: (threeLib.srcCoreObject3DMod.Object3D, threeLib.srcScenesSceneMod.Scene, threeLib.srcCoreObject3DMod.Object3D) => scala.Unit,
    createMultiMaterialObject: (threeLib.srcCoreGeometryMod.Geometry, js.Array[threeLib.srcMaterialsMaterialMod.Material]) => threeLib.srcCoreObject3DMod.Object3D,
    detach: (threeLib.srcCoreObject3DMod.Object3D, threeLib.srcCoreObject3DMod.Object3D, threeLib.srcScenesSceneMod.Scene) => scala.Unit
  ): Anon_Attach = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction3(attach), createMultiMaterialObject = js.Any.fromFunction2(createMultiMaterialObject), detach = js.Any.fromFunction3(detach))
  
    __obj.asInstanceOf[Anon_Attach]
  }
}

