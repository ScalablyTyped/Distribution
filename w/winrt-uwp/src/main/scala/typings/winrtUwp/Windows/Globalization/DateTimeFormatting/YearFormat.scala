package typings.winrtUwp.Windows.Globalization.DateTimeFormatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait YearFormat extends js.Object
/** Specifies the intended format for the year in a DateTimeFormatter object. */
@JSGlobal("Windows.Globalization.DateTimeFormatting.YearFormat")
@js.native
object YearFormat extends js.Object {
  
  /** Display an abbreviated version of the year (for example, "11" for Gregorian 2011). */
  @js.native
  sealed trait abbreviated extends YearFormat
  
  /** Display the year in the most natural way. It may be abbreviated or full depending on the context, such as the language or calendar that is being used. */
  @js.native
  sealed trait default extends YearFormat
  
  /** Display the year in its entirety (for example, "2011" for Gregorian 2011). */
  @js.native
  sealed trait full extends YearFormat
  
  /** Do not display the year. */
  @js.native
  sealed trait none extends YearFormat
}
