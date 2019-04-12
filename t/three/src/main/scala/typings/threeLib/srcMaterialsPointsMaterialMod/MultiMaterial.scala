package typings
package threeLib.srcMaterialsPointsMaterialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/PointsMaterial", "MultiMaterial")
@js.native
class MultiMaterial ()
  extends threeLib.srcMaterialsMaterialMod.Material {
  def this(materials: js.Array[threeLib.srcMaterialsMaterialMod.Material]) = this()
  var isMultiMaterial: threeLib.threeLibNumbers.`true` = js.native
  var materials: js.Array[threeLib.srcMaterialsMaterialMod.Material] = js.native
}

