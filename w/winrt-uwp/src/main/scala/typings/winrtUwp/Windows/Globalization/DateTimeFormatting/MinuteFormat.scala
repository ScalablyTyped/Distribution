package typings.winrtUwp.Windows.Globalization.DateTimeFormatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MinuteFormat extends js.Object
/** Specifies the intended format for the minute in a DateTimeFormatter object. */
@JSGlobal("Windows.Globalization.DateTimeFormatting.MinuteFormat")
@js.native
object MinuteFormat extends js.Object {
  
  /** Display the minute in the most natural way. This will depend on the context, such as the language or clock that is being used. */
  @js.native
  sealed trait default extends MinuteFormat
  
  /** Do not display the minute. */
  @js.native
  sealed trait none extends MinuteFormat
}
