package typings
package atXtucLongLib.atXtucLongMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@xtuc/long", JSImport.Default)
@js.native
class default protected () extends Long {
  /**
    * Constructs a 64 bit two's-complement integer, given its low and high 32 bit values as signed integers. See the from* functions below for more convenient ways of constructing Longs.
    */
  def this(low: scala.Double) = this()
  def this(low: scala.Double, high: scala.Double) = this()
  def this(low: scala.Double, high: scala.Double, unsigned: scala.Boolean) = this()
}

/* static members */
@JSImport("@xtuc/long", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Maximum unsigned value.
    */
  var MAX_UNSIGNED_VALUE: atXtucLongLib.atXtucLongMod.Long = js.native
  /**
    * Maximum signed value.
    */
  var MAX_VALUE: atXtucLongLib.atXtucLongMod.Long = js.native
  /**
    * Minimum signed value.
    */
  var MIN_VALUE: atXtucLongLib.atXtucLongMod.Long = js.native
  /**
    * Signed negative one.
    */
  var NEG_ONE: atXtucLongLib.atXtucLongMod.Long = js.native
  /**
    * Signed one.
    */
  var ONE: atXtucLongLib.atXtucLongMod.Long = js.native
  /**
    * Unsigned one.
    */
  var UONE: atXtucLongLib.atXtucLongMod.Long = js.native
  /**
    * Unsigned zero.
    */
  var UZERO: atXtucLongLib.atXtucLongMod.Long = js.native
  /**
    * Signed zero
    */
  var ZERO: atXtucLongLib.atXtucLongMod.Long = js.native
  /**
    * Returns a Long representing the 64 bit integer that comes by concatenating the given low and high bits. Each is assumed to use 32 bits.
    */
  def fromBits(lowBits: scala.Double, highBits: scala.Double): atXtucLongLib.atXtucLongMod.Long = js.native
  def fromBits(lowBits: scala.Double, highBits: scala.Double, unsigned: scala.Boolean): atXtucLongLib.atXtucLongMod.Long = js.native
  /**
    * Creates a Long from its byte representation.
    */
  def fromBytes(bytes: js.Array[scala.Double]): atXtucLongLib.atXtucLongMod.Long = js.native
  def fromBytes(bytes: js.Array[scala.Double], unsigned: scala.Boolean): atXtucLongLib.atXtucLongMod.Long = js.native
  def fromBytes(bytes: js.Array[scala.Double], unsigned: scala.Boolean, le: scala.Boolean): atXtucLongLib.atXtucLongMod.Long = js.native
  /**
    * Creates a Long from its little endian byte representation.
    */
  def fromBytesBE(bytes: js.Array[scala.Double]): atXtucLongLib.atXtucLongMod.Long = js.native
  def fromBytesBE(bytes: js.Array[scala.Double], unsigned: scala.Boolean): atXtucLongLib.atXtucLongMod.Long = js.native
  /**
    * Creates a Long from its little endian byte representation.
    */
  def fromBytesLE(bytes: js.Array[scala.Double]): atXtucLongLib.atXtucLongMod.Long = js.native
  def fromBytesLE(bytes: js.Array[scala.Double], unsigned: scala.Boolean): atXtucLongLib.atXtucLongMod.Long = js.native
  /**
    * Returns a Long representing the given 32 bit integer value.
    */
  def fromInt(value: scala.Double): atXtucLongLib.atXtucLongMod.Long = js.native
  def fromInt(value: scala.Double, unsigned: scala.Boolean): atXtucLongLib.atXtucLongMod.Long = js.native
  /**
    * Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned.
    */
  def fromNumber(value: scala.Double): atXtucLongLib.atXtucLongMod.Long = js.native
  def fromNumber(value: scala.Double, unsigned: scala.Boolean): atXtucLongLib.atXtucLongMod.Long = js.native
  /**
    * Returns a Long representation of the given string, written using the specified radix.
    */
  def fromString(str: java.lang.String): atXtucLongLib.atXtucLongMod.Long = js.native
  def fromString(str: java.lang.String, unsigned: scala.Boolean): atXtucLongLib.atXtucLongMod.Long = js.native
  def fromString(str: java.lang.String, unsigned: scala.Boolean, radix: scala.Double): atXtucLongLib.atXtucLongMod.Long = js.native
  def fromString(str: java.lang.String, unsigned: scala.Double): atXtucLongLib.atXtucLongMod.Long = js.native
  def fromString(str: java.lang.String, unsigned: scala.Double, radix: scala.Double): atXtucLongLib.atXtucLongMod.Long = js.native
  def fromValue(`val`: atXtucLongLib.Anon_High): atXtucLongLib.atXtucLongMod.Long = js.native
  def fromValue(`val`: atXtucLongLib.Anon_High, unsigned: scala.Boolean): atXtucLongLib.atXtucLongMod.Long = js.native
  /**
    * Converts the specified value to a Long.
    */
  def fromValue(`val`: atXtucLongLib.atXtucLongMod.Long): atXtucLongLib.atXtucLongMod.Long = js.native
  def fromValue(`val`: atXtucLongLib.atXtucLongMod.Long, unsigned: scala.Boolean): atXtucLongLib.atXtucLongMod.Long = js.native
  def fromValue(`val`: java.lang.String): atXtucLongLib.atXtucLongMod.Long = js.native
  def fromValue(`val`: java.lang.String, unsigned: scala.Boolean): atXtucLongLib.atXtucLongMod.Long = js.native
  def fromValue(`val`: scala.Double): atXtucLongLib.atXtucLongMod.Long = js.native
  def fromValue(`val`: scala.Double, unsigned: scala.Boolean): atXtucLongLib.atXtucLongMod.Long = js.native
  /**
    * Tests if the specified object is a Long.
    */
  def isLong(obj: js.Any): /* is @xtuc/long.@xtuc/long.Long */ scala.Boolean = js.native
}

