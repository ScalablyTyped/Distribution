package typings.typeorm.typingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/driver/mongodb/typings", "Timestamp")
@js.native
class Timestamp protected () extends StObject {
  /**
    * @param low The low (signed) 32 bits of the Timestamp.
    * @param high The high (signed) 32 bits of the Timestamp.
    */
  def this(low: scala.Double, high: scala.Double) = this()
  
  /**
    * Returns the sum of this and the given Timestamp.
    *
    * @param other Timestamp to add to this one.
    */
  def add(other: Timestamp): Timestamp = js.native
  
  /**
    * Returns the bitwise-AND of this Timestamp and the given one.
    *
    * @param other Timestamp to add to this one.
    */
  def and(other: Timestamp): Timestamp = js.native
  
  /**
    * Compares this Timestamp with the given one.
    *
    * @param other Timestamp to compare against.
    */
  def compare(other: Timestamp): scala.Double = js.native
  
  /**
    * Returns this Timestamp divided by the given one.
    *
    * @param other Timestamp by which to divide.
    */
  def div(other: Timestamp): Timestamp = js.native
  
  /**
    * Return whether this Timestamp equals the other
    *
    * @param other
    */
  def equals(other: Timestamp): Boolean = js.native
  
  /**
    * Return the high 32-bits value.
    */
  def getHighBits(): scala.Double = js.native
  
  /**
    * Return the low 32-bits value.
    */
  def getLowBits(): scala.Double = js.native
  
  /**
    * Return the low unsigned 32-bits value.
    */
  def getLowBitsUnsigned(): scala.Double = js.native
  
  /**
    * Returns the number of bits needed to represent the absolute value of this Timestamp.
    */
  def getNumBitsAbs(): scala.Double = js.native
  
  /**
    * Return whether this Timestamp is greater than the other.
    *
    * @param other Timestamp to compare against.
    */
  def greaterThan(other: Timestamp): scala.Double = js.native
  
  /**
    * Return whether this Timestamp is greater than or equal to the other.
    *
    * @param other Timestamp to compare against.
    */
  def greaterThanOrEqual(other: Timestamp): scala.Double = js.native
  
  /**
    * Return whether this value is negative.
    */
  def isNegative(): Boolean = js.native
  
  /**
    * IsOdd.
    * Return whether this value is odd.
    */
  def isOdd(): Boolean = js.native
  
  /**
    * Return whether this value is zero.
    */
  def isZero(): Boolean = js.native
  
  /**
    * Return whether this Timestamp is less than the other.
    *
    * @param other Timestamp to compare against.
    */
  def lessThan(other: Timestamp): Boolean = js.native
  
  /**
    * Return whether this Timestamp is less than or equal to the other.
    *
    * @param other Timestamp to compare against.
    */
  def lessThanOrEqual(other: Timestamp): Boolean = js.native
  
  /**
    * Returns this Timestamp modulo the given one.
    *
    * @param other Timestamp by which to mod.
    */
  def modulo(other: Timestamp): Timestamp = js.native
  
  /**
    * Returns the product of this and the given Timestamp.
    *
    * @param other Timestamp to multiply with this.
    */
  def multiply(other: Timestamp): Timestamp = js.native
  
  /**
    * The negation of this value.
    */
  def negate(): Timestamp = js.native
  
  /**
    * The bitwise-NOT of this value.
    */
  def not(): Timestamp = js.native
  
  /**
    * Return whether this Timestamp does not equal the other.
    *
    * @param other Timestamp to compare against.
    */
  def notEquals(other: Timestamp): Boolean = js.native
  
  /**
    * Returns the bitwise-OR of this Timestamp and the given one.
    *
    * @param other The Timestamp with which to OR.
    */
  def or(other: Timestamp): Timestamp = js.native
  
  /**
    * Returns this Timestamp with bits shifted to the left by the given amount.
    *
    * @param other The number of bits by which to shift.
    */
  def shiftLeft(other: scala.Double): Timestamp = js.native
  
