package typings
package threeLib.srcMaterialsPointsMaterialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/PointsMaterial", "PointsMaterial")
@js.native
class PointsMaterial ()
  extends threeLib.srcMaterialsMaterialMod.Material {
  def this(parameters: PointsMaterialParameters) = this()
  var color: threeLib.srcMathColorMod.Color = js.native
  var map: threeLib.srcTexturesTextureMod.Texture | scala.Null = js.native
  var size: scala.Double = js.native
  var sizeAttenuation: scala.Boolean = js.native
  def setValues(parameters: PointsMaterialParameters): scala.Unit = js.native
}

