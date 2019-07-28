package typings.three.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Euler")
@js.native
class Euler ()
  extends typings.three.srcMathEulerMod.Euler {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Double, z: Double, order: String) = this()
}

/* static members */
@JSImport("three", "Euler")
@js.native
object Euler extends js.Object {
  var DefaultOrder: String = js.native
  var RotationOrders: js.Array[String] = js.native
}

