package typings.three

import typings.std.ArrayLike
import typings.three.anon.IsInterleavedBufferAttribute
import typings.three.srcCoreBufferAttributeMod.BufferAttribute
import typings.three.srcCoreInterleavedBufferMod.InterleavedBuffer
import typings.three.srcMathMatrix3Mod.Matrix
import typings.three.srcMathMatrix4Mod.Matrix4
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreInterleavedBufferAttributeMod {
  
  @JSImport("three/src/core/InterleavedBufferAttribute", "InterleavedBufferAttribute")
  @js.native
  open class InterleavedBufferAttribute protected () extends StObject {
    /**
      * Create a new instance of {@link THREE.InterleavedBufferAttribute | InterleavedBufferAttribute}.
      * @param interleavedBuffer
      * @param itemSize
      * @param offset
      * @param normalized Default `false`.
      */
    def this(interleavedBuffer: InterleavedBuffer, itemSize: Double, offset: Double) = this()
    def this(interleavedBuffer: InterleavedBuffer, itemSize: Double, offset: Double, normalized: Boolean) = this()
    
    /**
      * Applies matrix {@link Matrix4 | m} to every Vector3 element of this InterleavedBufferAttribute.
      * @param m
      */
    def applyMatrix4(m: Matrix4): this.type = js.native
    
    /**
      * Applies normal matrix {@link Matrix3 | m} to every Vector3 element of this InterleavedBufferAttribute.
      * @param m
      */
    def applyNormalMatrix(matrix: Matrix): this.type = js.native
    
    /**
      * The value of {@link InterleavedBufferAttribute.data | data}.{@link InterleavedBuffer.array | array}.
      * @remarks _get-only property_.
      */
    def array: ArrayLike[Double] = js.native
    
    def clone(data: js.Object): BufferAttribute = js.native
    
    /**
      * The value of {@link data | .data}.{@link InterleavedBuffer.count | count}.
      * If the buffer is storing a 3-component item (such as a _position, normal, or color_), then this will count the number of such items stored.
      * @remarks _get-only property_.
      * @remarks Expects a `Integer`
      */
    def count: Double = js.native
    
    /**
      * The {@link InterleavedBuffer | InterleavedBuffer} instance passed in the constructor.
      */
    var data: InterleavedBuffer = js.native
    
    /**
      * Returns the w component of the item at the given index.
      * @param index Expects a `Integer`
      */
    def getW(index: Double): Double = js.native
    
    /**
      * Returns the x component of the item at the given index.
      * @param index Expects a `Integer`
      */
    def getX(index: Double): Double = js.native
    
    /**
      * Returns the y component of the item at the given index.
      * @param index Expects a `Integer`
      */
    def getY(index: Double): Double = js.native
    
    /**
      * Returns the z component of the item at the given index.
      * @param index Expects a `Integer`
      */
    def getZ(index: Double): Double = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link InterleavedBufferAttribute}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isInterleavedBufferAttribute: `true` = js.native
    
    /**
      * How many values make up each item.
      * @remarks Expects a `Integer`
      */
    var itemSize: Double = js.native
    
    /**
      * Optional name for this attribute instance.
      * @defaultValue `''`
      */
    var name: String = js.native
    
    /**
      * Flag to indicate that the {@link data | .data} ({@link InterleavedBuffer}) attribute has changed and should be re-sent to the GPU.
      * @remarks Setting this to have the same result of setting true also increments the {@link InterleavedBuffer.needsUpdate | InterleavedBuffer.needsUpdate} of {@link data | .data}.
      * @remarks Setting this to true also increments the {@link InterleavedBuffer.version | InterleavedBuffer.version}.
      * @remarks _set-only property_.
      */
    def needsUpdate_=(value: Boolean): Unit = js.native
    
    /**
      * @defaultValue `false`
      */
    var normalized: Boolean = js.native
    
    /**
      * The offset in the underlying array buffer where an item starts.
      * @remarks Expects a `Integer`
      */
    var offset: Double = js.native
    
    /**
      * Sets the w component of the item at the given index.
      * @param index Expects a `Integer`
      * @param w Expects a `Float`
      */
    def setW(index: Double, z: Double): this.type = js.native
    
    /**
      * Sets the x component of the item at the given index.
      * @param index Expects a `Integer`
      * @param x Expects a `Float`
      */
    def setX(index: Double, x: Double): this.type = js.native
    
    /**
      * Sets the x and y components of the item at the given index.
      * @param index Expects a `Integer`
      * @param x Expects a `Float`
      * @param y Expects a `Float`
      */
    def setXY(index: Double, x: Double, y: Double): this.type = js.native
    
    /**
      * Sets the x, y and z components of the item at the given index.
      * @param index Expects a `Integer`
      * @param x Expects a `Float`
      * @param y Expects a `Float`
      * @param z Expects a `Float`
      */
    def setXYZ(index: Double, x: Double, y: Double, z: Double): this.type = js.native
    
    /**
      * Sets the x, y, z and w components of the item at the given index.
      * @param index Expects a `Integer`
      * @param x Expects a `Float`
      * @param y Expects a `Float`
      * @param z Expects a `Float`
      * @param w Expects a `Float`
      */
    def setXYZW(index: Double, x: Double, y: Double, z: Double, w: Double): this.type = js.native
    
    /**
      * Sets the y component of the item at the given index.
      * @param index Expects a `Integer`
      * @param y Expects a `Float`
      */
    def setY(index: Double, y: Double): this.type = js.native
    
    /**
      * Sets the z component of the item at the given index.
      * @param index Expects a `Integer`
      * @param z Expects a `Float`
      */
    def setZ(index: Double, z: Double): this.type = js.native
    
    /**
      * Serializes this {@link InterleavedBufferAttribute}.
      * Converting to {@link https://github.com/mrdoob/three.js/wiki/JSON-Geometry-format-4 | JSON Geometry format v4},
      * @param data This object holds shared array buffers required for properly serializing geometries with interleaved attributes.
      */
    def toJSON(): IsInterleavedBufferAttribute = js.native
    def toJSON(data: js.Object): IsInterleavedBufferAttribute = js.native
    
    /**
      * Applies matrix {@link Matrix4 | m} to every Vector3 element of this InterleavedBufferAttribute, interpreting the elements as a direction vectors.
      * @param m
      */
    def transformDirection(matrix: Matrix): this.type = js.native
  }
}
