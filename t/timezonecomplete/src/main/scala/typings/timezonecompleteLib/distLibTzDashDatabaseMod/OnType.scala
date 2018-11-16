package typings
package timezonecompleteLib.distLibTzDashDatabaseMod

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
  sealed trait DayNum
    extends timezonecompleteLib.distLibTzDashDatabaseMod.OnType
  
  /**
       * e.g. "Sun>=8"
       */
  @js.native
  sealed trait GreqX
    extends timezonecompleteLib.distLibTzDashDatabaseMod.OnType
  
  /**
       * "lastSun" or "lastWed" etc
       */
  @js.native
  sealed trait LastX
    extends timezonecompleteLib.distLibTzDashDatabaseMod.OnType
  
  /**
       * e.g. "Sun<=8"
       */
  @js.native
  sealed trait LeqX
    extends timezonecompleteLib.distLibTzDashDatabaseMod.OnType
  
  /* 0 */ val DayNum: DayNum with scala.Double = js.native
  /* 2 */ val GreqX: GreqX with scala.Double = js.native
  /* 1 */ val LastX: LastX with scala.Double = js.native
  /* 3 */ val LeqX: LeqX with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[timezonecompleteLib.distLibTzDashDatabaseMod.OnType with scala.Double] = js.native
}

