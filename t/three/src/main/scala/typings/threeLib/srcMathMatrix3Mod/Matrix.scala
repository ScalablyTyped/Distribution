package typings
package threeLib.srcMathMatrix3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matrix extends js.Object {
  /**
  	 * Array with matrix values.
  	 */
  var elements: js.Array[scala.Double] = js.native
  /**
  	 * copy(m:T):T;
  	 */
  def copy(m: this.type): this.type = js.native
  def determinant(): scala.Double = js.native
  /**
  	 * getInverse(matrix:T, throwOnInvertible?:boolean):T;
  	 */
  def getInverse(matrix: Matrix): Matrix = js.native
  def getInverse(matrix: Matrix, throwOnInvertible: scala.Boolean): Matrix = js.native
  /**
  	 * identity():T;
  	 */
  def identity(): Matrix = js.native
  /**
  	 * multiplyScalar(s:number):T;
  	 */
  def multiplyScalar(s: scala.Double): Matrix = js.native
  /**
  	 * transpose():T;
  	 */
  def transpose(): Matrix = js.native
}

