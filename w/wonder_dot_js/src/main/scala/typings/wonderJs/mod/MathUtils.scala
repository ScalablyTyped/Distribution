package typings.wonderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "MathUtils")
@js.native
class MathUtils ()
  extends typings.wonderJs.mathUtilsMod.MathUtils

/* static members */
@JSImport("wonder.js/dist/es2015", "MathUtils")
@js.native
object MathUtils extends js.Object {
  def bigThan(num: Double, below: Double): Double = js.native
  def clamp(num: Double, below: Double, up: Double): Double = js.native
  def generateInteger(min: Double, max: Double): Double = js.native
  def generateMinToMax(min: Double, max: Double): Double = js.native
  def generateZeroToOne(): Double = js.native
  def maxFloorIntegralMultiple(a: Double, b: Double): Double = js.native
  def mod(a: Double, b: Double): Double = js.native
}

