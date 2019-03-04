package typings
package threeLib

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
    attach: js.Function3[
      threeLib.threeDashCoreMod.Object3D, 
      threeLib.threeDashCoreMod.Scene, 
      threeLib.threeDashCoreMod.Object3D, 
      scala.Unit
    ],
    createMultiMaterialObject: js.Function2[
      threeLib.threeDashCoreMod.Geometry, 
      js.Array[threeLib.threeDashCoreMod.Material], 
      threeLib.threeDashCoreMod.Object3D
    ],
    detach: js.Function3[
      threeLib.threeDashCoreMod.Object3D, 
      threeLib.threeDashCoreMod.Object3D, 
      threeLib.threeDashCoreMod.Scene, 
      scala.Unit
    ]
  ): Anon_Attach = {
    val __obj = js.Dynamic.literal(attach = attach, createMultiMaterialObject = createMultiMaterialObject, detach = detach)
  
    __obj.asInstanceOf[Anon_Attach]
  }
}

