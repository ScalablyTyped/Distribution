package typings.three.global.THREE

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.BufferAttribute")
@js.native
open class BufferAttribute protected ()
  extends typings.three.mod.BufferAttribute {
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
}
