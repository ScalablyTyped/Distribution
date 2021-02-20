package typings.typeorm.browserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "Long")
@js.native
class Long protected ()
  extends typings.typeorm.typingsMod.Long {
  /**
    * @param low The low (signed) 32 bits of the Long.
    * @param high The high (signed) 32 bits of the Long.
    */
  def this(low: scala.Double, high: scala.Double) = this()
}
/* static members */
object Long {
  
  @JSImport("typeorm/browser", "Long")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typeorm/browser", "Long.MAX_VALUE")
  @js.native
  def MAX_VALUE: typings.typeorm.typingsMod.Long = js.native
  @scala.inline
  def MAX_VALUE_=(x: typings.typeorm.typingsMod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_VALUE")(x.asInstanceOf[js.Any])
  
  @JSImport("typeorm/browser", "Long.MIN_VALUE")
  @js.native
  def MIN_VALUE: typings.typeorm.typingsMod.Long = js.native
  @scala.inline
  def MIN_VALUE_=(x: typings.typeorm.typingsMod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_VALUE")(x.asInstanceOf[js.Any])
  
  @JSImport("typeorm/browser", "Long.NEG_ONE")
  @js.native
  def NEG_ONE: typings.typeorm.typingsMod.Long = js.native
  @scala.inline
  def NEG_ONE_=(x: typings.typeorm.typingsMod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NEG_ONE")(x.asInstanceOf[js.Any])
  
  @JSImport("typeorm/browser", "Long.ONE")
  @js.native
  def ONE: typings.typeorm.typingsMod.Long = js.native
  @scala.inline
  def ONE_=(x: typings.typeorm.typingsMod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
  
  @JSImport("typeorm/browser", "Long.ZERO")
  @js.native
  def ZERO: typings.typeorm.typingsMod.Long = js.native
  @scala.inline
  def ZERO_=(x: typings.typeorm.typingsMod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  
  /**
    * Returns a Long representing the 64-bit integer that comes by concatenating the given high and low bits.
    * Each is assumed to use 32 bits.
    *
    * @param lowBits The low 32-bits.
    * @param highBits The high 32-bits.
    */
  @JSImport("typeorm/browser", "Long.fromBits")
  @js.native
  def fromBits(lowBits: scala.Double, highBits: scala.Double): typings.typeorm.typingsMod.Long = js.native
  
  /**
    * Returns a Long representing the given (32-bit) integer value.
    *
    * @param value The 32-bit integer in question.
    */
  @JSImport("typeorm/browser", "Long.fromInt")
  @js.native
  def fromInt(value: scala.Double): typings.typeorm.typingsMod.Long = js.native
  
  /**
    * Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned.
    *
    * @param value The number in question.
    */
  @JSImport("typeorm/browser", "Long.fromNumber")
  @js.native
  def fromNumber(value: scala.Double): typings.typeorm.typingsMod.Long = js.native
  
  /**
    * Returns a Long representation of the given string, written using the given radix.
    *
    * @param str The textual representation of the Long.
    * @param radix The radix in which the text is written.
    */
  @JSImport("typeorm/browser", "Long.fromString")
  @js.native
  def fromString(str: String): typings.typeorm.typingsMod.Long = js.native
  @JSImport("typeorm/browser", "Long.fromString")
  @js.native
  def fromString(str: String, radix: scala.Double): typings.typeorm.typingsMod.Long = js.native
}
