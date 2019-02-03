package typings
package vectoriousLib.vectoriousMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vectorious", "Matrix")
@js.native
class Matrix protected () extends js.Object {
  /**
    * @method constructor
    * @desc Creates a `Matrix` from the supplied arguments.
    **/
  def this(data: js.Array[js.Array[scala.Double]]) = this()
  def this(data: js.Array[js.Array[scala.Double]], options: js.Any) = this()
  var T: Matrix = js.native
  var shape: js.Array[scala.Double] = js.native
  /**
    * Adds `matrix` to current matrix.
    * @param {Matrix} matrix
    * @returns {Matrix} `this`
    **/
  def add(matrix: Matrix): Matrix = js.native
  /**
    * Augments `matrix` with current matrix.
    * @param {Matrix} matrix
    * @returns {Matrix} `this`
    **/
  def augment(matrix: Matrix): Matrix = js.native
  /**
    * Gets the determinant of any square matrix using LU factorization.
    * @returns {Number} the determinant of the matrix
    **/
  def determinant(): scala.Double = js.native
  /**
    * Gets the diagonal of a matrix.
    * @returns {Vector} the diagonal of the matrix as a vector
    **/
  def diag(): Vector = js.native
  /**
    * Functional version of for-looping the elements in a matrix, is
    * equivalent to `Array.prototype.forEach`.
    * @param {Function} callback
    * @returns {Matrix} `this`
    **/
  def each(callback: js.Function1[/* element */ scala.Double, scala.Unit]): Matrix = js.native
  /**
    * Checks the equality of `matrix` and current matrix.
    * @param {Matrix} matrix
    * @returns {Boolean} `true` if equal, `false` otherwise
    **/
  def equals(matrix: Matrix): scala.Boolean = js.native
  /**
    * Performs Gaussian elimination on a matrix.
    * @returns {Matrix} the matrix in reduced row echelon form
    **/
  def gauss(): Matrix = js.native
  /**
    * Gets the value of the element in row `i`, column `j` of current matrix
    * @param {Number} i
    * @param {Number} j
    * @returns {Number} the element at row `i`, column `j` of current matrix
    **/
  def get(i: scala.Double, j: scala.Double): scala.Double = js.native
  /**
    * Determines the inverse of any invertible square matrix using
    * Gaussian elimination.
    * @returns {Matrix} the inverse of the matrix
    **/
  def inverse(): Matrix = js.native
  /**
    * Performs full LU decomposition on a matrix.
    * @returns {Array} a triple (3-tuple) of the lower triangular resultant matrix `L`, the upper
    * triangular resultant matrix `U` and the pivot array `ipiv`
    **/
  def lu(): js.Array[scala.Double] = js.native
  /**
    * Solves an LU factorized matrix with the supplied right hand side(s)
    * @param {Matrix} rhs, right hand side(s) to solve for
    * @param {Int32Array} array of pivoted row indices
    * @returns {Matrix} rhs replaced by the solution
    **/
  def lusolve(rhs: Matrix, ipiv: stdLib.Int32Array): Matrix = js.native
  /**
    * Maps a function `callback` to all elements of a copy of current matrix.
    * @param {Function} callback
    * @returns {Matrix} the resultant mapped matrix
    **/
  def map(callback: js.Function1[/* element */ scala.Double, scala.Double]): Matrix = js.native
  /**
    * Multiplies two matrices `a` and `b` of matching dimensions.
    * @param {Matrix} Matrix
    * @returns {Matrix} a new resultant matrix containing the matrix product of `a` and `b`
    **/
  def multiply(matrix: Matrix): Matrix = js.native
  /**
    * Performs LU factorization on current matrix.
    * @returns {Array} an array with the current matrix LU-factorized and the
    * corresponding pivot Int32Array
    **/
  def plu(): js.Array[_] = js.native
  /**
    * Hadamard product of matrices
    * @param {Matrix} matrix
    * @returns {Matrix} `this`
    **/
  def product(matrix: Matrix): Matrix = js.native
  /**
    * Finds the rank of the matrix using row echelon form
    * @returns {Number} rank
    **/
  def rank(): scala.Double = js.native
  /**
    * Equivalent to `TypedArray.prototype.reduce`.
    * @param {Function} callback
    * @param {Number} initialValue
    * @returns {Number} result of reduction
    **/
  def reduce(callback: js.Function2[/* memo */ scala.Double, /* element */ scala.Double, scala.Double]): scala.Double = js.native
  def reduce(
    callback: js.Function2[/* memo */ scala.Double, /* element */ scala.Double, scala.Double],
    initialValue: scala.Double
  ): scala.Double = js.native
  /**
    * Multiplies all elements of current matrix with a specified `scalar`.
    * @param {Number} scalar
    * @returns {Matrix} `this`
    **/
  def scale(scalar: scala.Double): Matrix = js.native
  /**
    * Sets the element at row `i`, column `j` to value
    * @param {Number} i
    * @param {Number} j
    * @param {Number} value
    * @returns {Matrix} `this`
    **/
  def set(i: scala.Double, j: scala.Double, value: scala.Double): Matrix = js.native
  /**
    * Solves AX = B using LU factorization, where A is the current matrix and
    * B is a Vector/Matrix containing the right hand side(s) of the equation.
    * @param {Matrix/Vector} rhs, right hand side(s) to solve for
    * @param {Int32Array} array of pivoted row indices
    * @returns {Matrix} a new matrix containing the solutions of the system
    **/
  def solve(rhs: Matrix): Matrix = js.native
  def solve(rhs: Vector): Matrix = js.native
  /**
    * Subtracts `matrix` from current matrix.
    * @param {Matrix} matrix
    * @returns {Matrix} `this`
    **/
  def subtract(matrix: Matrix): Matrix = js.native
  /**
    * Swaps two rows `i` and `j` in a matrix
    * @param {Number} i
    * @param {Number} j
    * @returns {Matrix} `this`
    **/
  def swap(i: scala.Double, j: scala.Double): Matrix = js.native
  /**
    * Converts current matrix into a two-dimensional array
    * @returns {Array} an array of the matrix' contents
    **/
  def toArray(): js.Array[js.Array[scala.Double]] = js.native
  /**
    * Gets the trace of the matrix (the sum of all diagonal elements).
    * @returns {Number} the trace of the matrix
    **/
  def trace(): scala.Double = js.native
  /**
    * Transposes a matrix (mirror across the diagonal).
    * @returns {Matrix} `this`
    **/
  def transpose(): Matrix = js.native
}

