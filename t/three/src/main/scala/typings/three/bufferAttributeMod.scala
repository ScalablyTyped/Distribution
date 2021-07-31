package typings.three

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.ArrayLike
import typings.std.Iterable
import typings.three.anon.Array
import typings.three.anon.B
import typings.three.anon.Count
import typings.three.anon.W
import typings.three.anon.X
import typings.three.anon.Y
import typings.three.constantsMod.Usage
import typings.three.matrix3Mod.Matrix3
import typings.three.matrix4Mod.Matrix4
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferAttributeMod {
  
  @JSImport("three/src/core/BufferAttribute", "BufferAttribute")
  @js.native
  class BufferAttribute protected () extends StObject {
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
    
    def applyMatrix3(m: Matrix3): this.type = js.native
    
    def applyMatrix4(m: Matrix4): this.type = js.native
    
    def applyNormalMatrix(m: Matrix3): this.type = js.native
    
    var array: ArrayLike[Double] = js.native
    
    def copy(source: BufferAttribute): this.type = js.native
    
    def copyArray(array: ArrayLike[Double]): this.type = js.native
    
    def copyAt(index1: Double, attribute: BufferAttribute, index2: Double): this.type = js.native
    
    def copyColorsArray(colors: js.Array[B]): this.type = js.native
    
    def copyVector2sArray(vectors: js.Array[X]): this.type = js.native
    
    def copyVector3sArray(vectors: js.Array[Y]): this.type = js.native
    
    def copyVector4sArray(vectors: js.Array[W]): this.type = js.native
    
    /**
    	 * @default 0
    	 */
    var count: Double = js.native
    
    def getW(index: Double): Double = js.native
    
    def getX(index: Double): Double = js.native
    
    def getY(index: Double): Double = js.native
    
    def getZ(index: Double): Double = js.native
    
    val isBufferAttribute: `true` = js.native
    
    var itemSize: Double = js.native
    
    // array parameter should be TypedArray.
    /**
    	 * @default ''
    	 */
    var name: String = js.native
    
    def needsUpdate_=(value: Boolean): Unit = js.native
    
    /**
    	 * @default false
    	 */
    var normalized: Boolean = js.native
    
    def onUpload(callback: js.Function0[Unit]): this.type = js.native
    
    def onUploadCallback(): Unit = js.native
    
    def set(value: ArrayBufferView): this.type = js.native
    def set(value: ArrayBufferView, offset: Double): this.type = js.native
    def set(value: ArrayLike[Double]): this.type = js.native
    def set(value: ArrayLike[Double], offset: Double): this.type = js.native
    
    def setUsage(usage: Usage): this.type = js.native
    
    def setW(index: Double, z: Double): this.type = js.native
    
    def setX(index: Double, x: Double): this.type = js.native
    
    def setXY(index: Double, x: Double, y: Double): this.type = js.native
    
    def setXYZ(index: Double, x: Double, y: Double, z: Double): this.type = js.native
    
    def setXYZW(index: Double, x: Double, y: Double, z: Double, w: Double): this.type = js.native
    
    def setY(index: Double, y: Double): this.type = js.native
    
    def setZ(index: Double, z: Double): this.type = js.native
    
    def toJSON(): Array = js.native
    
    def transformDirection(m: Matrix4): this.type = js.native
    
    /**
    	 * @default { offset: number; count: number }
    	 */
    var updateRange: Count = js.native
    
    /**
    	 * @default THREE.StaticDrawUsage
    	 */
    var usage: Usage = js.native
    
    /**
    	 * @default 0
    	 */
    var version: Double = js.native
  }
  
  @JSImport("three/src/core/BufferAttribute", "Float32Attribute")
  @js.native
  class Float32Attribute protected () extends BufferAttribute {
    def this(array: js.Any, itemSize: Double) = this()
  }
  
  @JSImport("three/src/core/BufferAttribute", "Float32BufferAttribute")
  @js.native
  class Float32BufferAttribute protected () extends BufferAttribute {
    def this(array: Double, itemSize: Double) = this()
    def this(array: ArrayBuffer, itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: Iterable[Double], itemSize: Double) = this()
    def this(array: Double, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: Iterable[Double], itemSize: Double, normalized: Boolean) = this()
  }
  
  @JSImport("three/src/core/BufferAttribute", "Float64Attribute")
  @js.native
  class Float64Attribute protected () extends BufferAttribute {
    def this(array: js.Any, itemSize: Double) = this()
  }
  
  @JSImport("three/src/core/BufferAttribute", "Float64BufferAttribute")
  @js.native
  class Float64BufferAttribute protected () extends BufferAttribute {
    def this(array: Double, itemSize: Double) = this()
    def this(array: ArrayBuffer, itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: Iterable[Double], itemSize: Double) = this()
    def this(array: Double, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: Iterable[Double], itemSize: Double, normalized: Boolean) = this()
  }
  
  @JSImport("three/src/core/BufferAttribute", "Int16Attribute")
  @js.native
  class Int16Attribute protected () extends BufferAttribute {
    def this(array: js.Any, itemSize: Double) = this()
  }
  
  @JSImport("three/src/core/BufferAttribute", "Int16BufferAttribute")
  @js.native
  class Int16BufferAttribute protected () extends BufferAttribute {
    def this(array: Double, itemSize: Double) = this()
    def this(array: ArrayBuffer, itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: Iterable[Double], itemSize: Double) = this()
    def this(array: Double, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: Iterable[Double], itemSize: Double, normalized: Boolean) = this()
  }
  
  @JSImport("three/src/core/BufferAttribute", "Int32Attribute")
  @js.native
  class Int32Attribute protected () extends BufferAttribute {
    def this(array: js.Any, itemSize: Double) = this()
  }
  
  @JSImport("three/src/core/BufferAttribute", "Int32BufferAttribute")
  @js.native
  class Int32BufferAttribute protected () extends BufferAttribute {
    def this(array: Double, itemSize: Double) = this()
    def this(array: ArrayBuffer, itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: Iterable[Double], itemSize: Double) = this()
    def this(array: Double, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: Iterable[Double], itemSize: Double, normalized: Boolean) = this()
  }
  
  @JSImport("three/src/core/BufferAttribute", "Int8Attribute")
  @js.native
  class Int8Attribute protected () extends BufferAttribute {
    def this(array: js.Any, itemSize: Double) = this()
  }
  
  @JSImport("three/src/core/BufferAttribute", "Int8BufferAttribute")
  @js.native
  class Int8BufferAttribute protected () extends BufferAttribute {
    def this(array: Double, itemSize: Double) = this()
    def this(array: ArrayBuffer, itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: Iterable[Double], itemSize: Double) = this()
    def this(array: Double, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: Iterable[Double], itemSize: Double, normalized: Boolean) = this()
  }
  
  @JSImport("three/src/core/BufferAttribute", "Uint16Attribute")
  @js.native
  class Uint16Attribute protected () extends BufferAttribute {
    def this(array: js.Any, itemSize: Double) = this()
  }
  
  @JSImport("three/src/core/BufferAttribute", "Uint16BufferAttribute")
  @js.native
  class Uint16BufferAttribute protected () extends BufferAttribute {
    def this(array: Double, itemSize: Double) = this()
    def this(array: ArrayBuffer, itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: Iterable[Double], itemSize: Double) = this()
    def this(array: Double, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: Iterable[Double], itemSize: Double, normalized: Boolean) = this()
  }
  
  @JSImport("three/src/core/BufferAttribute", "Uint32Attribute")
  @js.native
  class Uint32Attribute protected () extends BufferAttribute {
    def this(array: js.Any, itemSize: Double) = this()
  }
  
  @JSImport("three/src/core/BufferAttribute", "Uint32BufferAttribute")
  @js.native
  class Uint32BufferAttribute protected () extends BufferAttribute {
    def this(array: Double, itemSize: Double) = this()
    def this(array: ArrayBuffer, itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: Iterable[Double], itemSize: Double) = this()
    def this(array: Double, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: Iterable[Double], itemSize: Double, normalized: Boolean) = this()
  }
  
  @JSImport("three/src/core/BufferAttribute", "Uint8Attribute")
  @js.native
  class Uint8Attribute protected () extends BufferAttribute {
    def this(array: js.Any, itemSize: Double) = this()
  }
  
  @JSImport("three/src/core/BufferAttribute", "Uint8BufferAttribute")
  @js.native
  class Uint8BufferAttribute protected () extends BufferAttribute {
    def this(array: Double, itemSize: Double) = this()
    def this(array: ArrayBuffer, itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: Iterable[Double], itemSize: Double) = this()
    def this(array: Double, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: Iterable[Double], itemSize: Double, normalized: Boolean) = this()
  }
  
  @JSImport("three/src/core/BufferAttribute", "Uint8ClampedAttribute")
  @js.native
  class Uint8ClampedAttribute protected () extends BufferAttribute {
    def this(array: js.Any, itemSize: Double) = this()
  }
  
  @JSImport("three/src/core/BufferAttribute", "Uint8ClampedBufferAttribute")
  @js.native
  class Uint8ClampedBufferAttribute protected () extends BufferAttribute {
    def this(array: Double, itemSize: Double) = this()
    def this(array: ArrayBuffer, itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: Iterable[Double], itemSize: Double) = this()
    def this(array: Double, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: Iterable[Double], itemSize: Double, normalized: Boolean) = this()
  }
}
