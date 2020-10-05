package typings.three.matrix3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  	 * getInverse(matrix:T):T;
  	 */
  def getInverse(matrix: Matrix): Matrix = js.native
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

object Matrix {
  @scala.inline
  def apply(
    copy: Matrix => Matrix,
    determinant: () => Double,
    elements: js.Array[Double],
    getInverse: Matrix => Matrix,
    identity: () => Matrix,
    multiplyScalar: Double => Matrix,
    transpose: () => Matrix
  ): Matrix = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction1(copy), determinant = js.Any.fromFunction0(determinant), elements = elements.asInstanceOf[js.Any], getInverse = js.Any.fromFunction1(getInverse), identity = js.Any.fromFunction0(identity), multiplyScalar = js.Any.fromFunction1(multiplyScalar), transpose = js.Any.fromFunction0(transpose))
    __obj.asInstanceOf[Matrix]
  }
  @scala.inline
  implicit class MatrixOps[Self <: Matrix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCopy(value: Matrix => Matrix): Self = this.set("copy", js.Any.fromFunction1(value))
    @scala.inline
    def setDeterminant(value: () => Double): Self = this.set("determinant", js.Any.fromFunction0(value))
    @scala.inline
    def setElementsVarargs(value: Double*): Self = this.set("elements", js.Array(value :_*))
    @scala.inline
    def setElements(value: js.Array[Double]): Self = this.set("elements", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetInverse(value: Matrix => Matrix): Self = this.set("getInverse", js.Any.fromFunction1(value))
    @scala.inline
    def setIdentity(value: () => Matrix): Self = this.set("identity", js.Any.fromFunction0(value))
    @scala.inline
    def setMultiplyScalar(value: Double => Matrix): Self = this.set("multiplyScalar", js.Any.fromFunction1(value))
    @scala.inline
    def setTranspose(value: () => Matrix): Self = this.set("transpose", js.Any.fromFunction0(value))
  }
  
}

