package typings.three

import typings.std.ArrayLike
import typings.three.matrix4Mod.Matrix4
import typings.three.threeNumbers.`0`
import typings.three.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matrix3Mod {
  
  @JSImport("three/src/math/Matrix3", "Matrix3")
  @js.native
  /**
    * Creates an identity matrix.
    */
  open class Matrix3 ()
    extends StObject
       with Matrix {
    
    /**
      * copy(m:T):T;
      */
    /* CompleteClass */
    override def copy(m: this.type): this.type = js.native
    
    /* CompleteClass */
    override def determinant(): Double = js.native
    
    /**
      * Array with matrix values.
      */
    /* CompleteClass */
    var elements: js.Array[Double] = js.native
    
    def equals(matrix: Matrix3): Boolean = js.native
    
    def extractBasis(xAxis: Vector3, yAxis: Vector3, zAxis: Vector3): Matrix3 = js.native
    
    /**
      * @deprecated Use {@link Matrix3#toArray .toArray()} instead.
      */
    def flattenToArrayOffset(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
    
    /**
      * Sets the values of this matrix from the provided array or array-like.
      * @param array the source array or array-like.
      * @param offset (optional) offset into the array-like. Default is 0.
      */
    def fromArray(array: js.Array[Double]): Matrix3 = js.native
    def fromArray(array: js.Array[Double], offset: Double): Matrix3 = js.native
    def fromArray(array: ArrayLike[Double]): Matrix3 = js.native
    def fromArray(array: ArrayLike[Double], offset: Double): Matrix3 = js.native
    
    def getInverse(matrix: Matrix): Matrix = js.native
    /**
      * @deprecated Use {@link Matrix3#invert .invert()} instead.
      */
    def getInverse(matrix: Matrix4): Matrix3 = js.native
    def getInverse(matrix: Matrix4, throwOnDegenerate: Boolean): Matrix3 = js.native
    
    def getNormalMatrix(matrix4: Matrix4): Matrix3 = js.native
    
    /**
      * identity():T;
      */
    /* CompleteClass */
    override def identity(): Matrix = js.native
    
    /**
      * invert():T;
      */
    /* CompleteClass */
    override def invert(): Matrix = js.native
    
    /**
      * Multiplies this matrix by m.
      */
    def multiply(m: Matrix3): Matrix3 = js.native
    
    /**
      * Sets this matrix to a x b.
      */
    def multiplyMatrices(a: Matrix3, b: Matrix3): Matrix3 = js.native
    
    /**
      * multiplyScalar(s:number):T;
      */
    /* CompleteClass */
    override def multiplyScalar(s: Double): Matrix = js.native
    
    /**
      * @deprecated Use {@link Vector3.applyMatrix3 vector.applyMatrix3( matrix )} instead.
      */
    def multiplyVector3(vector: Vector3): Any = js.native
    
    /**
      * @deprecated This method has been removed completely.
      */
    def multiplyVector3Array(a: Any): Any = js.native
    
    def premultiply(m: Matrix3): Matrix3 = js.native
    
    def rotate(theta: Double): Matrix3 = js.native
    
    def scale(sx: Double, sy: Double): Matrix3 = js.native
    
    def set(
      n11: Double,
      n12: Double,
      n13: Double,
      n21: Double,
      n22: Double,
      n23: Double,
      n31: Double,
      n32: Double,
      n33: Double
    ): Matrix3 = js.native
    
    def setFromMatrix4(m: Matrix4): Matrix3 = js.native
    
    def setUvTransform(tx: Double, ty: Double, sx: Double, sy: Double, rotation: Double, cx: Double, cy: Double): Matrix3 = js.native
    
    /**
      * Copies he values of this matrix into the provided array-like.
      * @param array array-like to store the matrix to.
      * @param offset (optional) optional offset into the array-like.
      * @return The provided array-like.
      */
    def toArray(): ArrayLike[Double] = js.native
    def toArray(array: js.Array[Double]): js.Array[Double] = js.native
    def toArray(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
    def toArray(array: Unit, offset: Double): ArrayLike[Double] = js.native
    def toArray(array: ArrayLike[Double]): ArrayLike[Double] = js.native
    def toArray(array: ArrayLike[Double], offset: Double): ArrayLike[Double] = js.native
    def toArray(array: Matrix3Tuple): Matrix3Tuple = js.native
    @JSName("toArray")
    def toArray_0(array: Unit, offset: `0`): Matrix3Tuple = js.native
    @JSName("toArray")
    def toArray_0(array: Matrix3Tuple, offset: `0`): Matrix3Tuple = js.native
    /**
      * Returns an array with the values of this matrix, or copies them into the provided array.
      * @param array (optional) array to store the matrix to. If this is not provided, a new array will be created.
      * @param offset (optional) optional offset into the array.
      * @return The created or provided array.
      */
    @JSName("toArray")
    def toArray_Array(): js.Array[Double] = js.native
    @JSName("toArray")
    def toArray_Array(array: Unit, offset: Double): js.Array[Double] = js.native
    @JSName("toArray")
    def toArray_Matrix3Tuple(): Matrix3Tuple = js.native
    
    def translate(tx: Double, ty: Double): Matrix3 = js.native
    
    /**
      * transpose():T;
      */
    /* CompleteClass */
    override def transpose(): Matrix = js.native
    
    /**
      * Transposes this matrix into the supplied array r, and returns itself.
      */
    def transposeIntoArray(r: js.Array[Double]): Matrix3 = js.native
  }
  
  trait Matrix extends StObject {
    
    /**
      * copy(m:T):T;
      */
    def copy(m: this.type): this.type
    
    def determinant(): Double
    
    /**
      * Array with matrix values.
      */
    var elements: js.Array[Double]
    
    /**
      * identity():T;
      */
    def identity(): Matrix
    
    /**
      * invert():T;
      */
    def invert(): Matrix
    
    /**
      * multiplyScalar(s:number):T;
      */
    def multiplyScalar(s: Double): Matrix
    
    /**
      * transpose():T;
      */
    def transpose(): Matrix
  }
  object Matrix {
    
    inline def apply(
      copy: Matrix => Matrix,
      determinant: () => Double,
      elements: js.Array[Double],
      identity: () => Matrix,
      invert: () => Matrix,
      multiplyScalar: Double => Matrix,
      transpose: () => Matrix
    ): Matrix = {
      val __obj = js.Dynamic.literal(copy = js.Any.fromFunction1(copy), determinant = js.Any.fromFunction0(determinant), elements = elements.asInstanceOf[js.Any], identity = js.Any.fromFunction0(identity), invert = js.Any.fromFunction0(invert), multiplyScalar = js.Any.fromFunction1(multiplyScalar), transpose = js.Any.fromFunction0(transpose))
      __obj.asInstanceOf[Matrix]
    }
    
    extension [Self <: Matrix](x: Self) {
      
      inline def setCopy(value: Matrix => Matrix): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
      
      inline def setDeterminant(value: () => Double): Self = StObject.set(x, "determinant", js.Any.fromFunction0(value))
      
      inline def setElements(value: js.Array[Double]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsVarargs(value: Double*): Self = StObject.set(x, "elements", js.Array(value*))
      
      inline def setIdentity(value: () => Matrix): Self = StObject.set(x, "identity", js.Any.fromFunction0(value))
      
      inline def setInvert(value: () => Matrix): Self = StObject.set(x, "invert", js.Any.fromFunction0(value))
      
      inline def setMultiplyScalar(value: Double => Matrix): Self = StObject.set(x, "multiplyScalar", js.Any.fromFunction1(value))
      
      inline def setTranspose(value: () => Matrix): Self = StObject.set(x, "transpose", js.Any.fromFunction0(value))
    }
  }
  
  type Matrix3Tuple = js.Tuple9[Double, Double, Double, Double, Double, Double, Double, Double, Double]
}
