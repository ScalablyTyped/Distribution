package typings.three.srcMaterialsLineBasicMaterialMod

import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcMathColorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/LineBasicMaterial", "LineBasicMaterial")
@js.native
class LineBasicMaterial () extends Material {
  def this(parameters: LineBasicMaterialParameters) = this()
  var color: Color = js.native
  var linecap: String = js.native
  var linejoin: String = js.native
  var linewidth: Double = js.native
  def setValues(parameters: LineBasicMaterialParameters): Unit = js.native
}

