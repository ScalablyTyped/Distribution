package typings.three.srcMathMatrix3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matrix extends js.Object {
  /**
  	 * Array with matrix values.
  	 */
  var elements: js.Array[Double] = js.native
  /**
  	 * copy(m:T):T;
  	 */
  def copy(m: this.type): this.type = js.native
  def determinant(): Double = js.native
  /**
  	 * getInverse(matrix:T, throwOnInvertible?:boolean):T;
  	 */
  def getInverse(matrix: Matrix): Matrix = js.native
  def getInverse(matrix: Matrix, throwOnInvertible: Boolean): Matrix = js.native
  /**
  	 * identity():T;
  	 */
  def identity(): Matrix = js.native
  /**
  	 * multiplyScalar(s:number):T;
  	 */
  def multiplyScalar(s: Double): Matrix = js.native
  /**
  	 * transpose():T;
  	 */
  def transpose(): Matrix = js.native
}