/* static members */
@JSImport("vectorious", "Matrix")
@js.native
object Matrix extends js.Object {
  /**
    * Static method. Adds two matrices `a` and `b` together.
    * @param {Matrix} a
    * @param {Matrix} b
    * @returns {Matrix} a new matrix containing the sum of `a` and `b`
    **/
  def add(a: vectoriousLib.vectoriousMod.Matrix, b: vectoriousLib.vectoriousMod.Matrix): vectoriousLib.vectoriousMod.Matrix = js.native
  /**
    * Static method. Augments two matrices `a` and `b` of matching dimensions
    * (appends `b` to `a`).
    * @param {Matrix} a
    * @param {Matrix} b
    * @returns {Matrix} the resultant matrix of `b` augmented to `a`
    **/
  def augment(a: vectoriousLib.vectoriousMod.Matrix, b: vectoriousLib.vectoriousMod.Matrix): vectoriousLib.vectoriousMod.Matrix = js.native
  /**
    * Static method. Checks the equality of two matrices `a` and `b`.
    * @param {Matrix} a
    * @param {Matrix} b
    * @returns {Boolean} `true` if equal, `false` otherwise
    **/
  def equals(a: vectoriousLib.vectoriousMod.Matrix, b: vectoriousLib.vectoriousMod.Matrix): scala.Boolean = js.native
  def fromArray(data: js.Array[js.Array[scala.Double]]): vectoriousLib.vectoriousMod.Matrix = js.native
  def fromTypedArray(data: js.Any, shape: js.Array[scala.Double]): vectoriousLib.vectoriousMod.Matrix = js.native
  /**
    * Static method. Creates an identity matrix of `size`, takes an optional `type` argument
    * which should be an instance of `TypedArray`.
    * @param {Number} size
    * @param {TypedArray} type
    * @returns {Matrix} an identity matrix of the specified `size` and `type`
    **/
  def identity(size: scala.Double): vectoriousLib.vectoriousMod.Matrix = js.native
  def identity(size: scala.Double, `type`: js.Any): vectoriousLib.vectoriousMod.Matrix = js.native
  /**
    * Static method. Creates a magic square matrix of `size`, takes an optional `type` argument
    * which should be an instance of `TypedArray`.
    * @param {Number} size
    * @param {Number} type
    * @returns {Matrix} a magic square matrix of the specified `size` and `type`
    **/
  def magic(size: scala.Double): vectoriousLib.vectoriousMod.Matrix = js.native
  def magic(size: scala.Double, `type`: js.Any): vectoriousLib.vectoriousMod.Matrix = js.native
  /**
    * Static method. Multiplies two matrices `a` and `b` of matching dimensions.
    * @param {Matrix} a
    * @param {Matrix} b
    * @returns {Matrix} a new resultant matrix containing the matrix product of `a` and `b`
    **/
  def multiply(a: vectoriousLib.vectoriousMod.Matrix, b: vectoriousLib.vectoriousMod.Matrix): vectoriousLib.vectoriousMod.Matrix = js.native
  /**
    * Static method. Creates an `i x j` matrix containing ones (`1`), takes an
    * optional `type` argument which should be an instance of `TypedArray`.
    * @param {Number} i
    * @param {Number} j
    * @param {TypedArray} type
    * @returns {Matrix} a matrix of the specified dimensions and `type`
    **/
  def ones(i: scala.Double, j: scala.Double): vectoriousLib.vectoriousMod.Matrix = js.native
  def ones(i: scala.Double, j: scala.Double, `type`: js.Any): vectoriousLib.vectoriousMod.Matrix = js.native
  /**
    * Static method. Performs LU factorization on current matrix.
    * @returns {Array} an array with a new instance of the current matrix LU-
    * factorized and the corresponding pivot Int32Array
    **/
  def plu(matrix: vectoriousLib.vectoriousMod.Matrix): js.Array[_] = js.native
  /**
    * Static method. Hadamard product of matrices
    * @param {Matrix} a
    * @param {Matrix} b
    * @returns {Matrix} a new matrix containing the hadamard product
    **/
  def product(a: vectoriousLib.vectoriousMod.Matrix, b: vectoriousLib.vectoriousMod.Matrix): vectoriousLib.vectoriousMod.Matrix = js.native
  /**
    * Static method. Creates an `i x j` matrix containing random values
    * according to a normal distribution, takes an optional `type` argument
    * which should be an instance of `TypedArray`.
    * @param {Number} i
    * @param {Number} j
    * @param {Number} mean (default 0)
    * @param {Number} standard deviation (default 1)
    * @param {TypedArray} type
    * @returns {Matrix} a matrix of the specified dimensions and `type`
    **/
  def random(i: scala.Double, j: scala.Double): vectoriousLib.vectoriousMod.Matrix = js.native
  def random(i: scala.Double, j: scala.Double, deviation: scala.Double): vectoriousLib.vectoriousMod.Matrix = js.native
  def random(i: scala.Double, j: scala.Double, deviation: scala.Double, mean: scala.Double): vectoriousLib.vectoriousMod.Matrix = js.native
  def random(i: scala.Double, j: scala.Double, deviation: scala.Double, mean: scala.Double, `type`: js.Any): vectoriousLib.vectoriousMod.Matrix = js.native
  /**
    * Static method. Finds the rank of a matrix using row echelon form
    * @param {Matrix} matrix
    * @returns {Number} rank
    **/
  def rank(matrix: vectoriousLib.vectoriousMod.Matrix): scala.Double = js.native
  /**
    * Static method. Multiplies all elements of a matrix `a` with a specified `scalar`.
    * @param {Matrix} matrix
    * @param {Number} scalar
    * @returns {Matrix} a new scaled matrix
    **/
  def scale(matrix: vectoriousLib.vectoriousMod.Matrix, scalar: scala.Double): vectoriousLib.vectoriousMod.Matrix = js.native
  /**
    * Static method. Subtracts the matrix `b` from matrix `a`.
    * @param {Matrix} a
    * @param {Matrix} b
    * @returns {Matrix} a new matrix containing the difference between `a` and `b`
    **/
  def subtract(a: vectoriousLib.vectoriousMod.Matrix, b: vectoriousLib.vectoriousMod.Matrix): vectoriousLib.vectoriousMod.Matrix = js.native
  /**
    * Static method. Creates an `i x j` matrix containing zeros (`0`), takes an
    * optional `type` argument which should be an instance of `TypedArray`.
    * @param {Number} i
    * @param {Number} j
    * @param {TypedArray} type
    * @returns {Matrix} a matrix of the specified dimensions and `type`
    **/
  def zeros(i: scala.Double, j: scala.Double): vectoriousLib.vectoriousMod.Matrix = js.native
  def zeros(i: scala.Double, j: scala.Double, `type`: js.Any): vectoriousLib.vectoriousMod.Matrix = js.native
}

