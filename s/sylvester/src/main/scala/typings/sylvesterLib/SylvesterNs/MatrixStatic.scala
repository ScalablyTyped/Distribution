package typings
package sylvesterLib.SylvesterNs

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
  def Diagonal(elements: js.Array[js.Array[scala.Double] | scala.Double]): sylvesterLib.Matrix = js.native
  def Diagonal(elements: sylvesterLib.Matrix): sylvesterLib.Matrix = js.native
  def Diagonal(elements: sylvesterLib.Vector): sylvesterLib.Matrix = js.native
  /**
    * Identity matrix of size n.
    *
    * @param {number} n The size.
    */
  def I(n: scala.Double): sylvesterLib.Matrix = js.native
  /**
    * Random matrix of n rows, m columns.
    *
    * @param {number} n The number of rows.
    * @param {number} m The number of columns.
    */
  def Random(n: scala.Double, m: scala.Double): sylvesterLib.Matrix = js.native
  /**
    * Rotation matrix about some axis. If no axis is supplied, assume we're after a 2D transform.
    *
    * @param {number} theta The angle in radians.
    * @param {Vector} a [Optional] The axis.
    */
  def Rotation(theta: scala.Double): sylvesterLib.Matrix = js.native
  def Rotation(theta: scala.Double, a: sylvesterLib.Vector): sylvesterLib.Matrix = js.native
  def RotationX(t: scala.Double): sylvesterLib.Matrix = js.native
  def RotationY(t: scala.Double): sylvesterLib.Matrix = js.native
  def RotationZ(t: scala.Double): sylvesterLib.Matrix = js.native
  /**
    * Matrix filled with zeros.
    *
    * @param {number} n The number of rows.
    * @param {number} m The number of columns.
    */
  def Zero(n: scala.Double, m: scala.Double): sylvesterLib.Matrix = js.native
  /**
    * Constructor function.
    *
    * @param {Array<number>|Array<Array<number>>|Vector|Matrix} elements The elements.
    */
  def create(elements: js.Array[js.Array[scala.Double] | scala.Double]): sylvesterLib.Matrix = js.native
  def create(elements: sylvesterLib.Matrix): sylvesterLib.Matrix = js.native
  def create(elements: sylvesterLib.Vector): sylvesterLib.Matrix = js.native
}

