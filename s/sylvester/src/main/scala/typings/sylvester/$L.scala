package typings.sylvester

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("$L")
@js.native
object $L extends js.Object {
  /**
  * Constructor function.
  *
  * @param Array<number>|Vector anchor The anchor vector.
  * @param Array<number>|Vector direction The direction vector.
  */
  def apply(anchor: js.Array[Double], direction: js.Array[Double]): Line = js.native
  def apply(anchor: js.Array[Double], direction: Vector): Line = js.native
  def apply(anchor: Vector, direction: js.Array[Double]): Line = js.native
  def apply(anchor: Vector, direction: Vector): Line = js.native
}

