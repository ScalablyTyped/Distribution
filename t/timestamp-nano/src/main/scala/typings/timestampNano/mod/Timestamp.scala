package typings.timestampNano.mod

import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Timestamp extends js.Object {
  
  /**
    * Adds offset in nanosecond precision.
    *
    * @param nano - offset number for nanosecond precision in addition.
    */
  def addNano(nano: Double): this.type = js.native
  
  /**
    * Returns a number, between 0 and 999999999, representing the nanoseconds.
    */
  def getNano(): Double = js.native
  
  /**
    * Returns a number representing the seconds since epoch aka time_t.
    *
    * JavaScript has the Double precision per default.
    * Instead, Call Timestamp#writeInt64BE to retrieve 64bit long long precision time_t.
    */
  def getTimeT(): Double = js.native
  
  /**
    * Returns a number representing the year like Date#getUTCFullYear.
    */
  def getYear(): Double = js.native
  
  /**
    * Returns a Date instance.
    *
    * Do not call Date#getUTCFullYear nor Date#getFullYear with the Date instance.
    * Any properties other than those two are correct.
    * Instead, Call Timestamp#getYear to retrieve the year as Timestamp has year offset.
    */
  def toDate(): Date = js.native
  
  /**
    * Returns a JSON string representation like: "2017-11-26T11:27:58.737Z"
    */
  def toJSON(): String = js.native
  
  def toString(format: String): String = js.native
  
  def writeInt64BE(): js.Array[Double] = js.native
  def writeInt64BE(buffer: js.UndefOr[scala.Nothing], offset: Double): js.Array[Double] = js.native
  def writeInt64BE(buffer: js.Array[Double]): js.Array[Double] = js.native
  def writeInt64BE(buffer: js.Array[Double], offset: Double): js.Array[Double] = js.native
  /**
    * Writes big endian 64bit time_t of 8 bytes sequence.
    *
    * @param buffer - Buffer, Array, Uint8Array, etc.
    * @param offset
    */
  def writeInt64BE(buffer: Uint8Array): Uint8Array = js.native
  def writeInt64BE(buffer: Uint8Array, offset: Double): Uint8Array = js.native
  
  def writeInt64LE(): js.Array[Double] = js.native
  def writeInt64LE(buffer: js.UndefOr[scala.Nothing], offset: Double): js.Array[Double] = js.native
  def writeInt64LE(buffer: js.Array[Double]): js.Array[Double] = js.native
  def writeInt64LE(buffer: js.Array[Double], offset: Double): js.Array[Double] = js.native
  /**
    * Writes little endian 64bit time_t of 8 bytes sequence.
    *
    * @param buffer - Buffer, Array, Uint8Array, etc.
    * @param offset
    */
  def writeInt64LE(buffer: Uint8Array): Uint8Array = js.native
  def writeInt64LE(buffer: Uint8Array, offset: Double): Uint8Array = js.native
}