  /**
    * Returns this Timestamp with bits shifted to the right by the given amount.
    *
    * @param other The number of bits by which to shift.
    */
  def shiftRight(other: scala.Double): Timestamp = js.native
  
  /**
    * Returns this Timestamp with bits shifted to the right by the given amount, with the new top bits matching the current sign bit.
    *
    * @param other
    */
  def shiftRightUnsigned(other: scala.Double): Timestamp = js.native
  
  /**
    * Returns the difference of this and the given Timestamp.
    *
    * @param other Timestamp to subtract from this.
    */
  def subtract(other: Timestamp): Timestamp = js.native
  
  /**
    * Return the int value.
    */
  def toInt(): scala.Double = js.native
  
  /**
    * Return the JSON value.
    */
  def toJSON(): String = js.native
  
  /**
    * Return the Number value.
    */
  def toNumber(): scala.Double = js.native
  
  def toString(radix: scala.Double): String = js.native
  
  /**
    * Returns the bitwise-XOR of this Timestamp and the given one.
    *
    * @param other The Timestamp with which to XOR.
    */
  def xor(other: Timestamp): Timestamp = js.native
}
/* static members */
object Timestamp {
  
  @JSImport("typeorm/browser/driver/mongodb/typings", "Timestamp")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typeorm/browser/driver/mongodb/typings", "Timestamp.MAX_VALUE")
  @js.native
  def MAX_VALUE: Timestamp = js.native
  @scala.inline
  def MAX_VALUE_=(x: Timestamp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_VALUE")(x.asInstanceOf[js.Any])
  
  @JSImport("typeorm/browser/driver/mongodb/typings", "Timestamp.MIN_VALUE")
  @js.native
  def MIN_VALUE: Timestamp = js.native
  @scala.inline
  def MIN_VALUE_=(x: Timestamp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_VALUE")(x.asInstanceOf[js.Any])
  
  @JSImport("typeorm/browser/driver/mongodb/typings", "Timestamp.NEG_ONE")
  @js.native
  def NEG_ONE: Timestamp = js.native
  @scala.inline
  def NEG_ONE_=(x: Timestamp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NEG_ONE")(x.asInstanceOf[js.Any])
  
  @JSImport("typeorm/browser/driver/mongodb/typings", "Timestamp.ONE")
  @js.native
  def ONE: Timestamp = js.native
  @scala.inline
  def ONE_=(x: Timestamp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
  
  @JSImport("typeorm/browser/driver/mongodb/typings", "Timestamp.ZERO")
  @js.native
  def ZERO: Timestamp = js.native
  @scala.inline
  def ZERO_=(x: Timestamp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  
  /**
    * Returns a Timestamp representing the 64-bit integer that comes by concatenating the
    * given high and low bits. Each is assumed to use 32 bits..
    *
    * @param lowBits The low 32-bits.
    * @param highBits The high 32-bits.
    */
  @scala.inline
  def fromBits(lowBits: scala.Double, highBits: scala.Double): Timestamp = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBits")(lowBits.asInstanceOf[js.Any], highBits.asInstanceOf[js.Any])).asInstanceOf[Timestamp]
  
  /**
    * Returns a Timestamp representing the given (32-bit) integer value.
    *
    * @param value The 32-bit integer in question.
    */
  @scala.inline
  def fromInt(value: scala.Double): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInt")(value.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
  
  /**
    * Returns a Timestamp representing the given value, provided that it is a finite number. Otherwise, zero is returned.
    *
    * @param value The number in question.
    */
  @scala.inline
  def fromNumber(value: scala.Double): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
  
  /**
    * Returns a Timestamp representation of the given string, written using the given radix.
    *
    * @param str The textual representation of the Timestamp.
    * @param radix The radix in which the text is written.
    */
  @scala.inline
  def fromString(str: String): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
  @scala.inline
  def fromString(str: String, radix: scala.Double): Timestamp = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], radix.asInstanceOf[js.Any])).asInstanceOf[Timestamp]
}
