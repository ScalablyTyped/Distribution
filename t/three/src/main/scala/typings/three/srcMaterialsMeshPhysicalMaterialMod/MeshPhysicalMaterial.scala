package typings.three.srcMaterialsMeshPhysicalMaterialMod

import typings.three.srcMaterialsMeshStandardMaterialMod.MeshStandardMaterial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/MeshPhysicalMaterial", "MeshPhysicalMaterial")
@js.native
class MeshPhysicalMaterial protected () extends MeshStandardMaterial {
  def this(parameters: MeshPhysicalMaterialParameters) = this()
  var clearCoat: Double = js.native
  var clearCoatRoughness: Double = js.native
  var reflectivity: Double = js.native
}

