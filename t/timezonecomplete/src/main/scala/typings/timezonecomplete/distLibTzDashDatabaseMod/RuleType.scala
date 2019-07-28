package typings.timezonecomplete.distLibTzDashDatabaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RuleType extends js.Object

@JSImport("timezonecomplete/dist/lib/tz-database", "RuleType")
@js.native
object RuleType extends js.Object {
  /**
    * No rule applies
    */
  @js.native
  sealed trait None extends RuleType
  
  /**
    * Fixed given offset
    */
  @js.native
  sealed trait Offset extends RuleType
  
  /**
    * Reference to a named set of rules
    */
  @js.native
  sealed trait RuleName extends RuleType
  
  /* 0 */ val None: typings.timezonecomplete.distLibTzDashDatabaseMod.RuleType.None with Double = js.native
  /* 1 */ val Offset: typings.timezonecomplete.distLibTzDashDatabaseMod.RuleType.Offset with Double = js.native
  /* 2 */ val RuleName: typings.timezonecomplete.distLibTzDashDatabaseMod.RuleType.RuleName with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RuleType with Double] = js.native
}

