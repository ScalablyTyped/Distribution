package typings.sylvester

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Matrix extends StObject {
  
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
  def augment(matrix: Vector): Matrix = js.native
  
  /**
    * Returns true iff the matrix can multiply the argument from the left.
    *
    * @param {Matrix} matrix The matrix.
    */
  def canMultiplyFromLeft(matrix: Matrix): Boolean = js.native
  
  /**
    * Returns column k of the matrix as a vector.
    *
    * @param {number} j The column index.
    */
  def col(j: Double): Vector = js.native
  
  /**
    * Returns the number of columns in the matrix.
    */
  def cols(): Double = js.native
  
  def det(): Double = js.native
  
  /**
    * Returns the determinant for square matrices.
    */
  def determinant(): Double = js.native
  
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
  def e(i: Double, j: Double): js.Any = js.native
  
  /**
    * Gets a nested array containing the matrix's elements.
    */
  var elements: js.Array[js.Array[Double]] = js.native
  
  def eql(matrix: Matrix): Boolean = js.native
  /**
    * Returns true if the matrix is equal to the argument. You can supply a vector as the argument,
    * in which case the receiver must be a one-column matrix equal to the vector.
    *
    * @param {Vector|Matrix} matrix The argument to compare.
    */
  def eql(matrix: Vector): Boolean = js.native
  
  /**
    * Returns the indeces of the first match found by reading row-by-row from left to right.
    *
    * @param {number} x The value.
    *
    * @return {any} The element indeces i.e: { row:1, col:1 }
    */
  def indexOf(x: Double): js.Any = js.native
  
  /**
    * Returns a string representation of the matrix.
    */
  def inspect(): String = js.native
  
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
  def isSameSizeAs(matrix: Matrix): Boolean = js.native
  
  /**
    * Returns true if the matrix is singular.
    */
  def isSingular(): Boolean = js.native
  
  /**
    * Returns true if the matrix is square.
    */
  def isSquare(): Boolean = js.native
  
  /**
    * Maps the matrix to another matrix (of the same dimensions) according to the given function.
    *
    * @param {Function} fn The function.
    */
  def map(fn: js.Function3[/* x */ Double, /* i */ Double, /* j */ Double, _]): Matrix = js.native
  
  /**
    * Returns the (absolute) largest element of the matrix.
    */
  def max(): Double = js.native
  
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
  def minor(a: Double, b: Double, c: Double, d: Double): Matrix = js.native
  
  /**
    * Returns the result of multiplying the matrix from the right by the argument. If the argument is a scalar
    * then just multiply all the elements. If the argument is a vector, a vector is returned, which saves you
    * having to remember calling col(1) on the result.
    *
    * @param {number|Matrix} matrix The multiplier.
    */
  def multiply(matrix: Double): Matrix = js.native
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
  def rank(): Double = js.native
  
  def rk(): Double = js.native
  
  /**
    * Returns the result of rounding all the elements.
    */
  def round(): Matrix = js.native
  
  /**
    * Returns row k of the matrix as a vector.
    *
    * @param {number} i The row index.
    */
  def row(i: Double): Vector = js.native
  
  /**
    * Returns the number of rows in the matrix.
    */
  def rows(): Double = js.native
  
  /**
    * Set the matrix's elements from an array. If the argument passed is a vector, the resulting matrix
    * will be a single column.
    *
    * @param {Array<number>|Array<Array<number>>|Vector|Matrix} matrix The elements.
    */
  def setElements(matrix: js.Array[js.Array[Double] | Double]): Matrix = js.native
  def setElements(matrix: Matrix): Matrix = js.native
  def setElements(matrix: Vector): Matrix = js.native
  
  /**
    * Returns a copy of the matrix with elements set to the given value if they differ from it
    * by less than Sylvester.precision.
    *
    * @param {number} x The value.
    */
  def snapTo(x: Double): Matrix = js.native
  
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
  
  def tr(): Double = js.native
  
  /**
    * Returns the trace for square matrices.
    */
  def trace(): Double = js.native
  
  /**
    * Returns the transpose of the matrix.
    */
  def transpose(): Matrix = js.native
  
  def x(matrix: Double): Matrix = js.native
  def x(matrix: Matrix): Matrix = js.native
  def x(vector: Vector): Vector = js.native
}
