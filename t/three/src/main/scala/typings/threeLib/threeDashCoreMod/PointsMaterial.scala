package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "PointsMaterial")
@js.native
class PointsMaterial () extends Material {
  def this(parameters: PointsMaterialParameters) = this()
  var color: Color = js.native
  var map: Texture | scala.Null = js.native
  var size: scala.Double = js.native
  var sizeAttenuation: scala.Boolean = js.native
  def setValues(parameters: PointsMaterialParameters): scala.Unit = js.native
}

