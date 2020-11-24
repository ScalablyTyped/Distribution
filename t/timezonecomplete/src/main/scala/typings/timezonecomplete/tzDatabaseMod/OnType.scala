package typings.timezonecomplete.tzDatabaseMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OnType extends js.Object
@JSImport("timezonecomplete/dist/lib/tz-database", "OnType")
@js.native
object OnType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OnType with Double] = js.native
  
  /**
    * Day-of-month number
    */
  @js.native
  sealed trait DayNum extends OnType
  /* 0 */ @js.native
  object DayNum extends TopLevel[DayNum with Double]
  
  /**
    * e.g. "Sun>=8"
    */
  @js.native
  sealed trait GreqX extends OnType
  /* 2 */ @js.native
  object GreqX extends TopLevel[GreqX with Double]
  
  /**
    * "lastSun" or "lastWed" etc
    */
  @js.native
  sealed trait LastX extends OnType
  /* 1 */ @js.native
  object LastX extends TopLevel[LastX with Double]
  
  /**
    * e.g. "Sun<=8"
    */
  @js.native
  sealed trait LeqX extends OnType
  /* 3 */ @js.native
  object LeqX extends TopLevel[LeqX with Double]
}
