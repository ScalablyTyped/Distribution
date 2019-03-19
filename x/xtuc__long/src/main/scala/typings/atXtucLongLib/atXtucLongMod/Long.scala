package typings
package atXtucLongLib.atXtucLongMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Long extends js.Object {
  /**
    * The high 32 bits as a signed value.
    */
  var high: scala.Double = js.native
  /**
    * The low 32 bits as a signed value.
    */
  var low: scala.Double = js.native
  /**
    * Whether unsigned or not.
    */
  var unsigned: scala.Boolean = js.native
  def add(addend: Long): Long = js.native
  def add(addend: java.lang.String): Long = js.native
  /**
    * Returns the sum of this and the specified Long.
    */
  def add(addend: scala.Double): Long = js.native
  /**
    * Returns the bitwise AND of this Long and the specified.
    */
  def and(other: Long): Long = js.native
  def and(other: java.lang.String): Long = js.native
  def and(other: scala.Double): Long = js.native
  /**
    * Compares this Long's value with the specified's.
    */
  def comp(other: Long): scala.Double = js.native
  def comp(other: java.lang.String): scala.Double = js.native
  def comp(other: scala.Double): scala.Double = js.native
  /**
    * Compares this Long's value with the specified's.
    */
  def compare(other: Long): scala.Double = js.native
  def compare(other: java.lang.String): scala.Double = js.native
  def compare(other: scala.Double): scala.Double = js.native
  /**
    * Returns this Long divided by the specified.
    */
  def div(divisor: Long): Long = js.native
  def div(divisor: java.lang.String): Long = js.native
  def div(divisor: scala.Double): Long = js.native
  /**
    * Returns this Long divided by the specified.
    */
  def divide(divisor: Long): Long = js.native
  def divide(divisor: java.lang.String): Long = js.native
  def divide(divisor: scala.Double): Long = js.native
  /**
    * Tests if this Long's value equals the specified's.
    */
  def eq(other: Long): scala.Boolean = js.native
  def eq(other: java.lang.String): scala.Boolean = js.native
  def eq(other: scala.Double): scala.Boolean = js.native
  /**
    * Tests if this Long's value equals the specified's.
    */
  def equals(other: Long): scala.Boolean = js.native
  def equals(other: java.lang.String): scala.Boolean = js.native
  def equals(other: scala.Double): scala.Boolean = js.native
  /**
    * Tests if this Long's value equals zero.
    */
  def eqz(): scala.Boolean = js.native
  /**
    * Tests if this Long's value is greater than or equal the specified's.
    */
  def ge(other: Long): scala.Boolean = js.native
  def ge(other: java.lang.String): scala.Boolean = js.native
  def ge(other: scala.Double): scala.Boolean = js.native
  /**
    * Gets the high 32 bits as a signed integer.
    */
  def getHighBits(): scala.Double = js.native
  /**
    * Gets the high 32 bits as an unsigned integer.
    */
  def getHighBitsUnsigned(): scala.Double = js.native
  /**
    * Gets the low 32 bits as a signed integer.
    */
  def getLowBits(): scala.Double = js.native
  /**
    * Gets the low 32 bits as an unsigned integer.
    */
  def getLowBitsUnsigned(): scala.Double = js.native
  /**
    * Gets the number of bits needed to represent the absolute value of this Long.
    */
  def getNumBitsAbs(): scala.Double = js.native
  /**
    * Tests if this Long's value is greater than the specified's.
    */
  def greaterThan(other: Long): scala.Boolean = js.native
  def greaterThan(other: java.lang.String): scala.Boolean = js.native
  def greaterThan(other: scala.Double): scala.Boolean = js.native
  /**
    * Tests if this Long's value is greater than or equal the specified's.
    */
  def greaterThanOrEqual(other: Long): scala.Boolean = js.native
  def greaterThanOrEqual(other: java.lang.String): scala.Boolean = js.native
  def greaterThanOrEqual(other: scala.Double): scala.Boolean = js.native
  /**
    * Tests if this Long's value is greater than the specified's.
    */
  def gt(other: Long): scala.Boolean = js.native
  def gt(other: java.lang.String): scala.Boolean = js.native
  def gt(other: scala.Double): scala.Boolean = js.native
  /**
    * Tests if this Long's value is greater than or equal the specified's.
    */
  def gte(other: Long): scala.Boolean = js.native
  def gte(other: java.lang.String): scala.Boolean = js.native
  def gte(other: scala.Double): scala.Boolean = js.native
  /**
    * Tests if this Long's value is even.
    */
  def isEven(): scala.Boolean = js.native
  /**
    * Tests if this Long's value is negative.
    */
  def isNegative(): scala.Boolean = js.native
  /**
    * Tests if this Long's value is odd.
    */
  def isOdd(): scala.Boolean = js.native
  /**
    * Tests if this Long's value is positive.
    */
  def isPositive(): scala.Boolean = js.native
  /**
    * Tests if this Long's value equals zero.
    */
  def isZero(): scala.Boolean = js.native
  /**
    * Tests if this Long's value is less than or equal the specified's.
    */
  def le(other: Long): scala.Boolean = js.native
  def le(other: java.lang.String): scala.Boolean = js.native
  def le(other: scala.Double): scala.Boolean = js.native
  /**
    * Tests if this Long's value is less than the specified's.
    */
  def lessThan(other: Long): scala.Boolean = js.native
  def lessThan(other: java.lang.String): scala.Boolean = js.native
  def lessThan(other: scala.Double): scala.Boolean = js.native
  /**
    * Tests if this Long's value is less than or equal the specified's.
    */
  def lessThanOrEqual(other: Long): scala.Boolean = js.native
  def lessThanOrEqual(other: java.lang.String): scala.Boolean = js.native
  def lessThanOrEqual(other: scala.Double): scala.Boolean = js.native
  /**
    * Tests if this Long's value is less than the specified's.
    */
  def lt(other: Long): scala.Boolean = js.native
  def lt(other: java.lang.String): scala.Boolean = js.native
  def lt(other: scala.Double): scala.Boolean = js.native
  /**
    * Tests if this Long's value is less than or equal the specified's.
    */
  def lte(other: Long): scala.Boolean = js.native
  def lte(other: java.lang.String): scala.Boolean = js.native
  def lte(other: scala.Double): scala.Boolean = js.native
  /**
    * Returns this Long modulo the specified.
    */
  def mod(other: Long): Long = js.native
  def mod(other: java.lang.String): Long = js.native
  def mod(other: scala.Double): Long = js.native
  /**
    * Returns this Long modulo the specified.
    */
  def modulo(other: Long): Long = js.native
  def modulo(other: java.lang.String): Long = js.native
  def modulo(other: scala.Double): Long = js.native
  /**
    * Returns the product of this and the specified Long.
    */
  def mul(multiplier: Long): Long = js.native
  def mul(multiplier: java.lang.String): Long = js.native
  def mul(multiplier: scala.Double): Long = js.native
  /**
    * Returns the product of this and the specified Long.
    */
  def multiply(multiplier: Long): Long = js.native
  def multiply(multiplier: java.lang.String): Long = js.native
  def multiply(multiplier: scala.Double): Long = js.native
  /**
    * Tests if this Long's value differs from the specified's.
    */
  def ne(other: Long): scala.Boolean = js.native
  def ne(other: java.lang.String): scala.Boolean = js.native
  def ne(other: scala.Double): scala.Boolean = js.native
  /**
    * Negates this Long's value.
    */
  def neg(): Long = js.native
  /**
    * Negates this Long's value.
    */
  def negate(): Long = js.native
  /**
    * Tests if this Long's value differs from the specified's.
    */
  def neq(other: Long): scala.Boolean = js.native
  def neq(other: java.lang.String): scala.Boolean = js.native
  def neq(other: scala.Double): scala.Boolean = js.native
  /**
    * Returns the bitwise NOT of this Long.
    */
  def not(): Long = js.native
  /**
    * Tests if this Long's value differs from the specified's.
    */
  def notEquals(other: Long): scala.Boolean = js.native
  def notEquals(other: java.lang.String): scala.Boolean = js.native
  def notEquals(other: scala.Double): scala.Boolean = js.native
  /**
    * Returns the bitwise OR of this Long and the specified.
    */
  def or(other: Long): Long = js.native
  def or(other: java.lang.String): Long = js.native
  def or(other: scala.Double): Long = js.native
  /**
    * Returns this Long modulo the specified.
    */
  def rem(other: Long): Long = js.native
  def rem(other: java.lang.String): Long = js.native
  def rem(other: scala.Double): Long = js.native
  def shiftLeft(numBits: Long): Long = js.native
  /**
    * Returns this Long with bits shifted to the left by the given amount.
    */
  def shiftLeft(numBits: scala.Double): Long = js.native
  def shiftRight(numBits: Long): Long = js.native
  /**
    * Returns this Long with bits arithmetically shifted to the right by the given amount.
    */
  def shiftRight(numBits: scala.Double): Long = js.native
  def shiftRightUnsigned(numBits: Long): Long = js.native
  /**
    * Returns this Long with bits logically shifted to the right by the given amount.
    */
  def shiftRightUnsigned(numBits: scala.Double): Long = js.native
  def shl(numBits: Long): Long = js.native
  /**
    * Returns this Long with bits shifted to the left by the given amount.
    */
  def shl(numBits: scala.Double): Long = js.native
  def shr(numBits: Long): Long = js.native
  /**
    * Returns this Long with bits arithmetically shifted to the right by the given amount.
    */
  def shr(numBits: scala.Double): Long = js.native
  def shr_u(numBits: Long): Long = js.native
  /**
    * Returns this Long with bits logically shifted to the right by the given amount.
    */
  def shr_u(numBits: scala.Double): Long = js.native
  def shru(numBits: Long): Long = js.native
  /**
    * Returns this Long with bits logically shifted to the right by the given amount.
    */
  def shru(numBits: scala.Double): Long = js.native
  def sub(subtrahend: Long): Long = js.native
  def sub(subtrahend: java.lang.String): Long = js.native
  /**
    * Returns the difference of this and the specified Long.
    */
  def sub(subtrahend: scala.Double): Long = js.native
  def subtract(subtrahend: Long): Long = js.native
  def subtract(subtrahend: java.lang.String): Long = js.native
  /**
    * Returns the difference of this and the specified Long.
    */
  def subtract(subtrahend: scala.Double): Long = js.native
  /**
    * Converts this Long to its byte representation.
    */
  def toBytes(): js.Array[scala.Double] = js.native
  def toBytes(le: scala.Boolean): js.Array[scala.Double] = js.native
  /**
    * Converts this Long to its big endian byte representation.
    */
  def toBytesBE(): js.Array[scala.Double] = js.native
  /**
    * Converts this Long to its little endian byte representation.
    */
  def toBytesLE(): js.Array[scala.Double] = js.native
  /**
    * Converts the Long to a 32 bit integer, assuming it is a 32 bit integer.
    */
  def toInt(): scala.Double = js.native
  /**
    * Converts the Long to a the nearest floating-point representation of this value (double, 53 bit mantissa).
    */
  def toNumber(): scala.Double = js.native
  /**
    * Converts this Long to signed.
    */
  def toSigned(): Long = js.native
  def toString(radix: scala.Double): java.lang.String = js.native
  /**
    * Converts this Long to unsigned.
    */
  def toUnsigned(): Long = js.native
  /**
    * Returns the bitwise XOR of this Long and the given one.
    */
  def xor(other: Long): Long = js.native
  def xor(other: java.lang.String): Long = js.native
  def xor(other: scala.Double): Long = js.native
}

