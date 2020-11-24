package typings.timezonecomplete.tzDatabaseMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ToType extends js.Object
@JSImport("timezonecomplete/dist/lib/tz-database", "ToType")
@js.native
object ToType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ToType with Double] = js.native
  
  /**
    * "max"
    */
  @js.native
  sealed trait Max extends ToType
  /* 1 */ @js.native
  object Max extends TopLevel[Max with Double]
  
  /**
    * Either a year number or "only"
    */
  @js.native
  sealed trait Year extends ToType
  /* 0 */ @js.native
  object Year extends TopLevel[Year with Double]
}
