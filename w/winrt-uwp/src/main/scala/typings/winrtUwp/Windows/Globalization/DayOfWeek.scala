package typings.winrtUwp.Windows.Globalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DayOfWeek extends js.Object

/** Identifies the day of the week. */
@JSGlobal("Windows.Globalization.DayOfWeek")
@js.native
object DayOfWeek extends js.Object {
  /** Friday */
  @js.native
  sealed trait friday extends DayOfWeek
  
  /** Monday */
  @js.native
  sealed trait monday extends DayOfWeek
  
  /** Saturday */
  @js.native
  sealed trait saturday extends DayOfWeek
  
  /** Sunday */
  @js.native
  sealed trait sunday extends DayOfWeek
  
  /** Thursday */
  @js.native
  sealed trait thursday extends DayOfWeek
  
  /** Tuesday */
  @js.native
  sealed trait tuesday extends DayOfWeek
  
  /** Wednesday */
  @js.native
  sealed trait wednesday extends DayOfWeek
  
}

