package typings
package timezonecompleteLib.distLibTzDashDatabaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AtType extends js.Object

@JSImport("timezonecomplete/dist/lib/tz-database", "AtType")
@js.native
object AtType extends js.Object {
  /**
    * Local time (no DST)
    */
  @js.native
  sealed trait Standard
    extends timezonecompleteLib.distLibTzDashDatabaseMod.AtType
  
  /**
    * Utc time
    */
  @js.native
  sealed trait Utc
    extends timezonecompleteLib.distLibTzDashDatabaseMod.AtType
  
  /**
    * Wall clock time (local time with DST)
    */
  @js.native
  sealed trait Wall
    extends timezonecompleteLib.distLibTzDashDatabaseMod.AtType
  
  /* 0 */ val Standard: Standard with scala.Double = js.native
  /* 2 */ val Utc: Utc with scala.Double = js.native
  /* 1 */ val Wall: Wall with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[timezonecompleteLib.distLibTzDashDatabaseMod.AtType with scala.Double] = js.native
}

