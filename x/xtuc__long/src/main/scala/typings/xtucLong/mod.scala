package typings.xtucLong

import typings.xtucLong.anon.High
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@xtuc/long", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Long {
    /**
      * Constructs a 64 bit two's-complement integer, given its low and high 32 bit values as signed integers. See the from* functions below for more convenient ways of constructing Longs.
      */
    def this(low: Double) = this()
    def this(low: Double, high: Double) = this()
    def this(low: Double, high: Double, unsigned: Boolean) = this()
    def this(low: Double, high: Unit, unsigned: Boolean) = this()
  }
  @JSImport("@xtuc/long", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Maximum unsigned value.
    */
  /* static member */
  @JSImport("@xtuc/long", "MAX_UNSIGNED_VALUE")
  @js.native
  def MAX_UNSIGNED_VALUE: Long = js.native
  inline def MAX_UNSIGNED_VALUE_=(x: Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_UNSIGNED_VALUE")(x.asInstanceOf[js.Any])
  
  /**
    * Maximum signed value.
    */
  /* static member */
  @JSImport("@xtuc/long", "MAX_VALUE")
  @js.native
  def MAX_VALUE: Long = js.native
  inline def MAX_VALUE_=(x: Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_VALUE")(x.asInstanceOf[js.Any])
  
  /**
    * Minimum signed value.
    */
  /* static member */
  @JSImport("@xtuc/long", "MIN_VALUE")
  @js.native
  def MIN_VALUE: Long = js.native
  inline def MIN_VALUE_=(x: Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_VALUE")(x.asInstanceOf[js.Any])
  
  /**
    * Signed negative one.
    */
  /* static member */
  @JSImport("@xtuc/long", "NEG_ONE")
  @js.native
  def NEG_ONE: Long = js.native
  inline def NEG_ONE_=(x: Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NEG_ONE")(x.asInstanceOf[js.Any])
  
  /**
    * Signed one.
    */
  /* static member */
  @JSImport("@xtuc/long", "ONE")
  @js.native
  def ONE: Long = js.native
  inline def ONE_=(x: Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
  
  /**
    * Unsigned one.
    */
  /* static member */
  @JSImport("@xtuc/long", "UONE")
  @js.native
  def UONE: Long = js.native
  inline def UONE_=(x: Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UONE")(x.asInstanceOf[js.Any])
  
  /**
    * Unsigned zero.
    */
  /* static member */
  @JSImport("@xtuc/long", "UZERO")
  @js.native
  def UZERO: Long = js.native
  inline def UZERO_=(x: Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UZERO")(x.asInstanceOf[js.Any])
  
  /**
    * Signed zero
    */
  /* static member */
  @JSImport("@xtuc/long", "ZERO")
  @js.native
  def ZERO: Long = js.native
  inline def ZERO_=(x: Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  
  /**
    * Returns a Long representing the 64 bit integer that comes by concatenating the given low and high bits. Each is assumed to use 32 bits.
    */
  /* static member */
  inline def fromBits(lowBits: Double, highBits: Double): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBits")(lowBits.asInstanceOf[js.Any], highBits.asInstanceOf[js.Any])).asInstanceOf[Long]
  inline def fromBits(lowBits: Double, highBits: Double, unsigned: Boolean): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBits")(lowBits.asInstanceOf[js.Any], highBits.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[Long]
  
  /**
    * Creates a Long from its byte representation.
    */
  /* static member */
  inline def fromBytes(bytes: js.Array[Double]): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any]).asInstanceOf[Long]
  inline def fromBytes(bytes: js.Array[Double], unsigned: Boolean): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[Long]
  inline def fromBytes(bytes: js.Array[Double], unsigned: Boolean, le: Boolean): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any], le.asInstanceOf[js.Any])).asInstanceOf[Long]
  inline def fromBytes(bytes: js.Array[Double], unsigned: Unit, le: Boolean): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any], le.asInstanceOf[js.Any])).asInstanceOf[Long]
  
  /**
    * Creates a Long from its big endian byte representation.
    */
  /* static member */
  inline def fromBytesBE(bytes: js.Array[Double]): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytesBE")(bytes.asInstanceOf[js.Any]).asInstanceOf[Long]
  inline def fromBytesBE(bytes: js.Array[Double], unsigned: Boolean): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytesBE")(bytes.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[Long]
  
  /**
    * Creates a Long from its little endian byte representation.
    */
  /* static member */
  inline def fromBytesLE(bytes: js.Array[Double]): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytesLE")(bytes.asInstanceOf[js.Any]).asInstanceOf[Long]
  inline def fromBytesLE(bytes: js.Array[Double], unsigned: Boolean): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytesLE")(bytes.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[Long]
  
  /**
    * Returns a Long representing the given 32 bit integer value.
    */
  /* static member */
  inline def fromInt(value: Double): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInt")(value.asInstanceOf[js.Any]).asInstanceOf[Long]
  inline def fromInt(value: Double, unsigned: Boolean): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromInt")(value.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[Long]
  
  /**
    * Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned.
    */
  /* static member */
  inline def fromNumber(value: Double): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Long]
  inline def fromNumber(value: Double, unsigned: Boolean): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[Long]
  
  /**
    * Returns a Long representation of the given string, written using the specified radix.
    */
  /* static member */
  inline def fromString(str: String): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[Long]
  inline def fromString(str: String, unsigned: Boolean): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[Long]
  inline def fromString(str: String, unsigned: Boolean, radix: Double): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any], radix.asInstanceOf[js.Any])).asInstanceOf[Long]
  inline def fromString(str: String, unsigned: Double): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[Long]
  inline def fromString(str: String, unsigned: Double, radix: Double): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any], radix.asInstanceOf[js.Any])).asInstanceOf[Long]
  inline def fromString(str: String, unsigned: Unit, radix: Double): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any], radix.asInstanceOf[js.Any])).asInstanceOf[Long]
  
  inline def fromValue(`val`: String): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[Long]
  inline def fromValue(`val`: String, unsigned: Boolean): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[Long]
  inline def fromValue(`val`: Double): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[Long]
  inline def fromValue(`val`: Double, unsigned: Boolean): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[Long]
  inline def fromValue(`val`: High): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[Long]
  inline def fromValue(`val`: High, unsigned: Boolean): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[Long]
  /**
    * Converts the specified value to a Long.
    */
  /* static member */
  inline def fromValue(`val`: Long): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[Long]
  inline def fromValue(`val`: Long, unsigned: Boolean): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[Long]
  
  /**
    * Tests if the specified object is a Long.
    */
  /* static member */
  inline def isLong(obj: Any): /* is @xtuc/long.@xtuc/long.Long */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLong")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @xtuc/long.@xtuc/long.Long */ Boolean]
  
  @js.native
  trait Long extends StObject {
    
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
}
