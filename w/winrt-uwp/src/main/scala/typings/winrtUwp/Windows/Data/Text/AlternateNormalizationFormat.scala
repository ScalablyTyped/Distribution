package typings.winrtUwp.Windows.Data.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AlternateNormalizationFormat extends StObject
/** Identifies the normalization format of an AlternateWordForm object. */
@JSGlobal("Windows.Data.Text.AlternateNormalizationFormat")
@js.native
object AlternateNormalizationFormat extends StObject {
  
  /** A string that has been recognized as a monetary amount. */
  @js.native
  sealed trait currency
    extends StObject
       with AlternateNormalizationFormat
  
  /** A string that has been recognized as a date. */
  @js.native
  sealed trait date
    extends StObject
       with AlternateNormalizationFormat
  
  /** A regular string that has not been recognized as a number, currency, date, or time. */
  @js.native
  sealed trait notNormalized
    extends StObject
       with AlternateNormalizationFormat
  
  /** A string that has been recognized as a number. */
  @js.native
  sealed trait number
    extends StObject
       with AlternateNormalizationFormat
  
  /** A string that has been recognized as a time. */
  @js.native
  sealed trait time
    extends StObject
       with AlternateNormalizationFormat
}
