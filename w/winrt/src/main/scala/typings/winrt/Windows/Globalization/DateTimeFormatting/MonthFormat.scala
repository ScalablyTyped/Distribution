package typings.winrt.Windows.Globalization.DateTimeFormatting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MonthFormat extends StObject
@JSGlobal("Windows.Globalization.DateTimeFormatting.MonthFormat")
@js.native
object MonthFormat extends StObject {
  
  @js.native
  sealed trait default
    extends StObject
       with MonthFormat
  
  @js.native
  sealed trait abbreviated
    extends StObject
       with MonthFormat
  
  @js.native
  sealed trait full
    extends StObject
       with MonthFormat
  
  @js.native
  sealed trait none
    extends StObject
       with MonthFormat
  
  @js.native
  sealed trait numeric
    extends StObject
       with MonthFormat
}
