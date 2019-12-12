package typings.timezonecomplete.distLibTzDashDatabaseMod

import org.scalablytyped.runtime.TopLevel
import typings.timezonecomplete.distLibTzDashDatabaseMod.ToType.Max
import typings.timezonecomplete.distLibTzDashDatabaseMod.ToType.Year
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ToType with Double] = js.native
  /* 1 */ @js.native
  object Max extends TopLevel[Max with Double]
  
  /* 0 */ @js.native
  object Year extends TopLevel[Year with Double]
  
}

