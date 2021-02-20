package typings.titanium.Titanium.UI

import typings.titanium.Titanium.Proxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * Gets the value of the <Titanium.UI.Matrix2D.a> property.
    * @deprecated Access <Titanium.UI.Matrix2D.a> instead.
    */
  def getA(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Matrix2D.b> property.
    * @deprecated Access <Titanium.UI.Matrix2D.b> instead.
    */
  def getB(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Matrix2D.c> property.
    * @deprecated Access <Titanium.UI.Matrix2D.c> instead.
    */
  def getC(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Matrix2D.d> property.
    * @deprecated Access <Titanium.UI.Matrix2D.d> instead.
    */
  def getD(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Matrix2D.tx> property.
    * @deprecated Access <Titanium.UI.Matrix2D.tx> instead.
    */
  def getTx(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Matrix2D.ty> property.
    * @deprecated Access <Titanium.UI.Matrix2D.ty> instead.
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
    * Returns a `Matrix2D` object that specifies a scaling animation from one scale to another.
    */
  def scale(sx: Double, sy: Double): Matrix2D = js.native
  def scale(sx: Double, sy: Double, toSx: js.UndefOr[scala.Nothing], toSy: Double): Matrix2D = js.native
  def scale(sx: Double, sy: Double, toSx: Double): Matrix2D = js.native
  def scale(sx: Double, sy: Double, toSx: Double, toSy: Double): Matrix2D = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Matrix2D.a> property.
    * @deprecated Set the value using <Titanium.UI.Matrix2D.a> instead.
    */
  def setA(a: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Matrix2D.b> property.
    * @deprecated Set the value using <Titanium.UI.Matrix2D.b> instead.
    */
  def setB(b: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Matrix2D.c> property.
    * @deprecated Set the value using <Titanium.UI.Matrix2D.c> instead.
    */
  def setC(c: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Matrix2D.d> property.
    * @deprecated Set the value using <Titanium.UI.Matrix2D.d> instead.
    */
  def setD(d: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Matrix2D.tx> property.
    * @deprecated Set the value using <Titanium.UI.Matrix2D.tx> instead.
    */
  def setTx(tx: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Matrix2D.ty> property.
    * @deprecated Set the value using <Titanium.UI.Matrix2D.ty> instead.
    */
  def setTy(ty: Double): Unit = js.native
  
  /**
    * Returns a matrix constructed by applying a translation transform to this matrix.
    */
  def translate(tx: Double, ty: Double): Matrix2D = js.native
  
  /**
    * The entry at position [3,1] in the matrix.
    */
  var tx: Double = js.native
  
  /**
    * The entry at position [3,2] in the matrix.
    */
  var ty: Double = js.native
}
