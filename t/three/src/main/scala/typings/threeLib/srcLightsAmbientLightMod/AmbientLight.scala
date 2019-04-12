package typings
package threeLib.srcLightsAmbientLightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/AmbientLight", "AmbientLight")
@js.native
/**
  * This creates a Ambientlight with a color.
  * @param color Numeric value of the RGB component of the color or a Color instance.
  */
class AmbientLight ()
  extends threeLib.srcLightsLightMod.Light {
  def this(color: java.lang.String) = this()
  def this(color: scala.Double) = this()
  def this(color: threeLib.srcMathColorMod.Color) = this()
  def this(color: java.lang.String, intensity: scala.Double) = this()
  def this(color: scala.Double, intensity: scala.Double) = this()
  def this(color: threeLib.srcMathColorMod.Color, intensity: scala.Double) = this()
}

