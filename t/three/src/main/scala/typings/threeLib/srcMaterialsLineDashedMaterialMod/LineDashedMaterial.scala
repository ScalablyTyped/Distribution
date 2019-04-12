package typings
package threeLib.srcMaterialsLineDashedMaterialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/LineDashedMaterial", "LineDashedMaterial")
@js.native
class LineDashedMaterial ()
  extends threeLib.srcMaterialsLineBasicMaterialMod.LineBasicMaterial {
  def this(parameters: LineDashedMaterialParameters) = this()
  var dashSize: scala.Double = js.native
  var gapSize: scala.Double = js.native
  var isLineDashedMaterial: scala.Boolean = js.native
  var scale: scala.Double = js.native
  def setValues(parameters: LineDashedMaterialParameters): scala.Unit = js.native
}

