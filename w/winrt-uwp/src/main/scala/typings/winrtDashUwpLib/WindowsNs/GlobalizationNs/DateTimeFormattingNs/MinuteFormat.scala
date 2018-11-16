package typings
package winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MinuteFormat extends js.Object

/** Specifies the intended format for the minute in a DateTimeFormatter object. */
@JSGlobal("Windows.Globalization.DateTimeFormatting.MinuteFormat")
@js.native
object MinuteFormat extends js.Object {
  /** Display the minute in the most natural way. This will depend on the context, such as the language or clock that is being used. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.MinuteFormat
  
  /** Do not display the minute. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.MinuteFormat
  
  val default: default with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.MinuteFormat with java.lang.String
  ] = js.native
}

