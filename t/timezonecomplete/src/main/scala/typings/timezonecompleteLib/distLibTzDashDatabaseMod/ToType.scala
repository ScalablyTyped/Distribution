package typings
package timezonecompleteLib.distLibTzDashDatabaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ToType extends js.Object

@JSImport("timezonecomplete/dist/lib/tz-database", "ToType")
@js.native
object ToType extends js.Object {
  /**
       * "max"
       */
  @js.native
  sealed trait Max
    extends timezonecompleteLib.distLibTzDashDatabaseMod.ToType
  
  /**
       * Either a year number or "only"
       */
  @js.native
  sealed trait Year
    extends timezonecompleteLib.distLibTzDashDatabaseMod.ToType
  
  /* 1 */ val Max: Max with scala.Double = js.native
  /* 0 */ val Year: Year with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[timezonecompleteLib.distLibTzDashDatabaseMod.ToType with scala.Double] = js.native
}

