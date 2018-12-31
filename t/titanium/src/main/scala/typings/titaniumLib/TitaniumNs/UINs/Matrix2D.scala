package typings
package titaniumLib.TitaniumNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The 2D Matrix is an object for holding values for an affine transformation matrix.
		 */
@js.native
trait Matrix2D
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * The entry at position [1,1] in the matrix.
  			 */
  var a: scala.Double = js.native
  /**
  			 * The entry at position [1,2] in the matrix.
  			 */
  var b: scala.Double = js.native
  /**
  			 * The entry at position [2,1] in the matrix.
  			 */
  var c: scala.Double = js.native
  /**
  			 * The entry at position [2,2] in the matrix.
  			 */
  var d: scala.Double = js.native
  /**
  			 * The entry at position [3,1] in the matrix.
  			 */
  var tx: scala.Double = js.native
  /**
  			 * The entry at position [3,2] in the matrix.
  			 */
  var ty: scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.2DMatrix.a> property.
  			 */
  def getA(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.2DMatrix.b> property.
  			 */
  def getB(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.2DMatrix.c> property.
  			 */
  def getC(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.2DMatrix.d> property.
  			 */
  def getD(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.2DMatrix.tx> property.
  			 */
  def getTx(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.2DMatrix.ty> property.
  			 */
  def getTy(): scala.Double = js.native
  /**
  			 * Returns a matrix constructed by inverting this matrix.
  			 */
  def invert(): Matrix2D = js.native
  /**
  			 * Returns a matrix constructed by combining two existing matrices.
  			 */
  def multiply(t2: Matrix2D): Matrix2D = js.native
  /**
  			 * Returns a matrix constructed by rotating this matrix.
  			 */
  def rotate(angle: scala.Double): Matrix2D = js.native
  def rotate(angle: scala.Double, toAngle: scala.Double): Matrix2D = js.native
  /**
  			 * Returns a `2DMatrix` object that specifies a scaling animation from one scale to another.
  			 */
  def scale(sx: scala.Double, sy: scala.Double): Matrix2D = js.native
  def scale(sx: scala.Double, sy: scala.Double, toSx: scala.Double): Matrix2D = js.native
  def scale(sx: scala.Double, sy: scala.Double, toSx: scala.Double, toSy: scala.Double): Matrix2D = js.native
  /**
  			 * Sets the value of the <Titanium.UI.2DMatrix.a> property.
  			 */
  def setA(a: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.2DMatrix.b> property.
  			 */
  def setB(b: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.2DMatrix.c> property.
  			 */
  def setC(c: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.2DMatrix.d> property.
  			 */
  def setD(d: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.2DMatrix.tx> property.
  			 */
  def setTx(tx: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.2DMatrix.ty> property.
  			 */
  def setTy(ty: scala.Double): scala.Unit = js.native
  /**
  			 * Returns a matrix constructed by applying a translation transform to this matrix.
  			 */
  def translate(tx: scala.Double, ty: scala.Double): Matrix2D = js.native
}

