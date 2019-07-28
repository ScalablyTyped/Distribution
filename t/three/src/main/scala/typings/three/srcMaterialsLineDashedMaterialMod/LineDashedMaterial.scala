package typings.three.srcMaterialsLineDashedMaterialMod

import typings.three.srcMaterialsLineBasicMaterialMod.LineBasicMaterial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/LineDashedMaterial", "LineDashedMaterial")
@js.native
class LineDashedMaterial () extends LineBasicMaterial {
  def this(parameters: LineDashedMaterialParameters) = this()
  var dashSize: Double = js.native
  var gapSize: Double = js.native
  var isLineDashedMaterial: Boolean = js.native
  var scale: Double = js.native
  def setValues(parameters: LineDashedMaterialParameters): Unit = js.native
}

