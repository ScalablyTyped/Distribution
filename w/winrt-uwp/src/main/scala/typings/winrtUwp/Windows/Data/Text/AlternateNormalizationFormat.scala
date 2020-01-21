package typings.winrtUwp.Windows.Data.Text

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AlternateNormalizationFormat extends js.Object

/** Identifies the normalization format of an AlternateWordForm object. */
@JSGlobal("Windows.Data.Text.AlternateNormalizationFormat")
@js.native
object AlternateNormalizationFormat extends js.Object {
  /** A string that has been recognized as a monetary amount. */
  @js.native
  sealed trait currency extends AlternateNormalizationFormat
  
  /** A string that has been recognized as a date. */
  @js.native
  sealed trait date extends AlternateNormalizationFormat
  
  /** A regular string that has not been recognized as a number, currency, date, or time. */
  @js.native
  sealed trait notNormalized extends AlternateNormalizationFormat
  
  /** A string that has been recognized as a number. */
  @js.native
  sealed trait number extends AlternateNormalizationFormat
  
  /** A string that has been recognized as a time. */
  @js.native
  sealed trait time extends AlternateNormalizationFormat
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AlternateNormalizationFormat with Double] = js.native
  /* 2 */ @js.native
  object currency extends TopLevel[currency with Double]
  
  /* 3 */ @js.native
  object date extends TopLevel[date with Double]
  
  /* 0 */ @js.native
  object notNormalized extends TopLevel[notNormalized with Double]
  
  /* 1 */ @js.native
  object number extends TopLevel[number with Double]
  
  /* 4 */ @js.native
  object time extends TopLevel[time with Double]
  
}

