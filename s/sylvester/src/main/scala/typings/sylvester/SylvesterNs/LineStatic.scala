package typings.sylvester.SylvesterNs

import typings.sylvester.Line
import typings.sylvester.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineStatic extends js.Object {
  var X: Line = js.native
  var Y: Line = js.native
  var Z: Line = js.native
  /**
    * Constructor function.
    *
    * @param Array<number>|Vector anchor The anchor vector.
    * @param Array<number>|Vector direction The direction vector.
    */
  def create(anchor: js.Array[Double], direction: js.Array[Double]): Line = js.native
  def create(anchor: js.Array[Double], direction: Vector): Line = js.native
  def create(anchor: Vector, direction: js.Array[Double]): Line = js.native
  def create(anchor: Vector, direction: Vector): Line = js.native
}

