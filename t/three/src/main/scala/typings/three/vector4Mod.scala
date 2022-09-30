package typings.three

import typings.std.ArrayLike
import typings.three.bufferAttributeMod.BufferAttribute
import typings.three.matrix4Mod.Matrix4
import typings.three.quaternionMod.Quaternion
import typings.three.threeBooleans.`true`
import typings.three.threeInts.`0`
import typings.three.vector2Mod.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vector4Mod {
  
  @JSImport("three/src/math/Vector4", "Vector4")
  @js.native
  open class Vector4 ()
    extends StObject
       with Vector {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    def this(x: Double, y: Unit, z: Double) = this()
    def this(x: Unit, y: Double, z: Double) = this()
    def this(x: Unit, y: Unit, z: Double) = this()
    def this(x: Double, y: Double, z: Double, w: Double) = this()
    def this(x: Double, y: Double, z: Unit, w: Double) = this()
    def this(x: Double, y: Unit, z: Double, w: Double) = this()
    def this(x: Double, y: Unit, z: Unit, w: Double) = this()
    def this(x: Unit, y: Double, z: Double, w: Double) = this()
    def this(x: Unit, y: Double, z: Unit, w: Double) = this()
    def this(x: Unit, y: Unit, z: Double, w: Double) = this()
    def this(x: Unit, y: Unit, z: Unit, w: Double) = this()
    
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
    def add(v: Vector4): this.type = js.native
    
    /**
      * Adds the scalar value s to this vector's values.
      */
    /* CompleteClass */
    override def addScalar(scalar: Double): this.type = js.native
    
    /* CompleteClass */
    override def addScaledVector(vector: Vector, scale: Double): this.type = js.native
    def addScaledVector(v: Vector4, s: Double): this.type = js.native
    
    /**
      * addVectors(a:T, b:T):T;
      */
    /* CompleteClass */
    override def addVectors(a: Vector, b: Vector): this.type = js.native
    /**
      * Sets this vector to a + b.
      */
    def addVectors(a: Vector4, b: Vector4): this.type = js.native
    
    def applyMatrix4(m: Matrix4): this.type = js.native
    
    def ceil(): this.type = js.native
    
    def clamp(min: Vector4, max: Vector4): this.type = js.native
    
    def clampScalar(min: Double, max: Double): this.type = js.native
    
    /**
      * copy(v:T):T;
      */
    /* CompleteClass */
    override def copy(v: Vector): this.type = js.native
    /**
      * Copies value of v to this vector.
      */
    def copy(v: Vector4): this.type = js.native
    
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
    def dot(v: Vector4): Double = js.native
    
    /**
      * equals(v:T):boolean;
      */
    /* CompleteClass */
    override def equals(v: Vector): Boolean = js.native
    /**
      * Checks for strict equality of this vector and v.
      */
    def equals(v: Vector4): Boolean = js.native
    
    def floor(): this.type = js.native
    
    /**
      * Sets this vector's x, y, z and w value from the provided array or array-like.
      * @param array the source array or array-like.
      * @param offset (optional) offset into the array. Default is 0.
      */
    def fromArray(array: js.Array[Double]): this.type = js.native
    def fromArray(array: js.Array[Double], offset: Double): this.type = js.native
    def fromArray(array: ArrayLike[Double]): this.type = js.native
    def fromArray(array: ArrayLike[Double], offset: Double): this.type = js.native
    
    def fromBufferAttribute(attribute: BufferAttribute, index: Double): this.type = js.native
    
    /* CompleteClass */
    override def getComponent(index: Double): Double = js.native
    
    var height: Double = js.native
    
    val isVector4: `true` = js.native
    
    /**
      * length():number;
      */
    /* CompleteClass */
    override def length(): Double = js.native
    
    /**
      * lengthSq():number;
      */
    /* CompleteClass */
    override def lengthSq(): Double = js.native
    
    /**
      * lerp(v:T, alpha:number):T;
      */
    /* CompleteClass */
    override def lerp(v: Vector, alpha: Double): this.type = js.native
    /**
      * Linearly interpolate between this vector and v with alpha factor.
      */
    def lerp(v: Vector4, alpha: Double): this.type = js.native
    
    def lerpVectors(v1: Vector4, v2: Vector4, alpha: Double): this.type = js.native
    
    /**
      * Computes the Manhattan length of this vector.
      *
      * see {@link http://en.wikipedia.org/wiki/Taxicab_geometry|Wikipedia: Taxicab Geometry}
      */
    def manhattanLength(): Double = js.native
    
    def max(v: Vector4): this.type = js.native
    
    def min(v: Vector4): this.type = js.native
    
    def multiply(v: Vector4): this.type = js.native
    
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
      * Sets this vector's x, y, z and w from Math.random
      */
    def random(): this.type = js.native
    
    def round(): this.type = js.native
    
    def roundToZero(): this.type = js.native
    
    /* CompleteClass */
    override def set(args: Double*): this.type = js.native
    /**
      * Sets value of this vector.
      */
    def set(x: Double, y: Double, z: Double, w: Double): this.type = js.native
    
    /**
      * http://www.euclideanspace.com/maths/geometry/rotations/conversions/quaternionToAngle/index.htm
      * @param q is assumed to be normalized
      */
    def setAxisAngleFromQuaternion(q: Quaternion): this.type = js.native
    
    /**
      * http://www.euclideanspace.com/maths/geometry/rotations/conversions/matrixToAngle/index.htm
      * @param m assumes the upper 3x3 of m is a pure rotation matrix (i.e, unscaled)
      */
    def setAxisAngleFromRotationMatrix(m: Matrix4): this.type = js.native
    
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
      * Sets w component of this vector.
      */
    def setW(w: Double): this.type = js.native
    
    /**
      * Sets X component of this vector.
      */
    def setX(x: Double): this.type = js.native
    
    /**
      * Sets Y component of this vector.
      */
    def setY(y: Double): this.type = js.native
    
    /**
      * Sets Z component of this vector.
      */
    def setZ(z: Double): this.type = js.native
    
    /**
      * sub(v:T):T;
      */
    /* CompleteClass */
    override def sub(v: Vector): this.type = js.native
    /**
      * Subtracts v from this vector.
      */
    def sub(v: Vector4): this.type = js.native
    
    def subScalar(s: Double): this.type = js.native
    
    /**
      * subVectors(a:T, b:T):T;
      */
    /* CompleteClass */
    override def subVectors(a: Vector, b: Vector): this.type = js.native
    /**
      * Sets this vector to a - b.
      */
    def subVectors(a: Vector4, b: Vector4): this.type = js.native
    
    def toArray(): Vector4Tuple = js.native
    def toArray(array: js.Array[Double]): js.Array[Double] = js.native
    def toArray(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
    def toArray(array: Unit, offset: Double): js.Array[Double] = js.native
    /**
      * Copies x, y, z and w into the provided array-like.
      * @param array array-like to store the vector to.
      * @param offset (optional) optional offset into the array-like.
      * @return The provided array-like.
      */
    def toArray(array: ArrayLike[Double]): ArrayLike[Double] = js.native
    def toArray(array: ArrayLike[Double], offset: Double): ArrayLike[Double] = js.native
    def toArray(array: Vector4Tuple): Vector4Tuple = js.native
    @JSName("toArray")
    def toArray_0(array: Unit, offset: `0`): Vector4Tuple = js.native
    @JSName("toArray")
    def toArray_0(array: Vector4Tuple, offset: `0`): Vector4Tuple = js.native
    /**
      * Returns an array [x, y, z, w], or copies x, y, z and w into the provided array.
      * @param array (optional) array to store the vector to. If this is not provided, a new array will be created.
      * @param offset (optional) optional offset into the array.
      * @return The created or provided array.
      */
    @JSName("toArray")
    def toArray_Array(): js.Array[Double] = js.native
    
    /**
      * @default 0
      */
    var w: Double = js.native
    
    var width: Double = js.native
    
    /**
      * @default 0
      */
    var x: Double = js.native
    
    /**
      * @default 0
      */
    var y: Double = js.native
    
    /**
      * @default 0
      */
    var z: Double = js.native
  }
  
  type Vector4Tuple = js.Tuple4[Double, Double, Double, Double]
}
