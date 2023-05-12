package typings.three.global.THREE

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.Uint8ClampedBufferAttribute")
@js.native
open class Uint8ClampedBufferAttribute protected ()
  extends typings.three.mod.Uint8ClampedBufferAttribute {
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
