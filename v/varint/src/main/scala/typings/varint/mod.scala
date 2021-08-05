package typings.varint

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("varint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object decode {
    
    inline def apply(buf: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].apply(buf.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def apply(buf: js.Array[Double], offset: Double): Double = (^.asInstanceOf[js.Dynamic].apply(buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
    /**
      * Decodes `data`, which can be either a buffer or array of integers, from position `offset` or default 0 and returns the decoded original integer.
      * Throws a `RangeError` when `data` does not represent a valid encoding.
      */
    inline def apply(buf: Buffer): Double = ^.asInstanceOf[js.Dynamic].apply(buf.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def apply(buf: Buffer, offset: Double): Double = (^.asInstanceOf[js.Dynamic].apply(buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("varint", "decode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * If you also require the length (number of bytes) that were required to decode the integer you can access it via `varint.decode.bytes`.
      * This is an integer property that will tell you the number of bytes that the last .decode() call had to use to decode.
      */
    @JSImport("varint", "decode.bytes")
    @js.native
    def bytes: Double = js.native
    inline def bytes_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bytes")(x.asInstanceOf[js.Any])
  }
  
  object encode {
    
    /**
      * Encodes `num` into `array` starting at `offset`. returns `array`, with the encoded varint written into it.
      * If `array` is not provided, it will default to a new array.
      * `varint.encode.bytes` will now be set to the number of bytes modified.
      */
    inline def apply(num: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].apply(num.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    inline def apply(num: Double, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(num.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def apply(num: Double, array: js.Array[Double], offset: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(num.asInstanceOf[js.Any], array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def apply(num: Double, array: Unit, offset: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(num.asInstanceOf[js.Any], array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    /**
      * Encodes `num` into `buffer` starting at `offset`. returns `buffer`, with the encoded varint written into it.
      * `varint.encode.bytes` will now be set to the number of bytes modified.
      */
    inline def apply(num: Double, buffer: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].apply(num.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(num: Double, buffer: Buffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(num.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    @JSImport("varint", "encode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Similar to `decode.bytes` when encoding a number it can be useful to know how many bytes where written (especially if you pass an output array).
      * You can access this via `varint.encode.bytes` which holds the number of bytes written in the last encode.
      */
    @JSImport("varint", "encode.bytes")
    @js.native
    def bytes: Double = js.native
    inline def bytes_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bytes")(x.asInstanceOf[js.Any])
  }
  
  inline def encodingLength(num: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingLength")(num.asInstanceOf[js.Any]).asInstanceOf[Double]
}
