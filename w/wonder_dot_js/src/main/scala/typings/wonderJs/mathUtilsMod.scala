package typings.wonderJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/utils/MathUtils", JSImport.Namespace)
@js.native
object mathUtilsMod extends js.Object {
  @js.native
  class MathUtils () extends js.Object
  
  /* static members */
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
  
}

