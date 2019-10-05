package typings.sylvester

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("$M")
@js.native
object $M extends js.Object {
  /**
  * Constructor function.
  *
  * @param {Array<number>|Array<Array<number>>|Vector|Matrix} elements The elements.
  */
  def apply(elements: js.Array[js.Array[Double] | Double]): Matrix = js.native
  def apply(elements: Matrix): Matrix = js.native
  def apply(elements: Vector): Matrix = js.native
}

