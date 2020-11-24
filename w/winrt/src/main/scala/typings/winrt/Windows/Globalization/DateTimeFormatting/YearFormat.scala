package typings.winrt.Windows.Globalization.DateTimeFormatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait YearFormat extends js.Object
@JSGlobal("Windows.Globalization.DateTimeFormatting.YearFormat")
@js.native
object YearFormat extends js.Object {
  
  @js.native
  sealed trait abbreviated extends YearFormat
  
  @js.native
  sealed trait default extends YearFormat
  
  @js.native
  sealed trait full extends YearFormat
  
  @js.native
  sealed trait none extends YearFormat
}
