package typings.sylvester

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("$P")
@js.native
object P extends js.Object {
  /**
  * Constructor function.
  *
  * @param {Array<number>|Vector} anchor The anchor vector.
  * @param {Array<number>|Vector} normal The normal vector.
  */
  def apply(anchor: js.Array[Double], normal: js.Array[Double]): Plane = js.native
  def apply(anchor: js.Array[Double], normal: Vector): Plane = js.native
  /**
    * Constructor function.
    *
    * @param {Array<number>|Vector} anchor The anchor vector.
    * @param {Array<number>|Vector} v1 The first direction vector.
    * @param {Array<number>|Vecotr} v2 The second direction vector.
    */
  def apply(anchor: js.Array[Double], v1: js.Array[Double], v2: js.Array[Double]): Plane = js.native
  def apply(anchor: js.Array[Double], v1: js.Array[Double], v2: Vector): Plane = js.native
  def apply(anchor: js.Array[Double], v1: Vector, v2: js.Array[Double]): Plane = js.native
  def apply(anchor: js.Array[Double], v1: Vector, v2: Vector): Plane = js.native
  def apply(anchor: Vector, normal: js.Array[Double]): Plane = js.native
  def apply(anchor: Vector, normal: Vector): Plane = js.native
  def apply(anchor: Vector, v1: js.Array[Double], v2: js.Array[Double]): Plane = js.native
  def apply(anchor: Vector, v1: js.Array[Double], v2: Vector): Plane = js.native
  def apply(anchor: Vector, v1: Vector, v2: js.Array[Double]): Plane = js.native
  def apply(anchor: Vector, v1: Vector, v2: Vector): Plane = js.native
}

