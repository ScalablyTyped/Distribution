package typings.atXtucLong.atXtucLongMod

import typings.atXtucLong.Anon_High
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@xtuc/long", JSImport.Default)
@js.native
class default protected () extends Long {
  /**
    * Constructs a 64 bit two's-complement integer, given its low and high 32 bit values as signed integers. See the from* functions below for more convenient ways of constructing Longs.
    */
  def this(low: Double) = this()
  def this(low: Double, high: Double) = this()
  def this(low: Double, high: Double, unsigned: Boolean) = this()
}

/* static members */
@JSImport("@xtuc/long", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Maximum unsigned value.
    */
  var MAX_UNSIGNED_VALUE: Long = js.native
  /**
    * Maximum signed value.
    */
  var MAX_VALUE: Long = js.native
  /**
    * Minimum signed value.
    */
  var MIN_VALUE: Long = js.native
  /**
    * Signed negative one.
    */
  var NEG_ONE: Long = js.native
  /**
    * Signed one.
    */
  var ONE: Long = js.native
  /**
    * Unsigned one.
    */
  var UONE: Long = js.native
  /**
    * Unsigned zero.
    */
  var UZERO: Long = js.native
  /**
    * Signed zero
    */
  var ZERO: Long = js.native
  /**
    * Returns a Long representing the 64 bit integer that comes by concatenating the given low and high bits. Each is assumed to use 32 bits.
    */
  def fromBits(lowBits: Double, highBits: Double): Long = js.native
  def fromBits(lowBits: Double, highBits: Double, unsigned: Boolean): Long = js.native
  /**
    * Creates a Long from its byte representation.
    */
  def fromBytes(bytes: js.Array[Double]): Long = js.native
  def fromBytes(bytes: js.Array[Double], unsigned: Boolean): Long = js.native
  def fromBytes(bytes: js.Array[Double], unsigned: Boolean, le: Boolean): Long = js.native
  /**
    * Creates a Long from its little endian byte representation.
    */
  def fromBytesBE(bytes: js.Array[Double]): Long = js.native
  def fromBytesBE(bytes: js.Array[Double], unsigned: Boolean): Long = js.native
  /**
    * Creates a Long from its little endian byte representation.
    */
  def fromBytesLE(bytes: js.Array[Double]): Long = js.native
  def fromBytesLE(bytes: js.Array[Double], unsigned: Boolean): Long = js.native
  /**
    * Returns a Long representing the given 32 bit integer value.
    */
  def fromInt(value: Double): Long = js.native
  def fromInt(value: Double, unsigned: Boolean): Long = js.native
  /**
    * Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned.
    */
  def fromNumber(value: Double): Long = js.native
  def fromNumber(value: Double, unsigned: Boolean): Long = js.native
  /**
    * Returns a Long representation of the given string, written using the specified radix.
    */
  def fromString(str: String): Long = js.native
  def fromString(str: String, unsigned: Boolean): Long = js.native
  def fromString(str: String, unsigned: Boolean, radix: Double): Long = js.native
  def fromString(str: String, unsigned: Double): Long = js.native
  def fromString(str: String, unsigned: Double, radix: Double): Long = js.native
  def fromValue(`val`: String): Long = js.native
  def fromValue(`val`: String, unsigned: Boolean): Long = js.native
  def fromValue(`val`: Double): Long = js.native
  def fromValue(`val`: Double, unsigned: Boolean): Long = js.native
  def fromValue(`val`: Anon_High): Long = js.native
  def fromValue(`val`: Anon_High, unsigned: Boolean): Long = js.native
  /**
    * Converts the specified value to a Long.
    */
  def fromValue(`val`: Long): Long = js.native
  def fromValue(`val`: Long, unsigned: Boolean): Long = js.native
  /**
    * Tests if the specified object is a Long.
    */
  def isLong(obj: js.Any): /* is @xtuc/long.@xtuc/long.Long */ Boolean = js.native
}

