package typings.xtucLong.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Long extends js.Object {
  
  def add(addend: String): Long = js.native
  /**
    * Returns the sum of this and the specified Long.
    */
  def add(addend: Double): Long = js.native
  def add(addend: Long): Long = js.native
  
  def and(other: String): Long = js.native
  def and(other: Double): Long = js.native
  /**
    * Returns the bitwise AND of this Long and the specified.
    */
  def and(other: Long): Long = js.native
  
  def comp(other: String): Double = js.native
  def comp(other: Double): Double = js.native
  /**
    * Compares this Long's value with the specified's.
    */
  def comp(other: Long): Double = js.native
  
  def compare(other: String): Double = js.native
  def compare(other: Double): Double = js.native
  /**
    * Compares this Long's value with the specified's.
    */
  def compare(other: Long): Double = js.native
  
  def div(divisor: String): Long = js.native
  def div(divisor: Double): Long = js.native
  /**
    * Returns this Long divided by the specified.
    */
  def div(divisor: Long): Long = js.native
  
  def divide(divisor: String): Long = js.native
  def divide(divisor: Double): Long = js.native
  /**
    * Returns this Long divided by the specified.
    */
  def divide(divisor: Long): Long = js.native
  
  def eq(other: String): Boolean = js.native
  def eq(other: Double): Boolean = js.native
  /**
    * Tests if this Long's value equals the specified's.
    */
  def eq(other: Long): Boolean = js.native
  
  def equals(other: String): Boolean = js.native
  def equals(other: Double): Boolean = js.native
  /**
    * Tests if this Long's value equals the specified's.
    */
  def equals(other: Long): Boolean = js.native
  
  /**
    * Tests if this Long's value equals zero.
    */
  def eqz(): Boolean = js.native
  
  def ge(other: String): Boolean = js.native
  def ge(other: Double): Boolean = js.native
  /**
    * Tests if this Long's value is greater than or equal the specified's.
    */
  def ge(other: Long): Boolean = js.native
  
  /**
    * Gets the high 32 bits as a signed integer.
    */
  def getHighBits(): Double = js.native
  
  /**
    * Gets the high 32 bits as an unsigned integer.
    */
  def getHighBitsUnsigned(): Double = js.native
  
  /**
    * Gets the low 32 bits as a signed integer.
    */
  def getLowBits(): Double = js.native
  
  /**
    * Gets the low 32 bits as an unsigned integer.
    */
  def getLowBitsUnsigned(): Double = js.native
  
  /**
    * Gets the number of bits needed to represent the absolute value of this Long.
    */
  def getNumBitsAbs(): Double = js.native
  
  def greaterThan(other: String): Boolean = js.native
  def greaterThan(other: Double): Boolean = js.native
  /**
    * Tests if this Long's value is greater than the specified's.
    */
  def greaterThan(other: Long): Boolean = js.native
  
  def greaterThanOrEqual(other: String): Boolean = js.native
  def greaterThanOrEqual(other: Double): Boolean = js.native
  /**
    * Tests if this Long's value is greater than or equal the specified's.
    */
  def greaterThanOrEqual(other: Long): Boolean = js.native
  
  def gt(other: String): Boolean = js.native
  def gt(other: Double): Boolean = js.native
  /**
    * Tests if this Long's value is greater than the specified's.
    */
  def gt(other: Long): Boolean = js.native
  
  def gte(other: String): Boolean = js.native
  def gte(other: Double): Boolean = js.native
  /**
    * Tests if this Long's value is greater than or equal the specified's.
    */
  def gte(other: Long): Boolean = js.native
  
  /**
    * The high 32 bits as a signed value.
    */
  var high: Double = js.native
  
  /**
    * Tests if this Long's value is even.
    */
  def isEven(): Boolean = js.native
  
  /**
    * Tests if this Long's value is negative.
    */
  def isNegative(): Boolean = js.native
  
  /**
    * Tests if this Long's value is odd.
    */
  def isOdd(): Boolean = js.native
  
  /**
    * Tests if this Long's value is positive.
    */
  def isPositive(): Boolean = js.native
  
  /**
    * Tests if this Long's value equals zero.
    */
  def isZero(): Boolean = js.native
  
  def le(other: String): Boolean = js.native
  def le(other: Double): Boolean = js.native
  /**
    * Tests if this Long's value is less than or equal the specified's.
    */
  def le(other: Long): Boolean = js.native
  
  def lessThan(other: String): Boolean = js.native
  def lessThan(other: Double): Boolean = js.native
  /**
    * Tests if this Long's value is less than the specified's.
    */
  def lessThan(other: Long): Boolean = js.native
  
  def lessThanOrEqual(other: String): Boolean = js.native
  def lessThanOrEqual(other: Double): Boolean = js.native
  /**
    * Tests if this Long's value is less than or equal the specified's.
    */
  def lessThanOrEqual(other: Long): Boolean = js.native
  
  /**
    * The low 32 bits as a signed value.
    */
  var low: Double = js.native
  
  def lt(other: String): Boolean = js.native
  def lt(other: Double): Boolean = js.native
  /**
    * Tests if this Long's value is less than the specified's.
    */
  def lt(other: Long): Boolean = js.native
  
  def lte(other: String): Boolean = js.native
  def lte(other: Double): Boolean = js.native
  /**
    * Tests if this Long's value is less than or equal the specified's.
    */
  def lte(other: Long): Boolean = js.native
  
  def mod(other: String): Long = js.native
  def mod(other: Double): Long = js.native
  /**
    * Returns this Long modulo the specified.
    */
  def mod(other: Long): Long = js.native
  
  def modulo(other: String): Long = js.native
  def modulo(other: Double): Long = js.native
  /**
    * Returns this Long modulo the specified.
    */
  def modulo(other: Long): Long = js.native
  
  def mul(multiplier: String): Long = js.native
  def mul(multiplier: Double): Long = js.native
  /**
    * Returns the product of this and the specified Long.
    */
  def mul(multiplier: Long): Long = js.native
  
  def multiply(multiplier: String): Long = js.native
  def multiply(multiplier: Double): Long = js.native
  /**
    * Returns the product of this and the specified Long.
    */
  def multiply(multiplier: Long): Long = js.native
  
  def ne(other: String): Boolean = js.native
  def ne(other: Double): Boolean = js.native
  /**
    * Tests if this Long's value differs from the specified's.
    */
  def ne(other: Long): Boolean = js.native
  
  /**
    * Negates this Long's value.
    */
  def neg(): Long = js.native
  
  /**
    * Negates this Long's value.
    */
  def negate(): Long = js.native
  
  def neq(other: String): Boolean = js.native
  def neq(other: Double): Boolean = js.native
  /**
    * Tests if this Long's value differs from the specified's.
    */
  def neq(other: Long): Boolean = js.native
  
  /**
    * Returns the bitwise NOT of this Long.
    */
  def not(): Long = js.native
  
  def notEquals(other: String): Boolean = js.native
  def notEquals(other: Double): Boolean = js.native
  /**
    * Tests if this Long's value differs from the specified's.
    */
  def notEquals(other: Long): Boolean = js.native
  
  def or(other: String): Long = js.native
  def or(other: Double): Long = js.native
  /**
    * Returns the bitwise OR of this Long and the specified.
    */
  def or(other: Long): Long = js.native
  
  def rem(other: String): Long = js.native
  def rem(other: Double): Long = js.native
  /**
    * Returns this Long modulo the specified.
    */
  def rem(other: Long): Long = js.native
  
  /**
    * Returns this Long with bits rotated to the left by the given amount.
    */
  def rotateLeft(numBits: Double): Long = js.native
  def rotateLeft(numBits: Long): Long = js.native
  
  /**
    * Returns this Long with bits rotated to the right by the given amount.
    */
  def rotateRight(numBits: Double): Long = js.native
  def rotateRight(numBits: Long): Long = js.native
  
  /**
    * Returns this Long with bits rotated to the left by the given amount.
    */
  def rotl(numBits: Double): Long = js.native
  def rotl(numBits: Long): Long = js.native
  
  /**
    * Returns this Long with bits rotated to the right by the given amount.
    */
  def rotr(numBits: Double): Long = js.native
  def rotr(numBits: Long): Long = js.native
  
  /**
    * Returns this Long with bits shifted to the left by the given amount.
    */
  def shiftLeft(numBits: Double): Long = js.native
  def shiftLeft(numBits: Long): Long = js.native
  
  /**
    * Returns this Long with bits arithmetically shifted to the right by the given amount.
    */
  def shiftRight(numBits: Double): Long = js.native
  def shiftRight(numBits: Long): Long = js.native
  
  /**
    * Returns this Long with bits logically shifted to the right by the given amount.
    */
  def shiftRightUnsigned(numBits: Double): Long = js.native
  def shiftRightUnsigned(numBits: Long): Long = js.native
  
  /**
    * Returns this Long with bits shifted to the left by the given amount.
    */
  def shl(numBits: Double): Long = js.native
  def shl(numBits: Long): Long = js.native
  
  /**
    * Returns this Long with bits arithmetically shifted to the right by the given amount.
    */
  def shr(numBits: Double): Long = js.native
  def shr(numBits: Long): Long = js.native
  
  /**
    * Returns this Long with bits logically shifted to the right by the given amount.
    */
  def shr_u(numBits: Double): Long = js.native
  def shr_u(numBits: Long): Long = js.native
  
  /**
    * Returns this Long with bits logically shifted to the right by the given amount.
    */
  def shru(numBits: Double): Long = js.native
  def shru(numBits: Long): Long = js.native
  
  def sub(subtrahend: String): Long = js.native
  /**
    * Returns the difference of this and the specified Long.
    */
  def sub(subtrahend: Double): Long = js.native
  def sub(subtrahend: Long): Long = js.native
  
  def subtract(subtrahend: String): Long = js.native
  /**
    * Returns the difference of this and the specified Long.
    */
  def subtract(subtrahend: Double): Long = js.native
  def subtract(subtrahend: Long): Long = js.native
  
  /**
    * Converts this Long to its byte representation.
    */
  def toBytes(): js.Array[Double] = js.native
  def toBytes(le: Boolean): js.Array[Double] = js.native
  
  /**
    * Converts this Long to its big endian byte representation.
    */
  def toBytesBE(): js.Array[Double] = js.native
  
  /**
    * Converts this Long to its little endian byte representation.
    */
  def toBytesLE(): js.Array[Double] = js.native
  
  /**
    * Converts the Long to a 32 bit integer, assuming it is a 32 bit integer.
    */
  def toInt(): Double = js.native
  
  /**
    * Converts the Long to a the nearest floating-point representation of this value (double, 53 bit mantissa).
    */
  def toNumber(): Double = js.native
  
  /**
    * Converts this Long to signed.
    */
  def toSigned(): Long = js.native
  
  def toString(radix: Double): String = js.native
  
  /**
    * Converts this Long to unsigned.
    */
  def toUnsigned(): Long = js.native
  
  /**
    * Whether unsigned or not.
    */
  var unsigned: Boolean = js.native
  
  def xor(other: String): Long = js.native
  def xor(other: Double): Long = js.native
  /**
    * Returns the bitwise XOR of this Long and the given one.
    */
  def xor(other: Long): Long = js.native
}
