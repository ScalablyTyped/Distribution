package typings.timezonecomplete.distLibTzDashDatabaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OnType extends js.Object

@JSImport("timezonecomplete/dist/lib/tz-database", "OnType")
@js.native
object OnType extends js.Object {
  /**
    * Day-of-month number
    */
  @js.native
  sealed trait DayNum extends OnType
  
  /**
    * e.g. "Sun>=8"
    */
  @js.native
  sealed trait GreqX extends OnType
  
  /**
    * "lastSun" or "lastWed" etc
    */
  @js.native
  sealed trait LastX extends OnType
  
  /**
    * e.g. "Sun<=8"
    */
  @js.native
  sealed trait LeqX extends OnType
  
  /* 0 */ val DayNum: typings.timezonecomplete.distLibTzDashDatabaseMod.OnType.DayNum with Double = js.native
  /* 2 */ val GreqX: typings.timezonecomplete.distLibTzDashDatabaseMod.OnType.GreqX with Double = js.native
  /* 1 */ val LastX: typings.timezonecomplete.distLibTzDashDatabaseMod.OnType.LastX with Double = js.native
  /* 3 */ val LeqX: typings.timezonecomplete.distLibTzDashDatabaseMod.OnType.LeqX with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OnType with Double] = js.native
}

