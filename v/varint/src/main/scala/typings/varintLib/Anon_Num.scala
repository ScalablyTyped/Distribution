package typings
package varintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Num extends js.Object {
  /**
    * Similar to `decode.bytes` when encoding a number it can be useful to know how many bytes where written (especially if you pass an output array).
    * You can access this via `varint.encode.bytes` which holds the number of bytes written in the last encode.
    */
  var bytes: scala.Double = js.native
  /**
    * Encodes `num` into `array` starting at `offset`. returns `array`, with the encoded varint written into it.
    * If `array` is not provided, it will default to a new array.
    * `varint.encode.bytes` will now be set to the number of bytes modified.
    */
  def apply(num: scala.Double): js.Array[scala.Double] = js.native
  def apply(num: scala.Double, array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def apply(num: scala.Double, array: js.Array[scala.Double], offset: scala.Double): js.Array[scala.Double] = js.native
  /**
    * Encodes `num` into `buffer` starting at `offset`. returns `buffer`, with the encoded varint written into it.
    * `varint.encode.bytes` will now be set to the number of bytes modified.
    */
  def apply(num: scala.Double, buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def apply(num: scala.Double, buffer: nodeLib.Buffer, offset: scala.Double): nodeLib.Buffer = js.native
}

