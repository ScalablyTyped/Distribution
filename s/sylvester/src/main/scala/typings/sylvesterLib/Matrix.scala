package typings
package sylvesterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matrix extends js.Object {
  /**
       * Gets a nested array containing the matrix's elements.
       */
  var elements: js.Array[js.Array[scala.Double]] = js.native
  /**
       * Returns the result of adding the argument to the matrix.
       *
       * @param {Matrix} matrix The matrix to add.
       */
  def add(matrix: Matrix): Matrix = js.native
  /**
       * Returns the result of attaching the given argument to the right-hand side of the matrix.
       *
       * @param {Matrix|Vector} matrix The matrix or vector.
       */
  def augment(matrix: Matrix): Matrix = js.native
  /**
       * Returns the result of attaching the given argument to the right-hand side of the matrix.
       *
       * @param {Matrix|Vector} matrix The matrix or vector.
       */
  def augment(matrix: Vector): Matrix = js.native
  /**
       * Returns true iff the matrix can multiply the argument from the left.
       *
       * @param {Matrix} matrix The matrix.
       */
  def canMultiplyFromLeft(matrix: Matrix): scala.Boolean = js.native
  /**
       * Returns column k of the matrix as a vector.
       *
       * @param {number} j The column index.
       */
  def col(j: scala.Double): Vector = js.native
  /**
       * Returns the number of columns in the matrix.
       */
  def cols(): scala.Double = js.native
  def det(): scala.Double = js.native
  /**
       * Returns the determinant for square matrices.
       */
  def determinant(): scala.Double = js.native
  /**
       * If the matrix is square, returns the diagonal elements as a vector; otherwise, returns null.
       */
  def diagonal(): Vector = js.native
  /**
       * Returns the number of rows/columns the matrix has.
       *
       * @return {any} An object { rows: , cols: }.
       */
  def dimensions(): js.Any = js.native
  /**
       * Returns a copy of the matrix.
       */
  def dup(): Matrix = js.native
  /**
       * Returns element (i,j) of the matrix.
       *
       * @param {number} i The row index.
       * @param {number} j The column index.
       */
  def e(i: scala.Double, j: scala.Double): js.Any = js.native
  /**
       * Returns true if the matrix is equal to the argument. You can supply a vector as the argument,
       * in which case the receiver must be a one-column matrix equal to the vector.
       *
       * @param {Vector|Matrix} matrix The argument to compare.
       */
  def eql(matrix: Matrix): scala.Boolean = js.native
  /**
       * Returns true if the matrix is equal to the argument. You can supply a vector as the argument,
       * in which case the receiver must be a one-column matrix equal to the vector.
       *
       * @param {Vector|Matrix} matrix The argument to compare.
       */
  def eql(matrix: Vector): scala.Boolean = js.native
  /**
       * Returns the indeces of the first match found by reading row-by-row from left to right.
       *
       * @param {number} x The value.
       *
       * @return {any} The element indeces i.e: { row:1, col:1 }
       */
  def indexOf(x: scala.Double): js.Any = js.native
  /**
       * Returns a string representation of the matrix.
       */
  def inspect(): java.lang.String = js.native
  def inv(): Matrix = js.native
  /**
       * Returns the inverse (if one exists) using Gauss-Jordan.
       */
  def inverse(): Matrix = js.native
  /**
       * Returns true iff the argument has the same dimensions as the matrix.
       *
       * @param {Matrix} matrix The other matrix.
       */
  def isSameSizeAs(matrix: Matrix): scala.Boolean = js.native
  /**
       * Returns true if the matrix is singular.
       */
  def isSingular(): scala.Boolean = js.native
  /**
       * Returns true if the matrix is square.
       */
  def isSquare(): scala.Boolean = js.native
  /**
       * Maps the matrix to another matrix (of the same dimensions) according to the given function.
       *
       * @param {Function} fn The function.
       */
  def map(fn: js.Function3[/* x */ scala.Double, /* i */ scala.Double, /* j */ scala.Double, _]): Matrix = js.native
  /**
       * Returns the (absolute) largest element of the matrix.
       */
  def max(): scala.Double = js.native
  /**
       * Returns a submatrix taken from the matrix. Argument order is: start row, start col, nrows, ncols.
       * Element selection wraps if the required index is outside the matrix's bounds, so you could use
       * this to perform row/column cycling or copy-augmenting.
       *
       * @param {number} a Starting row index.
       * @param {number} b Starting column index.
       * @param {number} c Number of rows.
       * @param {number} d Number of columns.
       */
  def minor(a: scala.Double, b: scala.Double, c: scala.Double, d: scala.Double): Matrix = js.native
  /**
       * Returns the result of multiplying the matrix from the right by the argument. If the argument is a scalar
       * then just multiply all the elements. If the argument is a vector, a vector is returned, which saves you
       * having to remember calling col(1) on the result.
       *
       * @param {number|Matrix} matrix The multiplier.
       */
  def multiply(matrix: scala.Double): Matrix = js.native
  /**
       * Returns the result of multiplying the matrix from the right by the argument. If the argument is a scalar
       * then just multiply all the elements. If the argument is a vector, a vector is returned, which saves you
       * having to remember calling col(1) on the result.
       *
       * @param {number|Matrix} matrix The multiplier.
       */
  def multiply(matrix: Matrix): Matrix = js.native
  /**
       * Returns the result of multiplying the matrix from the right by the argument. If the argument is a scalar
       * then just multiply all the elements. If the argument is a vector, a vector is returned, which saves you
       * having to remember calling col(1) on the result.
       *
       * @param {Vector} vector The multiplier.
       */
  def multiply(vector: Vector): Vector = js.native
  /**
       * Returns the rank of the matrix.
       */
  def rank(): scala.Double = js.native
  def rk(): scala.Double = js.native
  /**
       * Returns the result of rounding all the elements.
       */
  def round(): Matrix = js.native
  /**
       * Returns row k of the matrix as a vector.
       *
       * @param {number} i The row index.
       */
  def row(i: scala.Double): Vector = js.native
  /**
       * Returns the number of rows in the matrix.
       */
  def rows(): scala.Double = js.native
  /**
       * Set the matrix's elements from an array. If the argument passed is a vector, the resulting matrix
       * will be a single column.
       *
       * @param {Array<number>|Array<Array<number>>|Vector|Matrix} matrix The elements.
       */
  def setElements(matrix: js.Array[scala.Double | js.Array[scala.Double]]): Matrix = js.native
  /**
       * Set the matrix's elements from an array. If the argument passed is a vector, the resulting matrix
       * will be a single column.
       *
       * @param {Array<number>|Array<Array<number>>|Vector|Matrix} matrix The elements.
       */
  def setElements(matrix: Matrix): Matrix = js.native
  /**
       * Set the matrix's elements from an array. If the argument passed is a vector, the resulting matrix
       * will be a single column.
       *
       * @param {Array<number>|Array<Array<number>>|Vector|Matrix} matrix The elements.
       */
  def setElements(matrix: Vector): Matrix = js.native
  /**
       * Returns a copy of the matrix with elements set to the given value if they differ from it
       * by less than Sylvester.precision.
       *
       * @param {number} x The value.
       */
  def snapTo(x: scala.Double): Matrix = js.native
  /**
       * Returns the result of subtracting the argument from the matrix.
       *
       * @param {Matrix} matrix The matrix to substract.
       */
  def subtract(matrix: Matrix): Matrix = js.native
  /**
       * Make the matrix upper (right) triangular by Gaussian elimination. This method only adds multiples
       * of rows to other rows. No rows are scaled up or switched, and the determinant is preserved.
       */
  def toRightTriangular(): Matrix = js.native
  def toUpperTriangular(): Matrix = js.native
  def tr(): scala.Double = js.native
  /**
       * Returns the trace for square matrices.
       */
  def trace(): scala.Double = js.native
  /**
       * Returns the transpose of the matrix.
       */
  def transpose(): Matrix = js.native
  def x(matrix: scala.Double): Matrix = js.native
  def x(matrix: Matrix): Matrix = js.native
  def x(vector: Vector): Vector = js.native
}

