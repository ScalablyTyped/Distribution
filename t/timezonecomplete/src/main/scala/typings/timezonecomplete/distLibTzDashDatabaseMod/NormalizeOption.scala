package typings.timezonecomplete.distLibTzDashDatabaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NormalizeOption extends js.Object

@JSImport("timezonecomplete/dist/lib/tz-database", "NormalizeOption")
@js.native
object NormalizeOption extends js.Object {
  /**
    * Normalize non-existing times by SUBTRACTING the DST offset
    */
  @js.native
  sealed trait Down extends NormalizeOption
  
  /**
    * Normalize non-existing times by ADDING the DST offset
    */
  @js.native
  sealed trait Up extends NormalizeOption
  
  /* 1 */ val Down: typings.timezonecomplete.distLibTzDashDatabaseMod.NormalizeOption.Down with Double = js.native
  /* 0 */ val Up: typings.timezonecomplete.distLibTzDashDatabaseMod.NormalizeOption.Up with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NormalizeOption with Double] = js.native
}

