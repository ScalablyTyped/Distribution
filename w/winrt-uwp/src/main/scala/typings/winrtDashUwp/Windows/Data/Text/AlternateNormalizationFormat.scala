package typings.winrtDashUwp.Windows.Data.Text

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
  
  /* 2 */ val currency: typings.winrtDashUwp.Windows.Data.Text.AlternateNormalizationFormat.currency with Double = js.native
  /* 3 */ val date: typings.winrtDashUwp.Windows.Data.Text.AlternateNormalizationFormat.date with Double = js.native
  /* 0 */ val notNormalized: typings.winrtDashUwp.Windows.Data.Text.AlternateNormalizationFormat.notNormalized with Double = js.native
  /* 1 */ val number: typings.winrtDashUwp.Windows.Data.Text.AlternateNormalizationFormat.number with Double = js.native
  /* 4 */ val time: typings.winrtDashUwp.Windows.Data.Text.AlternateNormalizationFormat.time with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AlternateNormalizationFormat with Double] = js.native
}

