package typings
package winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HourFormat extends js.Object

/** Specifies the intended format for the hour in a DateTimeFormatter object. */
@JSGlobal("Windows.Globalization.DateTimeFormatting.HourFormat")
@js.native
object HourFormat extends js.Object {
  /** Display the hour in the most natural way. This will depend on the context, such as the language or clock that is being used. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.HourFormat
  
  /** Do not display the hour. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.HourFormat
  
  val default: default with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.HourFormat with java.lang.String
  ] = js.native
}

