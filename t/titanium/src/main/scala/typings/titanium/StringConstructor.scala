package typings.titanium

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// String constructor augmentation ---------------------------------------------
@js.native
trait StringConstructor extends StObject {
  
  /**
    * Formats a string using `printf`-style substitution.
    *
    * @param formatString An IEEE `printf`-style string, containing zero or more conversion specifications.
    * @param value Values to substitute into the `formatString`.
    */
  def format(formatString: String, value: (String | Double)*): String = js.native
  
  /**
    * Formats a number into the currency format, including currency symbol, of the locale
    * configured for the system.
    *
    * @param value Currency value,
    */
  def formatCurrency(value: Double): String = js.native
  
  /**
    * Formats a date into the date format of the locale configured for the system.
    *
    * @param date Date to format.
    * @param format Date format to use. One of 'short', 'medium', 'long' or 'full'. Defaults to 'short'.
    */
  def formatDate(date: Date): String = js.native
  def formatDate(date: Date, format: String): String = js.native
  
  /**
    * @param value Value to format.
    * @param locale Locale string. For example, `en-US` for US English.
    * @param pattern Format pattern.
    */
  def formatDecimal(value: Double, locale: String, pattern: String): String = js.native
  /**
    * Formats a number into the decimal format, including decimal symbol, of the locale
    * configured for the system.
    *
    * @param value Value to format.
    * @param pattern Format pattern.
    */
  def formatDecimal(value: Double, pattern: String): String = js.native
  
  /**
    * Formats a date into the time format of the locale configured for the system.
    *
    * @param date Date to format.
    * @param format Date format to use. One of 'short', 'medium', or 'long' (iOS only). Defaults to 'short'.
    */
  def formatTime(date: Date): String = js.native
  def formatTime(date: Date, format: String): String = js.native
}
