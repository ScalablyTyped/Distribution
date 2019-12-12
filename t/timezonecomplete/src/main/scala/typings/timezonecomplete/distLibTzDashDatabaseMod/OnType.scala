package typings.timezonecomplete.distLibTzDashDatabaseMod

import org.scalablytyped.runtime.TopLevel
import typings.timezonecomplete.distLibTzDashDatabaseMod.OnType.DayNum
import typings.timezonecomplete.distLibTzDashDatabaseMod.OnType.GreqX
import typings.timezonecomplete.distLibTzDashDatabaseMod.OnType.LastX
import typings.timezonecomplete.distLibTzDashDatabaseMod.OnType.LeqX
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OnType with Double] = js.native
  /* 0 */ @js.native
  object DayNum extends TopLevel[DayNum with Double]
  
  /* 2 */ @js.native
  object GreqX extends TopLevel[GreqX with Double]
  
  /* 1 */ @js.native
  object LastX extends TopLevel[LastX with Double]
  
  /* 3 */ @js.native
  object LeqX extends TopLevel[LeqX with Double]
  
}

