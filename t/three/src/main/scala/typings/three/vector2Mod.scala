package typings.three

import typings.std.ArrayLike
import typings.three.bufferAttributeMod.BufferAttribute
import typings.three.matrix3Mod.Matrix3
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vector2Mod {
  
  @JSImport("three/src/math/Vector2", "Vector2")
  @js.native
  class Vector2 ()
    extends StObject
       with Vector {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    
    /**
    	 * NOTE: The second argument is deprecated.
    	 *
    	 * add(v:T):T;
    	 */
    /* CompleteClass */
    override def add(v: Vector): this.type = js.native
    /**
    	 * Adds v to this vector.
    	 */
    def add(v: Vector2): this.type = js.native
    def add(v: Vector2, w: Vector2): this.type = js.native
    
    /**
    	 * Adds the scalar value s to this vector's values.
    	 */
    /* CompleteClass */
    override def addScalar(scalar: Double): this.type = js.native
    
    /* CompleteClass */
    override def addScaledVector(vector: Vector, scale: Double): this.type = js.native
    /**
    	 * Adds the multiple of v and s to this vector.
    	 */
    def addScaledVector(v: Vector2, s: Double): this.type = js.native
    
    /**
    	 * Sets this vector to a + b.
    	 */
    def addVectors(a: Vector2, b: Vector2): this.type = js.native
    /**
    	 * addVectors(a:T, b:T):T;
    	 */
    /* CompleteClass */
    override def addVectors(a: Vector, b: Vector): this.type = js.native
    
    /**
    	 * computes the angle in radians with respect to the positive x-axis
    	 */
    def angle(): Double = js.native
    
    /**
    	 * Multiplies this vector (with an implicit 1 as the 3rd component) by m.
    	 */
    def applyMatrix3(m: Matrix3): this.type = js.native
    
    /**
    	 * The x and y components of the vector are rounded up to the nearest integer value.
    	 */
    def ceil(): this.type = js.native
    
    /**
    	 * If this vector's x or y value is greater than the max vector's x or y value, it is replaced by the corresponding value.
    	 * If this vector's x or y value is less than the min vector's x or y value, it is replaced by the corresponding value.
    	 * @param min the minimum x and y values.
    	 * @param max the maximum x and y values in the desired range.
    	 */
    def clamp(min: Vector2, max: Vector2): this.type = js.native
    
    /**
    	 * If this vector's length is greater than the max value, it is replaced by the max value.
    	 * If this vector's length is less than the min value, it is replaced by the min value.
    	 * @param min the minimum value the length will be clamped to.
    	 * @param max the maximum value the length will be clamped to.
    	 */
    def clampLength(min: Double, max: Double): this.type = js.native
    
    /**
    	 * If this vector's x or y values are greater than the max value, they are replaced by the max value.
    	 * If this vector's x or y values are less than the min value, they are replaced by the min value.
    	 * @param min the minimum value the components will be clamped to.
    	 * @param max the maximum value the components will be clamped to.
    	 */
    def clampScalar(min: Double, max: Double): this.type = js.native
    
    /**
    	 * copy(v:T):T;
    	 */
    /* CompleteClass */
    override def copy(v: Vector): this.type = js.native
    /**
    	 * Copies value of v to this vector.
    	 */
    def copy(v: Vector2): this.type = js.native
    
    /**
    	 * Computes cross product of this vector and v.
    	 */
    def cross(v: Vector2): Double = js.native
    
    /**
    	 * @deprecated Use {@link Vector2#manhattanDistanceTo .manhattanDistanceTo()} instead.
    	 */
    def distanceToManhattan(v: Vector2): Double = js.native
    
    /**
    	 * Computes squared distance of this vector to v.
    	 */
    @JSName("distanceToSquared")
    def distanceToSquared_MVector2(v: Vector2): Double = js.native
    
    /**
    	 * Computes distance of this vector to v.
    	 */
    @JSName("distanceTo")
    def distanceTo_MVector2(v: Vector2): Double = js.native
    
    /**
    	 * Divides this vector by v.
    	 */
    def divide(v: Vector2): this.type = js.native
    
    /**
    	 * divideScalar(s:number):T;
    	 */
    /* CompleteClass */
    override def divideScalar(s: Double): this.type = js.native
    
    /**
    	 * dot(v:T):T;
    	 */
    /* CompleteClass */
    override def dot(v: Vector): Double = js.native
    /**
    	 * Computes dot product of this vector and v.
    	 */
    def dot(v: Vector2): Double = js.native
    
    /**
    	 * equals(v:T):boolean;
    	 */
    /* CompleteClass */
    override def equals(v: Vector): Boolean = js.native
    /**
    	 * Checks for strict equality of this vector and v.
    	 */
    def equals(v: Vector2): Boolean = js.native
    
    /**
    	 * The components of the vector are rounded down to the nearest integer value.
    	 */
    def floor(): this.type = js.native
    
    /**
    	 * Sets this vector's x and y value from the provided array.
    	 * @param array the source array.
    	 * @param offset (optional) offset into the array. Default is 0.
    	 */
    def fromArray(array: js.Array[Double]): this.type = js.native
    def fromArray(array: js.Array[Double], offset: Double): this.type = js.native
    /**
    	 * Sets this vector's x and y value from the provided array-like.
    	 * @param array the source array-like.
    	 * @param offset (optional) offset into the array-like. Default is 0.
    	 */
    def fromArray(array: ArrayLike[Double]): this.type = js.native
    def fromArray(array: ArrayLike[Double], offset: Double): this.type = js.native
    
    /**
    	 * Sets this vector's x and y values from the attribute.
    	 * @param attribute the source attribute.
    	 * @param index index in the attribute.
    	 */
    def fromBufferAttribute(attribute: BufferAttribute, index: Double): this.type = js.native
    
    /* CompleteClass */
    override def getComponent(index: Double): Double = js.native
    
    var height: Double = js.native
    
    val isVector2: `true` = js.native
    
    /**
    	 * length():number;
    	 */
    /* CompleteClass */
    override def length(): Double = js.native
    
    /**
    	 * @deprecated Use {@link Vector2#manhattanLength .manhattanLength()} instead.
    	 */
    def lengthManhattan(): Double = js.native
    
    /**
    	 * lengthSq():number;
    	 */
    /* CompleteClass */
    override def lengthSq(): Double = js.native
    
    /**
    	 * Linearly interpolates between this vector and v, where alpha is the distance along the line - alpha = 0 will be this vector, and alpha = 1 will be v.
    	 * @param v vector to interpolate towards.
    	 * @param alpha interpolation factor in the closed interval [0, 1].
    	 */
    def lerp(v: Vector2, alpha: Double): this.type = js.native
    /**
    	 * lerp(v:T, alpha:number):T;
    	 */
    /* CompleteClass */
    override def lerp(v: Vector, alpha: Double): this.type = js.native
    
    /**
    	 * Sets this vector to be the vector linearly interpolated between v1 and v2 where alpha is the distance along the line connecting the two vectors - alpha = 0 will be v1, and alpha = 1 will be v2.
    	 * @param v1 the starting vector.
    	 * @param v2 vector to interpolate towards.
    	 * @param alpha interpolation factor in the closed interval [0, 1].
    	 */
    def lerpVectors(v1: Vector2, v2: Vector2, alpha: Double): this.type = js.native
    
    /**
    	 * Computes the Manhattan length (distance) from this vector to the given vector v
    	 *
    	 * @param {Vector2} v
    	 *
    	 * @return {number}
    	 *
    	 * @see {@link http://en.wikipedia.org/wiki/Taxicab_geometry|Wikipedia: Taxicab Geometry}
    	 */
    def manhattanDistanceTo(v: Vector2): Double = js.native
    
    /**
    	 * Computes the Manhattan length of this vector.
    	 *
    	 * @return {number}
    	 *
    	 * @see {@link http://en.wikipedia.org/wiki/Taxicab_geometry|Wikipedia: Taxicab Geometry}
    	 */
    def manhattanLength(): Double = js.native
    
    /**
    	 * If this vector's x or y value is less than v's x or y value, replace that value with the corresponding max value.
    	 */
    def max(v: Vector2): this.type = js.native
    
    /**
    	 * If this vector's x or y value is greater than v's x or y value, replace that value with the corresponding min value.
    	 */
    def min(v: Vector2): this.type = js.native
    
    /**
    	 * Multiplies this vector by v.
    	 */
    def multiply(v: Vector2): this.type = js.native
    
    /**
    	 * multiplyScalar(s:number):T;
    	 */
    /* CompleteClass */
    override def multiplyScalar(s: Double): this.type = js.native
    
    /**
    	 * negate():T;
    	 */
    /* CompleteClass */
    override def negate(): this.type = js.native
    
    /**
    	 * normalize():T;
    	 */
    /* CompleteClass */
    override def normalize(): this.type = js.native
    
    /**
    	 * Sets this vector's x and y from Math.random
    	 */
    def random(): this.type = js.native
    
    /**
    	 * Rotates the vector around center by angle radians.
    	 * @param center the point around which to rotate.
    	 * @param angle the angle to rotate, in radians.
    	 */
    def rotateAround(center: Vector2, angle: Double): this.type = js.native
    
    /**
    	 * The components of the vector are rounded to the nearest integer value.
    	 */
    def round(): this.type = js.native
    
    /**
    	 * The components of the vector are rounded towards zero (up if negative, down if positive) to an integer value.
    	 */
    def roundToZero(): this.type = js.native
    
    /* CompleteClass */
    override def set(args: Double*): this.type = js.native
    /**
    	 * Sets value of this vector.
    	 */
    def set(x: Double, y: Double): this.type = js.native
    
    /* CompleteClass */
    override def setComponent(index: Double, value: Double): this.type = js.native
    
    /**
    	 * setLength(l:number):T;
    	 */
    /* CompleteClass */
    override def setLength(l: Double): this.type = js.native
    
    /* CompleteClass */
    override def setScalar(scalar: Double): this.type = js.native
    
    /**
    	 * Sets X component of this vector.
    	 */
    def setX(x: Double): this.type = js.native
    
    /**
    	 * Sets Y component of this vector.
    	 */
    def setY(y: Double): this.type = js.native
    
    /**
    	 * sub(v:T):T;
    	 */
    /* CompleteClass */
    override def sub(v: Vector): this.type = js.native
    /**
    	 * Subtracts v from this vector.
    	 */
    def sub(v: Vector2): this.type = js.native
    
    /**
    	 * Subtracts s from this vector's x and y components.
    	 */
    def subScalar(s: Double): this.type = js.native
    
    /**
    	 * Sets this vector to a - b.
    	 */
    def subVectors(a: Vector2, b: Vector2): this.type = js.native
    /**
    	 * subVectors(a:T, b:T):T;
    	 */
    /* CompleteClass */
    override def subVectors(a: Vector, b: Vector): this.type = js.native
    
    /**
    	 * Returns an array [x, y], or copies x and y into the provided array.
    	 * @param array (optional) array to store the vector to. If this is not provided, a new array will be created.
    	 * @param offset (optional) optional offset into the array.
    	 * @return The created or provided array.
    	 */
    def toArray(): js.Array[Double] = js.native
    def toArray(array: js.Array[Double]): js.Array[Double] = js.native
    def toArray(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
    def toArray(array: Unit, offset: Double): js.Array[Double] = js.native
    /**
    	 * Copies x and y into the provided array-like.
    	 * @param array array-like to store the vector to.
    	 * @param offset (optional) optional offset into the array.
    	 * @return The provided array-like.
    	 */
    def toArray(array: ArrayLike[Double]): ArrayLike[Double] = js.native
    def toArray(array: ArrayLike[Double], offset: Double): ArrayLike[Double] = js.native
    
    var width: Double = js.native
    
    /**
    	 * @default 0
    	 */
    var x: Double = js.native
    
    /**
    	 * @default 0
    	 */
    var y: Double = js.native
  }
  
  trait Vector extends StObject {
    
    /**
    	 * NOTE: The second argument is deprecated.
    	 *
    	 * add(v:T):T;
    	 */
    def add(v: Vector): this.type
    
    /**
    	 * Adds the scalar value s to this vector's values.
    	 */
    def addScalar(scalar: Double): this.type
    
    def addScaledVector(vector: Vector, scale: Double): this.type
    
    /**
    	 * addVectors(a:T, b:T):T;
    	 */
    def addVectors(a: Vector, b: Vector): this.type
    
    /**
    	 * copy(v:T):T;
    	 */
    def copy(v: Vector): this.type
    
    /**
    	 * NOTE: Vector4 doesn't have the property.
    	 *
    	 * distanceTo(v:T):number;
    	 */
    var distanceTo: js.UndefOr[js.Function1[/* v */ this.type, Double]] = js.undefined
    
    /**
    	 * NOTE: Vector4 doesn't have the property.
    	 *
    	 * distanceToSquared(v:T):number;
    	 */
    var distanceToSquared: js.UndefOr[js.Function1[/* v */ this.type, Double]] = js.undefined
    
    /**
    	 * divideScalar(s:number):T;
    	 */
    def divideScalar(s: Double): this.type
    
    /**
    	 * dot(v:T):T;
    	 */
    def dot(v: Vector): Double
    
    /**
    	 * equals(v:T):boolean;
    	 */
    def equals(v: Vector): Boolean
    
    def getComponent(index: Double): Double
    
    /**
    	 * length():number;
    	 */
    def length(): Double
    
    /**
    	 * lengthSq():number;
    	 */
    def lengthSq(): Double
    
    /**
    	 * lerp(v:T, alpha:number):T;
    	 */
    def lerp(v: Vector, alpha: Double): this.type
    
    /**
    	 * multiplyScalar(s:number):T;
    	 */
    def multiplyScalar(s: Double): this.type
    
    /**
    	 * negate():T;
    	 */
    def negate(): this.type
    
    /**
    	 * normalize():T;
    	 */
    def normalize(): this.type
    
    def set(args: Double*): this.type
    
    def setComponent(index: Double, value: Double): this.type
    
    /**
    	 * setLength(l:number):T;
    	 */
    def setLength(l: Double): this.type
    
    def setScalar(scalar: Double): this.type
    
    /**
    	 * sub(v:T):T;
    	 */
    def sub(v: Vector): this.type
    
    /**
    	 * subVectors(a:T, b:T):T;
    	 */
    def subVectors(a: Vector, b: Vector): this.type
  }
  object Vector {
    
    inline def apply(
      add: Vector => Vector,
      addScalar: Double => Vector,
      addScaledVector: (Vector, Double) => Vector,
      addVectors: (Vector, Vector) => Vector,
      copy: Vector => Vector,
      divideScalar: Double => Vector,
      dot: Vector => Double,
      equals_ : Vector => Boolean,
      getComponent: Double => Double,
      length: () => Double,
      lengthSq: () => Double,
      lerp: (Vector, Double) => Vector,
      multiplyScalar: Double => Vector,
      negate: () => Vector,
      normalize: () => Vector,
      set: /* repeated */ Double => Vector,
      setComponent: (Double, Double) => Vector,
      setLength: Double => Vector,
      setScalar: Double => Vector,
      sub: Vector => Vector,
      subVectors: (Vector, Vector) => Vector
    ): Vector = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addScalar = js.Any.fromFunction1(addScalar), addScaledVector = js.Any.fromFunction2(addScaledVector), addVectors = js.Any.fromFunction2(addVectors), copy = js.Any.fromFunction1(copy), divideScalar = js.Any.fromFunction1(divideScalar), dot = js.Any.fromFunction1(dot), getComponent = js.Any.fromFunction1(getComponent), length = js.Any.fromFunction0(length), lengthSq = js.Any.fromFunction0(lengthSq), lerp = js.Any.fromFunction2(lerp), multiplyScalar = js.Any.fromFunction1(multiplyScalar), negate = js.Any.fromFunction0(negate), normalize = js.Any.fromFunction0(normalize), set = js.Any.fromFunction1(set), setComponent = js.Any.fromFunction2(setComponent), setLength = js.Any.fromFunction1(setLength), setScalar = js.Any.fromFunction1(setScalar), sub = js.Any.fromFunction1(sub), subVectors = js.Any.fromFunction2(subVectors))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[Vector]
    }
    
    extension [Self <: Vector](x: Self) {
      
      inline def setAdd(value: Vector => Vector): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setAddScalar(value: Double => Vector): Self = StObject.set(x, "addScalar", js.Any.fromFunction1(value))
      
      inline def setAddScaledVector(value: (Vector, Double) => Vector): Self = StObject.set(x, "addScaledVector", js.Any.fromFunction2(value))
      
      inline def setAddVectors(value: (Vector, Vector) => Vector): Self = StObject.set(x, "addVectors", js.Any.fromFunction2(value))
      
      inline def setCopy(value: Vector => Vector): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
      
      inline def setDistanceTo(value: Vector => Double): Self = StObject.set(x, "distanceTo", js.Any.fromFunction1(value))
      
      inline def setDistanceToSquared(value: Vector => Double): Self = StObject.set(x, "distanceToSquared", js.Any.fromFunction1(value))
      
      inline def setDistanceToSquaredUndefined: Self = StObject.set(x, "distanceToSquared", js.undefined)
      
      inline def setDistanceToUndefined: Self = StObject.set(x, "distanceTo", js.undefined)
      
      inline def setDivideScalar(value: Double => Vector): Self = StObject.set(x, "divideScalar", js.Any.fromFunction1(value))
      
      inline def setDot(value: Vector => Double): Self = StObject.set(x, "dot", js.Any.fromFunction1(value))
      
      inline def setEquals_(value: Vector => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setGetComponent(value: Double => Double): Self = StObject.set(x, "getComponent", js.Any.fromFunction1(value))
      
      inline def setLength(value: () => Double): Self = StObject.set(x, "length", js.Any.fromFunction0(value))
      
      inline def setLengthSq(value: () => Double): Self = StObject.set(x, "lengthSq", js.Any.fromFunction0(value))
      
      inline def setLerp(value: (Vector, Double) => Vector): Self = StObject.set(x, "lerp", js.Any.fromFunction2(value))
      
      inline def setMultiplyScalar(value: Double => Vector): Self = StObject.set(x, "multiplyScalar", js.Any.fromFunction1(value))
      
      inline def setNegate(value: () => Vector): Self = StObject.set(x, "negate", js.Any.fromFunction0(value))
      
      inline def setNormalize(value: () => Vector): Self = StObject.set(x, "normalize", js.Any.fromFunction0(value))
      
      inline def setSet(value: /* repeated */ Double => Vector): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      inline def setSetComponent(value: (Double, Double) => Vector): Self = StObject.set(x, "setComponent", js.Any.fromFunction2(value))
      
      inline def setSetLength(value: Double => Vector): Self = StObject.set(x, "setLength", js.Any.fromFunction1(value))
      
      inline def setSetScalar(value: Double => Vector): Self = StObject.set(x, "setScalar", js.Any.fromFunction1(value))
      
      inline def setSub(value: Vector => Vector): Self = StObject.set(x, "sub", js.Any.fromFunction1(value))
      
      inline def setSubVectors(value: (Vector, Vector) => Vector): Self = StObject.set(x, "subVectors", js.Any.fromFunction2(value))
    }
  }
}
