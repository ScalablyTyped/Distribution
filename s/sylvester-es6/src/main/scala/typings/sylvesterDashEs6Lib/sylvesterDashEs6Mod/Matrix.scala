package typings
package sylvesterDashEs6Lib.sylvesterDashEs6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sylvester-es6", "Matrix")
@js.native
class Matrix protected () extends js.Object {
  /**
    * Constructor function.
    */
  def this(elements: js.Array[js.Array[scala.Double] | scala.Double]) = this()
  def this(elements: Matrix) = this()
  def this(elements: Vector) = this()
  /**
    * Gets a nested array containing the matrix's elements.
    */
  var elements: js.Array[js.Array[scala.Double]] = js.native
  /**
    * Returns the result of adding another matrix to the matrix.
    */
  def add(matrix: Matrix): Matrix = js.native
  /**
    * Returns the result of adding a vector to the matrix.
    */
  def add(vector: Vector): Vector = js.native
  def augment(matrix: js.Array[js.Array[scala.Double] | scala.Double]): Matrix = js.native
  def augment(matrix: Matrix): Matrix = js.native
  /**
    * Returns the result of attaching the given argument to the right-hand side of the matrix.
    */
  def augment(matrix: Vector): Matrix = js.native
  /**
    * Returns true iff the matrix can multiply the argument from the left.
    */
  def canMultiplyFromLeft(matrix: Matrix): scala.Boolean = js.native
  /**
    * Returns column k of the matrix as a vector.
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
    */
  def dimensions(): js.Any = js.native
  /**
    * Returns a copy of the matrix.
    */
  def dup(): Matrix = js.native
  /**
    * Returns element (i,j) of the matrix.
    */
  def e(i: scala.Double, j: scala.Double): js.Any = js.native
  def eql(matrix: js.Array[js.Array[scala.Double] | scala.Double]): scala.Boolean = js.native
  def eql(matrix: Matrix): scala.Boolean = js.native
  /**
    * Returns true if the matrix is equal to the argument. You can supply a vector as the argument,
    * in which case the receiver must be a one-column matrix equal to the vector.
    */
  def eql(matrix: Vector): scala.Boolean = js.native
  /**
    * Returns the indices of the first match found by reading row-by-row from left to right.
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
    */
  def minor(a: scala.Double, b: scala.Double, c: scala.Double, d: scala.Double): Matrix = js.native
  /**
    * Returns the result of multiplying the matrix from the right by the argument. If the argument is a scalar
    * then just multiply all the elements. If the argument is a vector, a vector is returned, which saves you
    * having to remember calling col(1) on the result.
    */
  def multiply(matrix: scala.Double): Matrix = js.native
  def multiply(matrix: Matrix): Matrix = js.native
  /**
    * Returns the result of multiplying the matrix from the right by the argument. If the argument is a scalar
    * then just multiply all the elements. If the argument is a vector, a vector is returned, which saves you
    * having to remember calling col(1) on the result.
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
    */
  def row(i: scala.Double): Vector = js.native
  /**
    * Returns the number of rows in the matrix.
    */
  def rows(): scala.Double = js.native
  /**
    * Set the matrix's elements from an array. If the argument passed is a vector, the resulting matrix
    * will be a single column.
    */
  def setElements(matrix: js.Array[js.Array[scala.Double] | scala.Double]): Matrix = js.native
  def setElements(matrix: Matrix): Matrix = js.native
  def setElements(matrix: Vector): Matrix = js.native
  /**
    * Returns a copy of the matrix with elements set to the given value if they differ from it
    * by less than Sylvester.precision.
    */
  def snapTo(x: scala.Double): Matrix = js.native
  /**
    * Returns the result of subtracting the argument from the matrix.
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

/* static members */
@JSImport("sylvester-es6", "Matrix")
@js.native
object Matrix extends js.Object {
  /**
    * Diagonal matrix - all off-diagonal elements are zero
    */
  def Diagonal(elements: js.Array[js.Array[scala.Double] | scala.Double]): sylvesterDashEs6Lib.sylvesterDashEs6Mod.Matrix = js.native
  def Diagonal(elements: sylvesterDashEs6Lib.sylvesterDashEs6Mod.Matrix): sylvesterDashEs6Lib.sylvesterDashEs6Mod.Matrix = js.native
  def Diagonal(elements: sylvesterDashEs6Lib.sylvesterDashEs6Mod.Vector): sylvesterDashEs6Lib.sylvesterDashEs6Mod.Matrix = js.native
  /**
    * Identity matrix of size n.
    */
  def I(n: scala.Double): sylvesterDashEs6Lib.sylvesterDashEs6Mod.Matrix = js.native
  /**
    * Random matrix of n rows, m columns.
    */
  def Random(n: scala.Double, m: scala.Double): sylvesterDashEs6Lib.sylvesterDashEs6Mod.Matrix = js.native
  /**
    * Rotation matrix about some axis. If no axis is supplied, assume we're after a 2D transform.
    */
  def Rotation(theta: scala.Double): sylvesterDashEs6Lib.sylvesterDashEs6Mod.Matrix = js.native
  def Rotation(theta: scala.Double, a: sylvesterDashEs6Lib.sylvesterDashEs6Mod.Vector): sylvesterDashEs6Lib.sylvesterDashEs6Mod.Matrix = js.native
  def RotationX(t: scala.Double): sylvesterDashEs6Lib.sylvesterDashEs6Mod.Matrix = js.native
  def RotationY(t: scala.Double): sylvesterDashEs6Lib.sylvesterDashEs6Mod.Matrix = js.native
  def RotationZ(t: scala.Double): sylvesterDashEs6Lib.sylvesterDashEs6Mod.Matrix = js.native
  /**
    * Matrix filled with zeros.
    */
  def Zero(n: scala.Double, m: scala.Double): sylvesterDashEs6Lib.sylvesterDashEs6Mod.Matrix = js.native
}

