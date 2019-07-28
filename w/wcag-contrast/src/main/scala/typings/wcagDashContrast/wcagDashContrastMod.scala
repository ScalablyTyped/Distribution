package typings.wcagDashContrast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wcag-contrast", JSImport.Namespace)
@js.native
object wcagDashContrastMod extends js.Object {
  def hex(a: String, b: String): Double = js.native
  def luminance(a: Double, b: Double): Double = js.native
  def rgb(a: js.Array[Double], b: js.Array[Double]): Double = js.native
  def score(contrast: Double): String = js.native
}

