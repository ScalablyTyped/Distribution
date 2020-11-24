package typings.typeorm.mod

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
@JSImport("typeorm", "Long")
@js.native
object Long extends js.Object {
  
  var MAX_VALUE: typings.typeorm.mongodbTypingsMod.Long = js.native
  
  var MIN_VALUE: typings.typeorm.mongodbTypingsMod.Long = js.native
  
  var NEG_ONE: typings.typeorm.mongodbTypingsMod.Long = js.native
  
  var ONE: typings.typeorm.mongodbTypingsMod.Long = js.native
  
  var ZERO: typings.typeorm.mongodbTypingsMod.Long = js.native
  
  /**
    * Returns a Long representing the 64-bit integer that comes by concatenating the given high and low bits.
    * Each is assumed to use 32 bits.
    *
    * @param lowBits The low 32-bits.
    * @param highBits The high 32-bits.
    */
  def fromBits(lowBits: scala.Double, highBits: scala.Double): typings.typeorm.mongodbTypingsMod.Long = js.native
  
  /**
    * Returns a Long representing the given (32-bit) integer value.
    *
    * @param value The 32-bit integer in question.
    */
  def fromInt(value: scala.Double): typings.typeorm.mongodbTypingsMod.Long = js.native
  
  /**
    * Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned.
    *
    * @param value The number in question.
    */
  def fromNumber(value: scala.Double): typings.typeorm.mongodbTypingsMod.Long = js.native
  
  /**
    * Returns a Long representation of the given string, written using the given radix.
    *
    * @param str The textual representation of the Long.
    * @param radix The radix in which the text is written.
    */
  def fromString(str: String): typings.typeorm.mongodbTypingsMod.Long = js.native
  def fromString(str: String, radix: scala.Double): typings.typeorm.mongodbTypingsMod.Long = js.native
}
