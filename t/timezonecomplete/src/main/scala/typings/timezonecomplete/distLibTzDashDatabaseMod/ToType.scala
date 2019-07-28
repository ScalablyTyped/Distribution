package typings.timezonecomplete.distLibTzDashDatabaseMod

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
  sealed trait Max extends ToType
  
  /**
    * Either a year number or "only"
    */
  @js.native
  sealed trait Year extends ToType
  
  /* 1 */ val Max: typings.timezonecomplete.distLibTzDashDatabaseMod.ToType.Max with Double = js.native
  /* 0 */ val Year: typings.timezonecomplete.distLibTzDashDatabaseMod.ToType.Year with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ToType with Double] = js.native
}

