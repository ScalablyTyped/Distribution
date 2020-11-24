package typings.typeorm.browserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "Timestamp")
@js.native
class Timestamp protected ()
  extends typings.typeorm.typingsMod.Timestamp {
  /**
    * @param low The low (signed) 32 bits of the Timestamp.
    * @param high The high (signed) 32 bits of the Timestamp.
    */
  def this(low: scala.Double, high: scala.Double) = this()
}
/* static members */
@JSImport("typeorm/browser", "Timestamp")
@js.native
object Timestamp extends js.Object {
  
  var MAX_VALUE: typings.typeorm.typingsMod.Timestamp = js.native
  
  var MIN_VALUE: typings.typeorm.typingsMod.Timestamp = js.native
  
  var NEG_ONE: typings.typeorm.typingsMod.Timestamp = js.native
  
  var ONE: typings.typeorm.typingsMod.Timestamp = js.native
  
  var ZERO: typings.typeorm.typingsMod.Timestamp = js.native
  
  /**
    * Returns a Timestamp representing the 64-bit integer that comes by concatenating the
    * given high and low bits. Each is assumed to use 32 bits..
    *
    * @param lowBits The low 32-bits.
    * @param highBits The high 32-bits.
    */
  def fromBits(lowBits: scala.Double, highBits: scala.Double): typings.typeorm.typingsMod.Timestamp = js.native
  
  /**
    * Returns a Timestamp representing the given (32-bit) integer value.
    *
    * @param value The 32-bit integer in question.
    */
  def fromInt(value: scala.Double): typings.typeorm.typingsMod.Timestamp = js.native
  
  /**
    * Returns a Timestamp representing the given value, provided that it is a finite number. Otherwise, zero is returned.
    *
    * @param value The number in question.
    */
  def fromNumber(value: scala.Double): typings.typeorm.typingsMod.Timestamp = js.native
  
  /**
    * Returns a Timestamp representation of the given string, written using the given radix.
    *
    * @param str The textual representation of the Timestamp.
    * @param radix The radix in which the text is written.
    */
  def fromString(str: String): typings.typeorm.typingsMod.Timestamp = js.native
  def fromString(str: String, radix: scala.Double): typings.typeorm.typingsMod.Timestamp = js.native
}
