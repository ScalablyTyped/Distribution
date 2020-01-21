package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/numeric/special_math/ellints", JSImport.Namespace)
@js.native
object ellintsMod extends js.Object {
  @JSName("comp_ellint_1")
  def compEllint1(k: Double): Double = js.native
  @JSName("comp_ellint_2")
  def compEllint2(k: Double): Double = js.native
  @JSName("comp_ellint_3")
  def compEllint3(k: Double, n: Double): Double = js.native
  @JSName("ellint_1")
  def ellint1(k: Double, phi: Double): Double = js.native
  @JSName("ellint_2")
  def ellint2(k: Double, phi: Double): Double = js.native
  @JSName("ellint_3")
  def ellint3(k: Double, v: Double, phi: Double): Double = js.native
}

