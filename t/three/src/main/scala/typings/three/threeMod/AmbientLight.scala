package typings.three.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "AmbientLight")
@js.native
/**
	 * This creates a Ambientlight with a color.
	 * @param color Numeric value of the RGB component of the color or a Color instance.
	 */
class AmbientLight ()
  extends typings.three.srcLightsAmbientLightMod.AmbientLight {
  def this(color: String) = this()
  def this(color: Double) = this()
  def this(color: typings.three.srcMathColorMod.Color) = this()
  def this(color: String, intensity: Double) = this()
  def this(color: Double, intensity: Double) = this()
  def this(color: typings.three.srcMathColorMod.Color, intensity: Double) = this()
}

