package typings.three.lineBasicMaterialMod

import typings.three.colorMod.Color
import typings.three.materialMod.Material
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/materials/LineBasicMaterial", "LineBasicMaterial")
@js.native
class LineBasicMaterial () extends Material {
  def this(parameters: LineBasicMaterialParameters) = this()
  var color: Color = js.native
  var linecap: String = js.native
  var linejoin: String = js.native
  var linewidth: Double = js.native
  var morphTargets: Boolean = js.native
  def setValues(parameters: LineBasicMaterialParameters): Unit = js.native
}

