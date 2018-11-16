package typings
package winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SecondFormat extends js.Object

@JSGlobal("Windows.Globalization.DateTimeFormatting.SecondFormat")
@js.native
object SecondFormat extends js.Object {
  @js.native
  sealed trait default
    extends winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.SecondFormat
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.SecondFormat
  
  val default: default with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.SecondFormat with java.lang.String
  ] = js.native
}

