package typings
package timezonecompleteLib.distLibTzDashDatabaseMod

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
  sealed trait Down
    extends timezonecompleteLib.distLibTzDashDatabaseMod.NormalizeOption
  
  /**
       * Normalize non-existing times by ADDING the DST offset
       */
  @js.native
  sealed trait Up
    extends timezonecompleteLib.distLibTzDashDatabaseMod.NormalizeOption
  
  /* 1 */ val Down: Down with scala.Double = js.native
  /* 0 */ val Up: Up with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[timezonecompleteLib.distLibTzDashDatabaseMod.NormalizeOption with scala.Double] = js.native
}

