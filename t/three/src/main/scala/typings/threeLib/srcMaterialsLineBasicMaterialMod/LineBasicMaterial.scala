package typings
package threeLib.srcMaterialsLineBasicMaterialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/LineBasicMaterial", "LineBasicMaterial")
@js.native
class LineBasicMaterial ()
  extends threeLib.srcMaterialsMaterialMod.Material {
  def this(parameters: LineBasicMaterialParameters) = this()
  var color: threeLib.srcMathColorMod.Color = js.native
  var linecap: java.lang.String = js.native
  var linejoin: java.lang.String = js.native
  var linewidth: scala.Double = js.native
  def setValues(parameters: LineBasicMaterialParameters): scala.Unit = js.native
}

