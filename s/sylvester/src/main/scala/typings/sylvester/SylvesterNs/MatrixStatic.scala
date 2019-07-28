package typings.sylvester.SylvesterNs

import typings.sylvester.Matrix
import typings.sylvester.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatrixStatic extends js.Object {
  /**
    * Diagonal matrix - all off-diagonal elements are zero
    *
    * @param {any} elements The elements.
    */
  def Diagonal(elements: js.Array[js.Array[Double] | Double]): Matrix = js.native
  def Diagonal(elements: Matrix): Matrix = js.native
  def Diagonal(elements: Vector): Matrix = js.native
  /**
    * Identity matrix of size n.
    *
    * @param {number} n The size.
    */
  def I(n: Double): Matrix = js.native
  /**
    * Random matrix of n rows, m columns.
    *
    * @param {number} n The number of rows.
    * @param {number} m The number of columns.
    */
  def Random(n: Double, m: Double): Matrix = js.native
  /**
    * Rotation matrix about some axis. If no axis is supplied, assume we're after a 2D transform.
    *
    * @param {number} theta The angle in radians.
    * @param {Vector} a [Optional] The axis.
    */
  def Rotation(theta: Double): Matrix = js.native
  def Rotation(theta: Double, a: Vector): Matrix = js.native
  def RotationX(t: Double): Matrix = js.native
  def RotationY(t: Double): Matrix = js.native
  def RotationZ(t: Double): Matrix = js.native
  /**
    * Matrix filled with zeros.
    *
    * @param {number} n The number of rows.
    * @param {number} m The number of columns.
    */
  def Zero(n: Double, m: Double): Matrix = js.native
  /**
    * Constructor function.
    *
    * @param {Array<number>|Array<Array<number>>|Vector|Matrix} elements The elements.
    */
  def create(elements: js.Array[js.Array[Double] | Double]): Matrix = js.native
  def create(elements: Matrix): Matrix = js.native
  def create(elements: Vector): Matrix = js.native
}

