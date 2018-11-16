package typings
package varintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Buf extends js.Object {
  /**
       * If you also require the length (number of bytes) that were required to decode the integer you can access it via `varint.decode.bytes`.
       * This is an integer property that will tell you the number of bytes that the last .decode() call had to use to decode.
       */
  var bytes: scala.Double = js.native
  /**
       * Decodes `data`, which can be either a buffer or array of integers, from position `offset` or default 0 and returns the decoded original integer.
       * Throws a `RangeError` when `data` does not represent a valid encoding.
       */
  def apply(buf: js.Array[scala.Double]): scala.Double = js.native
  /**
       * Decodes `data`, which can be either a buffer or array of integers, from position `offset` or default 0 and returns the decoded original integer.
       * Throws a `RangeError` when `data` does not represent a valid encoding.
       */
  def apply(buf: js.Array[scala.Double], offset: scala.Double): scala.Double = js.native
  /**
       * Decodes `data`, which can be either a buffer or array of integers, from position `offset` or default 0 and returns the decoded original integer.
       * Throws a `RangeError` when `data` does not represent a valid encoding.
       */
  def apply(buf: nodeLib.Buffer): scala.Double = js.native
  /**
       * Decodes `data`, which can be either a buffer or array of integers, from position `offset` or default 0 and returns the decoded original integer.
       * Throws a `RangeError` when `data` does not represent a valid encoding.
       */
  def apply(buf: nodeLib.Buffer, offset: scala.Double): scala.Double = js.native
}

