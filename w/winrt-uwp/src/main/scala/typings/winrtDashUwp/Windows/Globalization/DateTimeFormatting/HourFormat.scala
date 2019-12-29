package typings.winrtDashUwp.Windows.Globalization.DateTimeFormatting

import org.scalablytyped.runtime.TopLevel
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
  sealed trait default extends HourFormat
  
  /** Do not display the hour. */
  @js.native
  sealed trait none extends HourFormat
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HourFormat with Double] = js.native
  /* 1 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

