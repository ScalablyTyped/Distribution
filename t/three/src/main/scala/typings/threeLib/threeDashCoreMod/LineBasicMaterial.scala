package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "LineBasicMaterial")
@js.native
class LineBasicMaterial () extends Material {
  def this(parameters: LineBasicMaterialParameters) = this()
  var color: Color = js.native
  var linecap: java.lang.String = js.native
  var linejoin: java.lang.String = js.native
  var linewidth: scala.Double = js.native
  def setValues(parameters: LineBasicMaterialParameters): scala.Unit = js.native
}

