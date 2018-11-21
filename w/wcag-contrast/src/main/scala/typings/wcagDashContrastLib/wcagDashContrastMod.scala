package typings
package wcagDashContrastLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wcag-contrast", JSImport.Namespace)
@js.native
object wcagDashContrastMod extends js.Object {
  def hex(a: java.lang.String, b: java.lang.String): scala.Double = js.native
  def luminance(a: scala.Double, b: scala.Double): scala.Double = js.native
  def rgb(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  def score(contrast: scala.Double): java.lang.String = js.native
}

