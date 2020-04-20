package typings.titanium

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The JavaScript built-in String type.
  */
@js.native
trait String extends js.Object {
  /**
  	 * Formats a string using `printf`-style substitution.
  	 */
  def format(formatString: java.lang.String, value: (java.lang.String | Double)*): java.lang.String = js.native
  /**
  	 * Formats a number into the currency format, including currency symbol, of the locale
  	 * configured for the system.
  	 */
  def formatCurrency(value: Double): java.lang.String = js.native
  /**
  	 * Formats a date into the date format of the locale configured for the system.
  	 */
  def formatDate(date: Date): java.lang.String = js.native
  def formatDate(date: Date, format: java.lang.String): java.lang.String = js.native
  /**
  	 * Formats a number into the decimal format, including decimal symbol, of the locale
  	 * configured for the system.
  	 */
  def formatDecimal(value: Double): java.lang.String = js.native
  def formatDecimal(value: Double, locale: java.lang.String): java.lang.String = js.native
  def formatDecimal(value: Double, locale: java.lang.String, pattern: java.lang.String): java.lang.String = js.native
  /**
  	 * Formats a date into the time format of the locale configured for the system.
  	 */
  def formatTime(date: Date): java.lang.String = js.native
  def formatTime(date: Date, format: java.lang.String): java.lang.String = js.native
}

