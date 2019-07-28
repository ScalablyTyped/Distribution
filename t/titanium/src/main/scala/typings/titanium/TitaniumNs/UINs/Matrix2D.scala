package typings.titanium.TitaniumNs.UINs

import typings.titanium.TitaniumNs.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The 2D Matrix is an object for holding values for an affine transformation matrix.
		 */
@js.native
trait Matrix2D extends Proxy {
  /**
  			 * The entry at position [1,1] in the matrix.
  			 */
  var a: Double = js.native
  /**
  			 * The entry at position [1,2] in the matrix.
  			 */
  var b: Double = js.native
  /**
  			 * The entry at position [2,1] in the matrix.
  			 */
  var c: Double = js.native
  /**
  			 * The entry at position [2,2] in the matrix.
  			 */
  var d: Double = js.native
  /**
  			 * The entry at position [3,1] in the matrix.
  			 */
  var tx: Double = js.native
  /**
  			 * The entry at position [3,2] in the matrix.
  			 */
  var ty: Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.2DMatrix.a> property.
  			 */
  def getA(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.2DMatrix.b> property.
  			 */
  def getB(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.2DMatrix.c> property.
  			 */
  def getC(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.2DMatrix.d> property.
  			 */
  def getD(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.2DMatrix.tx> property.
  			 */
  def getTx(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.2DMatrix.ty> property.
  			 */
  def getTy(): Double = js.native
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
  def rotate(angle: Double): Matrix2D = js.native
  def rotate(angle: Double, toAngle: Double): Matrix2D = js.native
  /**
  			 * Returns a `2DMatrix` object that specifies a scaling animation from one scale to another.
  			 */
  def scale(sx: Double, sy: Double): Matrix2D = js.native
  def scale(sx: Double, sy: Double, toSx: Double): Matrix2D = js.native
  def scale(sx: Double, sy: Double, toSx: Double, toSy: Double): Matrix2D = js.native
  /**
  			 * Sets the value of the <Titanium.UI.2DMatrix.a> property.
  			 */
  def setA(a: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.2DMatrix.b> property.
  			 */
  def setB(b: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.2DMatrix.c> property.
  			 */
  def setC(c: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.2DMatrix.d> property.
  			 */
  def setD(d: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.2DMatrix.tx> property.
  			 */
  def setTx(tx: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.2DMatrix.ty> property.
  			 */
  def setTy(ty: Double): Unit = js.native
  /**
  			 * Returns a matrix constructed by applying a translation transform to this matrix.
  			 */
  def translate(tx: Double, ty: Double): Matrix2D = js.native
}

