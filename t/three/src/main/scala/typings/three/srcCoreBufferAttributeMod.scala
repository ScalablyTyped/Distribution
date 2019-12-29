package typings.three

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.ArrayLike
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/core/BufferAttribute", JSImport.Namespace)
@js.native
object srcCoreBufferAttributeMod extends js.Object {
  @js.native
  class BufferAttribute protected () extends js.Object {
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
    var array: ArrayLike[Double] = js.native
    var count: Double = js.native
    var dynamic: Boolean = js.native
    var itemSize: Double = js.native
    /**
    	 * @deprecated Use {@link BufferAttribute#count .count} instead.
    	 */
    var length: Double = js.native
     // array parameter should be TypedArray.
    var name: String = js.native
    var needsUpdate: Boolean = js.native
    var normalized: Boolean = js.native
    var onUpload: js.Function = js.native
    var updateRange: Anon_Count = js.native
    var version: Double = js.native
    def copy(source: BufferAttribute): this.type = js.native
    def copyArray(array: ArrayLike[Double]): BufferAttribute = js.native
    def copyAt(index1: Double, attribute: BufferAttribute, index2: Double): BufferAttribute = js.native
    def copyColorsArray(colors: js.Array[Anon_B]): BufferAttribute = js.native
    def copyVector2sArray(vectors: js.Array[Anon_X]): BufferAttribute = js.native
    def copyVector3sArray(vectors: js.Array[Anon_XY]): BufferAttribute = js.native
    def copyVector4sArray(vectors: js.Array[Anon_W]): BufferAttribute = js.native
    def getW(index: Double): Double = js.native
    def getX(index: Double): Double = js.native
    def getY(index: Double): Double = js.native
    def getZ(index: Double): Double = js.native
    def set(value: ArrayBufferView): BufferAttribute = js.native
    def set(value: ArrayBufferView, offset: Double): BufferAttribute = js.native
    def set(value: ArrayLike[Double]): BufferAttribute = js.native
    def set(value: ArrayLike[Double], offset: Double): BufferAttribute = js.native
    def setDynamic(dynamic: Boolean): BufferAttribute = js.native
    def setW(index: Double, z: Double): BufferAttribute = js.native
    def setX(index: Double, x: Double): BufferAttribute = js.native
    def setXY(index: Double, x: Double, y: Double): BufferAttribute = js.native
    def setXYZ(index: Double, x: Double, y: Double, z: Double): BufferAttribute = js.native
    def setXYZW(index: Double, x: Double, y: Double, z: Double, w: Double): BufferAttribute = js.native
    def setY(index: Double, y: Double): BufferAttribute = js.native
    def setZ(index: Double, z: Double): BufferAttribute = js.native
  }
  
  @js.native
  class Float32Attribute protected () extends BufferAttribute {
    def this(array: js.Any, itemSize: Double) = this()
  }
  
  @js.native
  class Float32BufferAttribute protected () extends BufferAttribute {
    def this(array: ArrayBuffer, itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: Iterable[Double], itemSize: Double) = this()
    def this(array: ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: Iterable[Double], itemSize: Double, normalized: Boolean) = this()
  }
  
  @js.native
  class Float64Attribute protected () extends BufferAttribute {
    def this(array: js.Any, itemSize: Double) = this()
  }
  
  @js.native
  class Float64BufferAttribute protected () extends BufferAttribute {
    def this(array: ArrayBuffer, itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: Iterable[Double], itemSize: Double) = this()
    def this(array: ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: Iterable[Double], itemSize: Double, normalized: Boolean) = this()
  }
  
  @js.native
  class Int16Attribute protected () extends BufferAttribute {
    def this(array: js.Any, itemSize: Double) = this()
  }
  
  @js.native
  class Int16BufferAttribute protected () extends BufferAttribute {
    def this(array: ArrayBuffer, itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: Iterable[Double], itemSize: Double) = this()
    def this(array: ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: Iterable[Double], itemSize: Double, normalized: Boolean) = this()
  }
  
  @js.native
  class Int32Attribute protected () extends BufferAttribute {
    def this(array: js.Any, itemSize: Double) = this()
  }
  
  @js.native
  class Int32BufferAttribute protected () extends BufferAttribute {
    def this(array: ArrayBuffer, itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: Iterable[Double], itemSize: Double) = this()
    def this(array: ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: Iterable[Double], itemSize: Double, normalized: Boolean) = this()
  }
  
  @js.native
  class Int8Attribute protected () extends BufferAttribute {
    def this(array: js.Any, itemSize: Double) = this()
  }
  
  @js.native
  class Int8BufferAttribute protected () extends BufferAttribute {
    def this(array: ArrayBuffer, itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: Iterable[Double], itemSize: Double) = this()
    def this(array: ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: Iterable[Double], itemSize: Double, normalized: Boolean) = this()
  }
  
  @js.native
  class Uint16Attribute protected () extends BufferAttribute {
    def this(array: js.Any, itemSize: Double) = this()
  }
  
  @js.native
  class Uint16BufferAttribute protected () extends BufferAttribute {
    def this(array: ArrayBuffer, itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: Iterable[Double], itemSize: Double) = this()
    def this(array: ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: Iterable[Double], itemSize: Double, normalized: Boolean) = this()
  }
  
  @js.native
  class Uint32Attribute protected () extends BufferAttribute {
    def this(array: js.Any, itemSize: Double) = this()
  }
  
  @js.native
  class Uint32BufferAttribute protected () extends BufferAttribute {
    def this(array: ArrayBuffer, itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: Iterable[Double], itemSize: Double) = this()
    def this(array: ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: Iterable[Double], itemSize: Double, normalized: Boolean) = this()
  }
  
  @js.native
  class Uint8Attribute protected () extends BufferAttribute {
    def this(array: js.Any, itemSize: Double) = this()
  }
  
  @js.native
  class Uint8BufferAttribute protected () extends BufferAttribute {
    def this(array: ArrayBuffer, itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: Iterable[Double], itemSize: Double) = this()
    def this(array: ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: Iterable[Double], itemSize: Double, normalized: Boolean) = this()
  }
  
  @js.native
  class Uint8ClampedAttribute protected () extends BufferAttribute {
    def this(array: js.Any, itemSize: Double) = this()
  }
  
  @js.native
  class Uint8ClampedBufferAttribute protected () extends BufferAttribute {
    def this(array: ArrayBuffer, itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: Iterable[Double], itemSize: Double) = this()
    def this(array: ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: Iterable[Double], itemSize: Double, normalized: Boolean) = this()
  }
  
}

