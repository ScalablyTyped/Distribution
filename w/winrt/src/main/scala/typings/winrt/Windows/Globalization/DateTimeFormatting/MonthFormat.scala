package typings.winrt.Windows.Globalization.DateTimeFormatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MonthFormat extends js.Object
@JSGlobal("Windows.Globalization.DateTimeFormatting.MonthFormat")
@js.native
object MonthFormat extends js.Object {
  
  @js.native
  sealed trait abbreviated extends MonthFormat
  
  @js.native
  sealed trait default extends MonthFormat
  
  @js.native
  sealed trait full extends MonthFormat
  
  @js.native
  sealed trait none extends MonthFormat
  
  @js.native
  sealed trait numeric extends MonthFormat
}
