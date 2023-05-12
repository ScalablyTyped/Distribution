package typings.three

import typings.std.ArrayLike
import typings.three.anon.Buffer
import typings.three.anon.Count
import typings.three.srcConstantsMod.Usage
import typings.three.srcCoreInterleavedBufferAttributeMod.InterleavedBufferAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreInterleavedBufferMod {
  
  @JSImport("three/src/core/InterleavedBuffer", "InterleavedBuffer")
  @js.native
  open class InterleavedBuffer protected () extends StObject {
    /**
      * Create a new instance of {@link InterleavedBuffer}
      * @param array A {@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray | TypedArray} with a shared buffer. Stores the geometry data.
      * @param stride The number of typed-array elements per vertex. Expects a `Integer`
      */
    def this(array: ArrayLike[Double], stride: Double) = this()
    
    /**
      * A {@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray | TypedArray} with a shared buffer. Stores the geometry data.
      */
    var array: ArrayLike[Double] = js.native
    
    /**
      * Creates a clone of this {@link InterleavedBuffer}.
      * @param data This object holds shared array buffers required for properly cloning geometries with interleaved attributes.
      */
    def clone(data: js.Object): InterleavedBuffer = js.native
    
    /**
      * Copies another {@link InterleavedBuffer} to this {@link InterleavedBuffer} instance.
      * @param source
      */
    def copy(source: InterleavedBuffer): this.type = js.native
    
    /**
      * Copies data from {@link attribute}[{@link index2}] to {@link InterleavedBuffer.array | array}[{@link index1}].
      * @param index1 Expects a `Integer`
      * @param attribute
      * @param index2 Expects a `Integer`
      */
    def copyAt(index1: Double, attribute: InterleavedBufferAttribute, index2: Double): this.type = js.native
    
    /**
      * Gives the total number of elements in the array.
      * @remarks Expects a `Integer`
      * @defaultValue 0
      */
    var count: Double = js.native
    
    /**
      * Flag to indicate that this attribute has changed and should be re-sent to the GPU.
      * Set this to true when you modify the value of the array.
      * @remarks Setting this to true also increments the {@link BufferAttribute.version | version}.
      * @remarks _set-only property_.
      */
    def needsUpdate_=(value: Boolean): Unit = js.native
    
    /**
      * Calls {@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/set | TypedArray.set}( {@link value}, {@link offset} )
      * on the {@link BufferAttribute.array | array}.
      * @param value The source `TypedArray`.
      * @param offset index of the {@link BufferAttribute.array | array} at which to start copying. Expects a `Integer`. Default `0`.
      * @throws `RangeError` When {@link offset} is negative or is too large.
      */
    def set(value: ArrayLike[Double], offset: Double): this.type = js.native
    
    /**
      * Set {@link BufferAttribute.usage | usage}
      * @remarks
      * After the initial use of a buffer, its usage cannot be changed. Instead, instantiate a new one and set the desired usage before the next render.
      * @see {@link https://threejs.org/docs/index.html#api/en/constants/BufferAttributeUsage | Buffer Attribute Usage Constants} for all possible values.
      * @see {@link BufferAttribute.usage | usage}
      * @param value Corresponds to the {@link BufferAttribute.usage | usage} parameter of
      * {@link https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData | WebGLRenderingContext.bufferData}.
      */
    def setUsage(value: Usage): this.type = js.native
    
    /**
      * The number of {@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray | TypedArray} elements per vertex.
      * @remarks Expects a `Integer`
      */
    var stride: Double = js.native
    
    /**
      * Serializes this {@link InterleavedBuffer}.
      * Converting to {@link https://github.com/mrdoob/three.js/wiki/JSON-Geometry-format-4 | JSON Geometry format v4},
      * @param data This object holds shared array buffers required for properly serializing geometries with interleaved attributes.
      */
    def toJSON(data: js.Object): Buffer = js.native
    
    /**
      * Object containing offset and count.
      * @defaultValue `{ offset: number = 0; count: number = -1 }`
      */
    var updateRange: Count = js.native
    
    /**
      * Defines the intended usage pattern of the data store for optimization purposes.
      * Corresponds to the {@link BufferAttribute.usage | usage} parameter of
      * {@link https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData | WebGLRenderingContext.bufferData}.
      * @remarks
      * After the initial use of a buffer, its usage cannot be changed. Instead, instantiate a new one and set the desired usage before the next render.
      * @see {@link https://threejs.org/docs/index.html#api/en/constants/BufferAttributeUsage | Buffer Attribute Usage Constants} for all possible values.
      * @see {@link BufferAttribute.setUsage | setUsage}
      * @defaultValue {@link THREE.StaticDrawUsage | THREE.StaticDrawUsage}.
      */
    var usage: Usage = js.native
    
    /**
      * {@link http://en.wikipedia.org/wiki/Universally_unique_identifier | UUID} of this object instance.
      * @remarks This gets automatically assigned and shouldn't be edited.
      */
    var uuid: String = js.native
    
    /**
      * A version number, incremented every time the {@link BufferAttribute.needsUpdate | needsUpdate} property is set to true.
      * @remarks Expects a `Integer`
      * @defaultValue `0`
      */
    var version: Double = js.native
  }
}
