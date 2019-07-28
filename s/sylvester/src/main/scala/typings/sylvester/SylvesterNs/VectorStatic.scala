package typings.sylvester.SylvesterNs

import typings.sylvester.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorStatic extends js.Object {
  var i: Vector = js.native
  var j: Vector = js.native
  var k: Vector = js.native
  /**
    * Random vector of size n.
    *
    * @param {number} n The vector size.
    */
  def Random(n: Double): Vector = js.native
  /**
    * Vector filled with zeros.
    *
    * @param {number} n The vector size.
    */
  def Zero(n: Double): Vector = js.native
  def create(elements: js.Array[Double]): Vector = js.native
  /**
    * Constructor function.
    */
  def create(elements: Vector): Vector = js.native
}

