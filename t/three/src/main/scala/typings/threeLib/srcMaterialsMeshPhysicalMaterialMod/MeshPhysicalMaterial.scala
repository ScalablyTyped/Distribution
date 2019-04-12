package typings
package threeLib.srcMaterialsMeshPhysicalMaterialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/MeshPhysicalMaterial", "MeshPhysicalMaterial")
@js.native
class MeshPhysicalMaterial protected ()
  extends threeLib.srcMaterialsMeshStandardMaterialMod.MeshStandardMaterial {
  def this(parameters: MeshPhysicalMaterialParameters) = this()
  var clearCoat: scala.Double = js.native
  var clearCoatRoughness: scala.Double = js.native
  var reflectivity: scala.Double = js.native
}

