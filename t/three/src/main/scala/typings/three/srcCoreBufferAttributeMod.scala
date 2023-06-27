package typings.three

import typings.std.ArrayLike
import typings.three.anon.Array
import typings.three.anon.Count
import typings.three.srcConstantsMod.Usage
import typings.three.srcMathMatrix3Mod.Matrix3
import typings.three.srcMathMatrix4Mod.Matrix4
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreBufferAttributeMod {
  
  @JSImport("three/src/core/BufferAttribute", "BufferAttribute")
  @js.native
  open class BufferAttribute protected () extends StObject {
    /**
      * This creates a new {@link THREE.GLBufferAttribute | GLBufferAttribute} object.
      * @param array Must be a `TypedArray`. Used to instantiate the buffer.
      * This array should have `itemSize * numVertices` elements, where numVertices is the number of vertices in the associated {@link THREE.BufferGeometry | BufferGeometry}.
      * @param itemSize the number of values of the {@link array} that should be associated with a particular vertex.
      * For instance, if this attribute is storing a 3-component vector (such as a _position_, _normal_, or _color_),
      * then itemSize should be `3`.
      * @param normalized Applies to integer data only.
      * Indicates how the underlying data in the buffer maps to the values in the GLSL code.
      * For instance, if {@link array} is an instance of `UInt16Array`, and  {@link normalized} is true,
      * the values `0` - `+65535` in the array data will be mapped to `0.0f` - `+1.0f` in the GLSL attribute.
      * An `Int16Array` (signed) would map from `-32768` - `+32767` to `-1.0f` - `+1.0f`.
      * If normalized is false, the values will be converted to floats unmodified,
      * i.e. `32767` becomes `32767.0f`.
      * Default `false`.
      * @throws `TypeError` When the {@link array} is not a `TypedArray`;
      */
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
    
    /**
      * Applies matrix {@link Matrix3 | m} to every Vector3 element of this {@link BufferAttribute}.
      * @param m
      */
    def applyMatrix3(m: Matrix3): this.type = js.native
    
    /**
      * Applies matrix {@link Matrix4 | m} to every Vector3 element of this {@link BufferAttribute}.
      * @param m
      */
    def applyMatrix4(m: Matrix4): this.type = js.native
    
    /**
      * Applies normal matrix {@link Matrix3 | m} to every Vector3 element of this {@link BufferAttribute}.
      * @param m
      */
    def applyNormalMatrix(m: Matrix3): this.type = js.native
    
    /**
      * The {@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray | TypedArray} holding data stored in the buffer.
      * @returns `TypedArray`
      */
    var array: ArrayLike[Double] = js.native
    
    /**
      * Copies another {@link BufferAttribute} to this {@link BufferAttribute}.
      * @param bufferAttribute
      */
    def copy(source: BufferAttribute): this.type = js.native
    
    /**
      * Copy the array given here (which can be a normal array or `TypedArray`) into {@link BufferAttribute.array | array}.
      * @see {@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/set | TypedArray.set} for notes on requirements if copying a `TypedArray`.
      */
    def copyArray(array: ArrayLike[Double]): this.type = js.native
    
    /**
      * Copy a vector from bufferAttribute[index2] to {@link BufferAttribute.array | array}[index1].
      * @param index1
      * @param bufferAttribute
      * @param index2
      */
    def copyAt(index1: Double, attribute: BufferAttribute, index2: Double): this.type = js.native
    
    /**
      * Stores the {@link BufferAttribute.array | array}'s length divided by the {@link BufferAttribute.itemSize | itemSize}.
      * @remarks If the buffer is storing a 3-component vector (such as a position, normal, or color), then this will count the number of such vectors stored.
      * @remarks Expects a `Integer`
      */
    var count: Double = js.native
    
    /**
      * Returns the w component of the vector at the given index.
      * @param index Expects a `Integer`
      */
    def getW(index: Double): Double = js.native
    
    /**
      * Returns the x component of the vector at the given index.
      * @param index Expects a `Integer`
      */
    def getX(index: Double): Double = js.native
    
    /**
      * Returns the y component of the vector at the given index.
      * @param index Expects a `Integer`
      */
    def getY(index: Double): Double = js.native
    
    /**
      * Returns the z component of the vector at the given index.
      * @param index Expects a `Integer`
      */
    def getZ(index: Double): Double = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link BufferAttribute}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isBufferAttribute: `true` = js.native
    
    /**
      * The length of vectors that are being stored in the {@link BufferAttribute.array | array}.
      * @remarks Expects a `Integer`
      */
    var itemSize: Double = js.native
    
    // array parameter should be `TypedArray`.
    /**
      * Optional name for this attribute instance.
      * @defaultValue ''
      */
    var name: String = js.native
    
    /**
      * Flag to indicate that this attribute has changed and should be re-sent to the GPU.
      * Set this to true when you modify the value of the array.
      * @remarks Setting this to true also increments the {@link BufferAttribute.version | version}.
      * @remarks _set-only property_.
      */
    def needsUpdate_=(value: Boolean): Unit = js.native
    
    /**
      * Indicates how the underlying data in the buffer maps to the values in the GLSL shader code.
      * @see `constructor` above for details.
      * @defaultValue `false`
      */
    var normalized: Boolean = js.native
    
    /**
      * Sets the value of the {@link onUploadCallback} property.
      * @see Example: {@link https://threejs.org/examples/#webgl_buffergeometry | WebGL / BufferGeometry} this is used to free memory after the buffer has been transferred to the GPU.
      * @see {@link onUploadCallback}
      * @param callback function that is executed after the Renderer has transferred the attribute array data to the GPU.
      */
    def onUpload(callback: js.Function0[Unit]): this.type = js.native
    
    /**
      * A callback function that is executed after the Renderer has transferred the attribute array data to the GPU.
      */
    def onUploadCallback(): Unit = js.native
    
    def set(value: js.typedarray.ArrayBufferView): this.type = js.native
    def set(value: js.typedarray.ArrayBufferView, offset: Double): this.type = js.native
    /**
      * Calls {@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/set | TypedArray.set}( {@link value}, {@link offset} )
      * on the {@link BufferAttribute.array | array}.
      * @param value {@link Array | Array} or `TypedArray` from which to copy values.
      * @param offset index of the {@link BufferAttribute.array | array} at which to start copying. Expects a `Integer`. Default `0`.
      * @throws `RangeError` When {@link offset} is negative or is too large.
      */
    def set(value: ArrayLike[Double]): this.type = js.native
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
    def setUsage(usage: Usage): this.type = js.native
    
    /**
      * Sets the w component of the vector at the given index.
      * @param index Expects a `Integer`
      * @param w
      */
    def setW(index: Double, z: Double): this.type = js.native
    
    /**
      * Sets the x component of the vector at the given index.
      * @param index Expects a `Integer`
      * @param x
      */
    def setX(index: Double, x: Double): this.type = js.native
    
    /**
      * Sets the x and y components of the vector at the given index.
      * @param index Expects a `Integer`
      * @param x
      * @param y
      */
    def setXY(index: Double, x: Double, y: Double): this.type = js.native
    
    /**
      * Sets the x, y and z components of the vector at the given index.
      * @param index Expects a `Integer`
      * @param x
      * @param y
      * @param z
      */
    def setXYZ(index: Double, x: Double, y: Double, z: Double): this.type = js.native
    
    /**
      * Sets the x, y, z and w components of the vector at the given index.
      * @param index Expects a `Integer`
      * @param x
      * @param y
      * @param z
      * @param w
      */
    def setXYZW(index: Double, x: Double, y: Double, z: Double, w: Double): this.type = js.native
    
    /**
      * Sets the y component of the vector at the given index.
      * @param index Expects a `Integer`
      * @param y
      */
    def setY(index: Double, y: Double): this.type = js.native
    
    /**
      * Sets the z component of the vector at the given index.
      * @param index Expects a `Integer`
      * @param z
      */
    def setZ(index: Double, z: Double): this.type = js.native
    
    /**
      * Convert this object to three.js to the `data.attributes` part of {@link https://github.com/mrdoob/three.js/wiki/JSON-Geometry-format-4 | JSON Geometry format v4},
      */
    def toJSON(): Array = js.native
    
    /**
      * Applies matrix {@link Matrix4 | m} to every Vector3 element of this {@link BufferAttribute}, interpreting the elements as a direction vectors.
      * @param m
      */
    def transformDirection(m: Matrix4): this.type = js.native
    
    /**
      * This can be used to only update some components of stored vectors (for example, just the component related to color).
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
      * A version number, incremented every time the {@link BufferAttribute.needsUpdate | needsUpdate} property is set to true.
      * @remarks Expects a `Integer`
      * @defaultValue `0`
      */
    var version: Double = js.native
  }
  
  @JSImport("three/src/core/BufferAttribute", "Float16BufferAttribute")
  @js.native
  open class Float16BufferAttribute protected () extends BufferAttribute {
    /**
      * This creates a new {@link THREE.Float16BufferAttribute | Float16BufferAttribute} object.
      * @param array This can be a typed or untyped (normal) array or an integer length. An array value will be converted to `Uint16Array`.
      * If a length is given a new `TypedArray` will created, initialized with all elements set to zero.
      * @param itemSize the number of values of the {@link array} that should be associated with a particular vertex.
      * For instance, if this attribute is storing a 3-component vector (such as a _position_, _normal_, or _color_),
      * then itemSize should be `3`.
      * @param normalized Applies to integer data only.
      * Indicates how the underlying data in the buffer maps to the values in the GLSL code.
      * For instance, if {@link array} is an instance of `UInt16Array`, and  {@link normalized} is true,
      * the values `0` - `+65535` in the array data will be mapped to `0.0f` - `+1.0f` in the GLSL attribute.
      * An `Int16Array` (signed) would map from `-32768` - `+32767` to `-1.0f` - `+1.0f`.
      * If normalized is false, the values will be converted to floats unmodified,
      * i.e. `32767` becomes `32767.0f`.
      * Default `false`.
      * @see {@link THREE.BufferAttribute | BufferAttribute}
      */
    def this(array: js.Iterable[Double], itemSize: Double) = this()
    def this(array: js.typedarray.ArrayBuffer, itemSize: Double) = this()
    def this(array: Double, itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: js.Iterable[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: js.typedarray.ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
    def this(array: Double, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
  }
  
  @JSImport("three/src/core/BufferAttribute", "Float32BufferAttribute")
  @js.native
  open class Float32BufferAttribute protected () extends BufferAttribute {
    /**
      * This creates a new {@link THREE.Float32BufferAttribute | Float32BufferAttribute} object.
      * @param array This can be a typed or untyped (normal) array or an integer length. An array value will be converted to `Float32Array`.
      * If a length is given a new `TypedArray` will created, initialized with all elements set to zero.
      * @param itemSize the number of values of the {@link array} that should be associated with a particular vertex.
      * For instance, if this attribute is storing a 3-component vector (such as a _position_, _normal_, or _color_),
      * then itemSize should be `3`.
      * @param normalized Applies to integer data only.
      * Indicates how the underlying data in the buffer maps to the values in the GLSL code.
      * For instance, if {@link array} is an instance of `UInt16Array`, and  {@link normalized} is true,
      * the values `0` - `+65535` in the array data will be mapped to `0.0f` - `+1.0f` in the GLSL attribute.
      * An `Int16Array` (signed) would map from `-32768` - `+32767` to `-1.0f` - `+1.0f`.
      * If normalized is false, the values will be converted to floats unmodified,
      * i.e. `32767` becomes `32767.0f`.
      * Default `false`.
      * @see {@link THREE.BufferAttribute | BufferAttribute}
      */
    def this(array: js.Iterable[Double], itemSize: Double) = this()
    def this(array: js.typedarray.ArrayBuffer, itemSize: Double) = this()
    def this(array: Double, itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: js.Iterable[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: js.typedarray.ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
    def this(array: Double, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
  }
  
  @JSImport("three/src/core/BufferAttribute", "Float64BufferAttribute")
  @js.native
  open class Float64BufferAttribute protected () extends BufferAttribute {
    /**
      * This creates a new {@link THREE.Float64BufferAttribute | Float64BufferAttribute} object.
      * @param array This can be a typed or untyped (normal) array or an integer length. An array value will be converted to `Float64Array`.
      * If a length is given a new `TypedArray` will created, initialized with all elements set to zero.
      * @param itemSize the number of values of the {@link array} that should be associated with a particular vertex.
      * For instance, if this attribute is storing a 3-component vector (such as a _position_, _normal_, or _color_),
      * then itemSize should be `3`.
      * @param normalized Applies to integer data only.
      * Indicates how the underlying data in the buffer maps to the values in the GLSL code.
      * For instance, if {@link array} is an instance of `UInt16Array`, and  {@link normalized} is true,
      * the values `0` - `+65535` in the array data will be mapped to `0.0f` - `+1.0f` in the GLSL attribute.
      * An `Int16Array` (signed) would map from `-32768` - `+32767` to `-1.0f` - `+1.0f`.
      * If normalized is false, the values will be converted to floats unmodified,
      * i.e. `32767` becomes `32767.0f`.
      * Default `false`.
      * @see {@link THREE.BufferAttribute | BufferAttribute}
      */
    def this(array: js.Iterable[Double], itemSize: Double) = this()
    def this(array: js.typedarray.ArrayBuffer, itemSize: Double) = this()
    def this(array: Double, itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: js.Iterable[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: js.typedarray.ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
    def this(array: Double, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
  }
  
  @JSImport("three/src/core/BufferAttribute", "Int16BufferAttribute")
  @js.native
  open class Int16BufferAttribute protected () extends BufferAttribute {
    /**
      * This creates a new {@link THREE.Int16BufferAttribute | Int16BufferAttribute} object.
      * @param array This can be a typed or untyped (normal) array or an integer length. An array value will be converted to `Int16Array`.
      * If a length is given a new `TypedArray` will created, initialized with all elements set to zero.
      * @param itemSize the number of values of the {@link array} that should be associated with a particular vertex.
      * For instance, if this attribute is storing a 3-component vector (such as a _position_, _normal_, or _color_),
      * then itemSize should be `3`.
      * @param normalized Applies to integer data only.
      * Indicates how the underlying data in the buffer maps to the values in the GLSL code.
      * For instance, if {@link array} is an instance of `UInt16Array`, and  {@link normalized} is true,
      * the values `0` - `+65535` in the array data will be mapped to `0.0f` - `+1.0f` in the GLSL attribute.
      * An `Int16Array` (signed) would map from `-32768` - `+32767` to `-1.0f` - `+1.0f`.
      * If normalized is false, the values will be converted to floats unmodified,
      * i.e. `32767` becomes `32767.0f`.
      * Default `false`.
      * @see {@link THREE.BufferAttribute | BufferAttribute}
      */
    def this(array: js.Iterable[Double], itemSize: Double) = this()
    def this(array: js.typedarray.ArrayBuffer, itemSize: Double) = this()
    def this(array: Double, itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: js.Iterable[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: js.typedarray.ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
    def this(array: Double, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
  }
  
  @JSImport("three/src/core/BufferAttribute", "Int32BufferAttribute")
  @js.native
  open class Int32BufferAttribute protected () extends BufferAttribute {
    /**
      * This creates a new {@link THREE.Int32BufferAttribute | Int32BufferAttribute} object.
      * @param array This can be a typed or untyped (normal) array or an integer length. An array value will be converted to `Int32Array`.
      * If a length is given a new `TypedArray` will created, initialized with all elements set to zero.
      * @param itemSize the number of values of the {@link array} that should be associated with a particular vertex.
      * For instance, if this attribute is storing a 3-component vector (such as a _position_, _normal_, or _color_),
      * then itemSize should be `3`.
      * @param normalized Applies to integer data only.
      * Indicates how the underlying data in the buffer maps to the values in the GLSL code.
      * For instance, if {@link array} is an instance of `UInt16Array`, and  {@link normalized} is true,
      * the values `0` - `+65535` in the array data will be mapped to `0.0f` - `+1.0f` in the GLSL attribute.
      * An `Int16Array` (signed) would map from `-32768` - `+32767` to `-1.0f` - `+1.0f`.
      * If normalized is false, the values will be converted to floats unmodified,
      * i.e. `32767` becomes `32767.0f`.
      * Default `false`.
      * @see {@link THREE.BufferAttribute | BufferAttribute}
      */
    def this(array: js.Iterable[Double], itemSize: Double) = this()
    def this(array: js.typedarray.ArrayBuffer, itemSize: Double) = this()
    def this(array: Double, itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: js.Iterable[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: js.typedarray.ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
    def this(array: Double, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
  }
  
  @JSImport("three/src/core/BufferAttribute", "Int8BufferAttribute")
  @js.native
  open class Int8BufferAttribute protected () extends BufferAttribute {
    /**
      * This creates a new {@link THREE.Int8BufferAttribute | Int8BufferAttribute} object.
      * @param array This can be a typed or untyped (normal) array or an integer length. An array value will be converted to `Int8Array`.
      * If a length is given a new `TypedArray` will created, initialized with all elements set to zero.
      * @param itemSize the number of values of the {@link array} that should be associated with a particular vertex.
      * For instance, if this attribute is storing a 3-component vector (such as a _position_, _normal_, or _color_),
      * then itemSize should be `3`.
      * @param normalized Applies to integer data only.
      * Indicates how the underlying data in the buffer maps to the values in the GLSL code.
      * For instance, if {@link array} is an instance of `UInt16Array`, and  {@link normalized} is true,
      * the values `0` - `+65535` in the array data will be mapped to `0.0f` - `+1.0f` in the GLSL attribute.
      * An `Int16Array` (signed) would map from `-32768` - `+32767` to `-1.0f` - `+1.0f`.
      * If normalized is false, the values will be converted to floats unmodified,
      * i.e. `32767` becomes `32767.0f`.
      * Default `false`.
      */
    def this(array: js.Iterable[Double], itemSize: Double) = this()
    def this(array: js.typedarray.ArrayBuffer, itemSize: Double) = this()
    def this(array: Double, itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: js.Iterable[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: js.typedarray.ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
    def this(array: Double, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
  }
  
  @JSImport("three/src/core/BufferAttribute", "Uint16BufferAttribute")
  @js.native
  open class Uint16BufferAttribute protected () extends BufferAttribute {
    /**
      * This creates a new {@link THREE.Uint16BufferAttribute | Uint16BufferAttribute} object.
      * @param array This can be a typed or untyped (normal) array or an integer length. An array value will be converted to `Uint16Array`.
      * If a length is given a new `TypedArray` will created, initialized with all elements set to zero.
      * @param itemSize the number of values of the {@link array} that should be associated with a particular vertex.
      * For instance, if this attribute is storing a 3-component vector (such as a _position_, _normal_, or _color_),
      * then itemSize should be `3`.
      * @param normalized Applies to integer data only.
      * Indicates how the underlying data in the buffer maps to the values in the GLSL code.
      * For instance, if {@link array} is an instance of `UInt16Array`, and  {@link normalized} is true,
      * the values `0` - `+65535` in the array data will be mapped to `0.0f` - `+1.0f` in the GLSL attribute.
      * An `Int16Array` (signed) would map from `-32768` - `+32767` to `-1.0f` - `+1.0f`.
      * If normalized is false, the values will be converted to floats unmodified,
      * i.e. `32767` becomes `32767.0f`.
      * Default `false`.
      * @see {@link THREE.BufferAttribute | BufferAttribute}
      */
    def this(array: js.Iterable[Double], itemSize: Double) = this()
    def this(array: js.typedarray.ArrayBuffer, itemSize: Double) = this()
    def this(array: Double, itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: js.Iterable[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: js.typedarray.ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
    def this(array: Double, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
  }
  
  @JSImport("three/src/core/BufferAttribute", "Uint32BufferAttribute")
  @js.native
  open class Uint32BufferAttribute protected () extends BufferAttribute {
    /**
      * This creates a new {@link THREE.Uint32BufferAttribute | Uint32BufferAttribute} object.
      * @param array This can be a typed or untyped (normal) array or an integer length. An array value will be converted to `Uint32Array`.
      * If a length is given a new `TypedArray` will created, initialized with all elements set to zero.
      * @param itemSize the number of values of the {@link array} that should be associated with a particular vertex.
      * For instance, if this attribute is storing a 3-component vector (such as a _position_, _normal_, or _color_),
      * then itemSize should be `3`.
      * @param normalized Applies to integer data only.
      * Indicates how the underlying data in the buffer maps to the values in the GLSL code.
      * For instance, if {@link array} is an instance of `UInt16Array`, and  {@link normalized} is true,
      * the values `0` - `+65535` in the array data will be mapped to `0.0f` - `+1.0f` in the GLSL attribute.
      * An `Int16Array` (signed) would map from `-32768` - `+32767` to `-1.0f` - `+1.0f`.
      * If normalized is false, the values will be converted to floats unmodified,
      * i.e. `32767` becomes `32767.0f`.
      * Default `false`.
      * @see {@link THREE.BufferAttribute | BufferAttribute}
      */
    def this(array: js.Iterable[Double], itemSize: Double) = this()
    def this(array: js.typedarray.ArrayBuffer, itemSize: Double) = this()
    def this(array: Double, itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: js.Iterable[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: js.typedarray.ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
    def this(array: Double, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
  }
  
  @JSImport("three/src/core/BufferAttribute", "Uint8BufferAttribute")
  @js.native
  open class Uint8BufferAttribute protected () extends BufferAttribute {
    /**
      * This creates a new {@link THREE.Uint8BufferAttribute | Uint8BufferAttribute} object.
      * @param array This can be a typed or untyped (normal) array or an integer length. An array value will be converted to `Uint8Array`.
      * If a length is given a new `TypedArray` will created, initialized with all elements set to zero.
      * @param itemSize the number of values of the {@link array} that should be associated with a particular vertex.
      * For instance, if this attribute is storing a 3-component vector (such as a _position_, _normal_, or _color_),
      * then itemSize should be `3`.
      * @param normalized Applies to integer data only.
      * Indicates how the underlying data in the buffer maps to the values in the GLSL code.
      * For instance, if {@link array} is an instance of `UInt16Array`, and  {@link normalized} is true,
      * the values `0` - `+65535` in the array data will be mapped to `0.0f` - `+1.0f` in the GLSL attribute.
      * An `Int16Array` (signed) would map from `-32768` - `+32767` to `-1.0f` - `+1.0f`.
      * If normalized is false, the values will be converted to floats unmodified,
      * i.e. `32767` becomes `32767.0f`.
      * Default `false`.
      * @see {@link THREE.BufferAttribute | BufferAttribute}
      */
    def this(array: js.Iterable[Double], itemSize: Double) = this()
    def this(array: js.typedarray.ArrayBuffer, itemSize: Double) = this()
    def this(array: Double, itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: js.Iterable[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: js.typedarray.ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
    def this(array: Double, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
  }
  
  @JSImport("three/src/core/BufferAttribute", "Uint8ClampedBufferAttribute")
  @js.native
  open class Uint8ClampedBufferAttribute protected () extends BufferAttribute {
    /**
      * This creates a new {@link THREE.Uint8ClampedBufferAttribute | Uint8ClampedBufferAttribute} object.
      * @param array This can be a typed or untyped (normal) array or an integer length. An array value will be converted to `Uint8ClampedArray`.
      * If a length is given a new `TypedArray` will created, initialized with all elements set to zero.
      * @param itemSize the number of values of the {@link array} that should be associated with a particular vertex.
      * For instance, if this attribute is storing a 3-component vector (such as a _position_, _normal_, or _color_),
      * then itemSize should be `3`.
      * @param normalized Applies to integer data only.
      * Indicates how the underlying data in the buffer maps to the values in the GLSL code.
      * For instance, if {@link array} is an instance of `UInt16Array`, and  {@link normalized} is true,
      * the values `0` - `+65535` in the array data will be mapped to `0.0f` - `+1.0f` in the GLSL attribute.
      * An `Int16Array` (signed) would map from `-32768` - `+32767` to `-1.0f` - `+1.0f`.
      * If normalized is false, the values will be converted to floats unmodified,
      * i.e. `32767` becomes `32767.0f`.
      * Default `false`.
      * @see {@link THREE.BufferAttribute | BufferAttribute}
      */
    def this(array: js.Iterable[Double], itemSize: Double) = this()
    def this(array: js.typedarray.ArrayBuffer, itemSize: Double) = this()
    def this(array: Double, itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: js.Iterable[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: js.typedarray.ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
    def this(array: Double, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
  }
}
