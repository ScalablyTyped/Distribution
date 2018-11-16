package typings
package winrtDashUwpLib.WindowsNs.DataNs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AlternateNormalizationFormat extends js.Object

/** Identifies the normalization format of an AlternateWordForm object. */
@JSGlobal("Windows.Data.Text.AlternateNormalizationFormat")
@js.native
object AlternateNormalizationFormat extends js.Object {
  /** A string that has been recognized as a monetary amount. */
  @js.native
  sealed trait currency
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.AlternateNormalizationFormat
  
  /** A string that has been recognized as a date. */
  @js.native
  sealed trait date
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.AlternateNormalizationFormat
  
  /** A regular string that has not been recognized as a number, currency, date, or time. */
  @js.native
  sealed trait notNormalized
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.AlternateNormalizationFormat
  
  /** A string that has been recognized as a number. */
  @js.native
  sealed trait number
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.AlternateNormalizationFormat
  
  /** A string that has been recognized as a time. */
  @js.native
  sealed trait time
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.AlternateNormalizationFormat
  
  val currency: currency with java.lang.String = js.native
  val date: date with java.lang.String = js.native
  val notNormalized: notNormalized with java.lang.String = js.native
  val number: number with java.lang.String = js.native
  val time: time with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DataNs.TextNs.AlternateNormalizationFormat with java.lang.String
  ] = js.native
}

