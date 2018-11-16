package typings
package winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SecondFormat extends js.Object

/** Specifies the intended format for the second in a DateTimeFormatter object. */
@JSGlobal("Windows.Globalization.DateTimeFormatting.SecondFormat")
@js.native
object SecondFormat extends js.Object {
  /** Display the second in the most natural way. This will depend on the context, such as the language or clock that is being used. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.SecondFormat
  
  /** Do not display the second. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.SecondFormat
  
  val default: default with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.SecondFormat with java.lang.String
  ] = js.native
}

