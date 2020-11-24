package typings.timestampNano.mod

import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("timestamp-nano", JSImport.Namespace)
@js.native
class ^ protected () extends Timestamp {
  /**
    * @param time - Milliseconds from epoch
    * @param nano - Offset number for nanosecond precision
    * @param year - Offset number for year which must be a multiple of 400 to avoid leap year calculation
    */
  def this(time: Double) = this()
  def this(time: Double, nano: Double) = this()
  def this(time: Double, nano: js.UndefOr[scala.Nothing], year: Double) = this()
  def this(time: Double, nano: Double, year: Double) = this()
}
@JSImport("timestamp-nano", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def fromDate(date: Double): Timestamp = js.native
  /**
    * Creates a Timestamp instance from Date instance or milliseconds since epoch.
    *
    * @param date - Milliseconds since epoch
    */
  def fromDate(date: Date): Timestamp = js.native
  
  def fromInt64BE(time: js.Array[Double]): Timestamp = js.native
  def fromInt64BE(time: js.Array[Double], offset: Double): Timestamp = js.native
  /**
    * Creates a Timestamp instance from big endian 64bit time_t of 8 bytes sequence.
    *
    * @param buffer - Buffer, Array, Uint8Array, etc.
    * @param offset
    */
  def fromInt64BE(time: Uint8Array): Timestamp = js.native
  def fromInt64BE(time: Uint8Array, offset: Double): Timestamp = js.native
  
  def fromInt64LE(time: js.Array[Double]): Timestamp = js.native
  def fromInt64LE(time: js.Array[Double], offset: Double): Timestamp = js.native
  /**
    * Creates a Timestamp instance from little endian 64bit time_t of 8 bytes sequence.
    *
    * @param buffer - Buffer, Array, Uint8Array, etc.
    * @param offset
    */
  def fromInt64LE(time: Uint8Array): Timestamp = js.native
  def fromInt64LE(time: Uint8Array, offset: Double): Timestamp = js.native
  
  /**
    * Creates a Timestamp instance from string like: "2017-11-26T11:27:58.737Z"
    *
    * @see https://www.w3.org/TR/NOTE-datetime
    * @param string - W3C Date and Time Formats
    */
  def fromString(string: String): Timestamp = js.native
  
  /**
    * Creates a Timestamp instance from seconds since epoch aka time_t.
    *
    * @param time - Seconds since epoch
    */
  def fromTimeT(time: Double): Timestamp = js.native
}
