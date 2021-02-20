package typings.typeorm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "Long")
@js.native
class Long protected ()
  extends typings.typeorm.mongodbTypingsMod.Long {
  /**
    * @param low The low (signed) 32 bits of the Long.
    * @param high The high (signed) 32 bits of the Long.
    */
  def this(low: scala.Double, high: scala.Double) = this()
}
/* static members */
object Long {
  
  @JSImport("typeorm", "Long")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typeorm", "Long.MAX_VALUE")
  @js.native
  def MAX_VALUE: typings.typeorm.mongodbTypingsMod.Long = js.native
  @scala.inline
  def MAX_VALUE_=(x: typings.typeorm.mongodbTypingsMod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_VALUE")(x.asInstanceOf[js.Any])
  
  @JSImport("typeorm", "Long.MIN_VALUE")
  @js.native
  def MIN_VALUE: typings.typeorm.mongodbTypingsMod.Long = js.native
  @scala.inline
  def MIN_VALUE_=(x: typings.typeorm.mongodbTypingsMod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_VALUE")(x.asInstanceOf[js.Any])
  
  @JSImport("typeorm", "Long.NEG_ONE")
  @js.native
  def NEG_ONE: typings.typeorm.mongodbTypingsMod.Long = js.native
  @scala.inline
  def NEG_ONE_=(x: typings.typeorm.mongodbTypingsMod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NEG_ONE")(x.asInstanceOf[js.Any])
  
  @JSImport("typeorm", "Long.ONE")
  @js.native
  def ONE: typings.typeorm.mongodbTypingsMod.Long = js.native
  @scala.inline
  def ONE_=(x: typings.typeorm.mongodbTypingsMod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
  
  @JSImport("typeorm", "Long.ZERO")
  @js.native
  def ZERO: typings.typeorm.mongodbTypingsMod.Long = js.native
  @scala.inline
  def ZERO_=(x: typings.typeorm.mongodbTypingsMod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  
  /**
    * Returns a Long representing the 64-bit integer that comes by concatenating the given high and low bits.
    * Each is assumed to use 32 bits.
    *
    * @param lowBits The low 32-bits.
    * @param highBits The high 32-bits.
    */
  @JSImport("typeorm", "Long.fromBits")
  @js.native
  def fromBits(lowBits: scala.Double, highBits: scala.Double): typings.typeorm.mongodbTypingsMod.Long = js.native
  
  /**
    * Returns a Long representing the given (32-bit) integer value.
    *
    * @param value The 32-bit integer in question.
    */
  @JSImport("typeorm", "Long.fromInt")
  @js.native
  def fromInt(value: scala.Double): typings.typeorm.mongodbTypingsMod.Long = js.native
  
  /**
    * Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned.
    *
    * @param value The number in question.
    */
  @JSImport("typeorm", "Long.fromNumber")
  @js.native
  def fromNumber(value: scala.Double): typings.typeorm.mongodbTypingsMod.Long = js.native
  
  /**
    * Returns a Long representation of the given string, written using the given radix.
    *
    * @param str The textual representation of the Long.
    * @param radix The radix in which the text is written.
    */
  @JSImport("typeorm", "Long.fromString")
  @js.native
  def fromString(str: String): typings.typeorm.mongodbTypingsMod.Long = js.native
  @JSImport("typeorm", "Long.fromString")
  @js.native
  def fromString(str: String, radix: scala.Double): typings.typeorm.mongodbTypingsMod.Long = js.native
}
