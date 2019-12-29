package typings.winrtDashUwp.Windows.Globalization.DateTimeFormatting

import org.scalablytyped.runtime.TopLevel
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
  sealed trait default extends SecondFormat
  
  /** Do not display the second. */
  @js.native
  sealed trait none extends SecondFormat
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SecondFormat with Double] = js.native
  /* 1 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

