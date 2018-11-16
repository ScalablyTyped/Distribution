package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matrix extends js.Object {
  /**
       * Float32Array with matrix values.
       */
  var elements: stdLib.Float32Array = js.native
  /**
       * copy(m:T):T;
       */
  def copy(m: this.type): this.type = js.native
  def determinant(): scala.Double = js.native
  /**
       * getInverse(matrix:T, throwOnInvertible?:boolean):T;
       */
  def getInverse(matrix: Matrix): Matrix = js.native
  /**
       * getInverse(matrix:T, throwOnInvertible?:boolean):T;
       */
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

