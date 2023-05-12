package typings.three

import typings.std.ArrayLike
import typings.std.Generator
import typings.three.srcCoreBufferAttributeMod.BufferAttribute
import typings.three.srcCoreInterleavedBufferAttributeMod.InterleavedBufferAttribute
import typings.three.srcMathEulerMod.Euler
import typings.three.srcMathMatrix4Mod.Matrix4
import typings.three.srcMathVector3Mod.Vector3
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMathQuaternionMod {
  
  @JSImport("three/src/math/Quaternion", "Quaternion")
  @js.native
  /**
    * @param x x coordinate
    * @param y y coordinate
    * @param z z coordinate
    * @param w w coordinate
    */
  open class Quaternion () extends StObject {
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
    
    def _onChange(callback: js.Function0[Unit]): Quaternion = js.native
    
    def _onChangeCallback(): Unit = js.native
    
    def angleTo(q: Quaternion): Double = js.native
    
    def conjugate(): Quaternion = js.native
    
    /**
      * Copies values of q to this quaternion.
      */
    def copy(q: Quaternion): this.type = js.native
    
    def dot(v: Quaternion): Double = js.native
    
    def equals(v: Quaternion): Boolean = js.native
    
    /**
      * Sets this quaternion's x, y, z and w value from the provided array or array-like.
      * @param array the source array or array-like.
      * @param offset (optional) offset into the array. Default is 0.
      */
    def fromArray(array: js.Array[Double]): this.type = js.native
    def fromArray(array: js.Array[Double], offset: Double): this.type = js.native
    def fromArray(array: ArrayLike[Double]): this.type = js.native
    def fromArray(array: ArrayLike[Double], offset: Double): this.type = js.native
    
    /**
      * Sets x, y, z, w properties of this quaternion from the attribute.
      * @param attribute the source attribute.
      * @param index index in the attribute.
      */
    def fromBufferAttribute(attribute: BufferAttribute, index: Double): Quaternion = js.native
    def fromBufferAttribute(attribute: InterleavedBufferAttribute, index: Double): Quaternion = js.native
    
    def identity(): Quaternion = js.native
    
    /**
      * Inverts this quaternion.
      */
    def invert(): Quaternion = js.native
    
    val isQuaternion: `true` = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Generator[Double, Unit, Any]] = js.native
    
    /**
      * Computes length of this quaternion.
      */
    def length(): Double = js.native
    
    def lengthSq(): Double = js.native
    
    /**
      * Multiplies this quaternion by b.
      */
    def multiply(q: Quaternion): Quaternion = js.native
    
    /**
      * Sets this quaternion to a x b
      * Adapted from http://www.euclideanspace.com/maths/algebra/realNormedAlgebra/quaternions/code/index.htm.
      */
    def multiplyQuaternions(a: Quaternion, b: Quaternion): Quaternion = js.native
    
    /**
      * @deprecated Use {@link Vector#applyQuaternion vector.applyQuaternion( quaternion )} instead.
      */
    def multiplyVector3(v: Any): Any = js.native
    
    /**
      * Normalizes this quaternion.
      */
    def normalize(): Quaternion = js.native
    
    def premultiply(q: Quaternion): Quaternion = js.native
    
    def random(): Quaternion = js.native
    
    def rotateTowards(q: Quaternion, step: Double): Quaternion = js.native
    
    /**
      * Sets values of this quaternion.
      */
    def set(x: Double, y: Double, z: Double, w: Double): Quaternion = js.native
    
    /**
      * Sets this quaternion from rotation specified by axis and angle.
      * Adapted from http://www.euclideanspace.com/maths/geometry/rotations/conversions/angleToQuaternion/index.htm.
      * Axis have to be normalized, angle is in radians.
      */
    def setFromAxisAngle(axis: Vector3, angle: Double): Quaternion = js.native
    
    /**
      * Sets this quaternion from rotation specified by Euler angles.
      */
    def setFromEuler(euler: Euler): Quaternion = js.native
    def setFromEuler(euler: Euler, update: Boolean): Quaternion = js.native
    
    /**
      * Sets this quaternion from rotation component of m. Adapted from http://www.euclideanspace.com/maths/geometry/rotations/conversions/matrixToQuaternion/index.htm.
      */
    def setFromRotationMatrix(m: Matrix4): Quaternion = js.native
    
    def setFromUnitVectors(vFrom: Vector3, vTo: Vector3): Quaternion = js.native
    
    def slerp(qb: Quaternion, t: Double): Quaternion = js.native
    
    def slerpQuaternions(qa: Quaternion, qb: Quaternion, t: Double): Quaternion = js.native
    
    /**
      * Returns an array [x, y, z, w], or copies x, y, z and w into the provided array.
      * @param array (optional) array to store the quaternion to. If this is not provided, a new array will be created.
      * @param offset (optional) optional offset into the array.
      * @return The created or provided array.
      */
    def toArray(): js.Array[Double] = js.native
    def toArray(array: js.Array[Double]): js.Array[Double] = js.native
    def toArray(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
    def toArray(array: Unit, offset: Double): js.Array[Double] = js.native
    /**
      * Copies x, y, z and w into the provided array-like.
      * @param array array-like to store the quaternion to.
      * @param offset (optional) optional offset into the array.
      * @return The provided array-like.
      */
    def toArray(array: ArrayLike[Double]): ArrayLike[Double] = js.native
    def toArray(array: ArrayLike[Double], offset: Double): ArrayLike[Double] = js.native
    
    /**
      * This method defines the serialization result of Quaternion.
      * @return The numerical elements of this quaternion in an array of format [x, y, z, w].
      */
    def toJSON(): js.Tuple4[Double, Double, Double, Double] = js.native
    
    /**
      * @default 1
      */
    var w: Double = js.native
    
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
  /* static members */
  object Quaternion {
    
    @JSImport("three/src/math/Quaternion", "Quaternion")
    @js.native
    val ^ : js.Any = js.native
    
    inline def multiplyQuaternionsFlat(
      dst: js.Array[Double],
      dstOffset: Double,
      src0: js.Array[Double],
      srcOffset: Double,
      src1: js.Array[Double],
      stcOffset1: Double
    ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyQuaternionsFlat")(dst.asInstanceOf[js.Any], dstOffset.asInstanceOf[js.Any], src0.asInstanceOf[js.Any], srcOffset.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], stcOffset1.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * @deprecated Use qm.slerpQuaternions( qa, qb, t ) instead..
      */
    inline def slerp(qa: Quaternion, qb: Quaternion, qm: Quaternion, t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("slerp")(qa.asInstanceOf[js.Any], qb.asInstanceOf[js.Any], qm.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def slerpFlat(
      dst: js.Array[Double],
      dstOffset: Double,
      src0: js.Array[Double],
      srcOffset: Double,
      src1: js.Array[Double],
      stcOffset1: Double,
      t: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("slerpFlat")(dst.asInstanceOf[js.Any], dstOffset.asInstanceOf[js.Any], src0.asInstanceOf[js.Any], srcOffset.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], stcOffset1.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
