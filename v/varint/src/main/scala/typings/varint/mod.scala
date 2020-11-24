package typings.varint

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("varint", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def encodingLength(num: Double): Double = js.native
  
  @js.native
  object decode extends js.Object {
    
    def apply(buf: js.Array[Double]): Double = js.native
    def apply(buf: js.Array[Double], offset: Double): Double = js.native
    /**
      * Decodes `data`, which can be either a buffer or array of integers, from position `offset` or default 0 and returns the decoded original integer.
      * Throws a `RangeError` when `data` does not represent a valid encoding.
      */
    def apply(buf: Buffer): Double = js.native
    def apply(buf: Buffer, offset: Double): Double = js.native
    
    /**
      * If you also require the length (number of bytes) that were required to decode the integer you can access it via `varint.decode.bytes`.
      * This is an integer property that will tell you the number of bytes that the last .decode() call had to use to decode.
      */
    var bytes: Double = js.native
  }
  
  @js.native
  object encode extends js.Object {
    
    /**
      * Encodes `num` into `array` starting at `offset`. returns `array`, with the encoded varint written into it.
      * If `array` is not provided, it will default to a new array.
      * `varint.encode.bytes` will now be set to the number of bytes modified.
      */
    def apply(num: Double): js.Array[Double] = js.native
    def apply(num: Double, array: js.UndefOr[scala.Nothing], offset: Double): js.Array[Double] = js.native
    def apply(num: Double, array: js.Array[Double]): js.Array[Double] = js.native
    def apply(num: Double, array: js.Array[Double], offset: Double): js.Array[Double] = js.native
    /**
      * Encodes `num` into `buffer` starting at `offset`. returns `buffer`, with the encoded varint written into it.
      * `varint.encode.bytes` will now be set to the number of bytes modified.
      */
    def apply(num: Double, buffer: Buffer): Buffer = js.native
    def apply(num: Double, buffer: Buffer, offset: Double): Buffer = js.native
    
    /**
      * Similar to `decode.bytes` when encoding a number it can be useful to know how many bytes where written (especially if you pass an output array).
      * You can access this via `varint.encode.bytes` which holds the number of bytes written in the last encode.
      */
    var bytes: Double = js.native
  }
}
