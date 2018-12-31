package typings
package timezonecompleteLib.distLibTzDashDatabaseMod

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
  sealed trait None
    extends timezonecompleteLib.distLibTzDashDatabaseMod.RuleType
  
  /**
    * Fixed given offset
    */
  @js.native
  sealed trait Offset
    extends timezonecompleteLib.distLibTzDashDatabaseMod.RuleType
  
  /**
    * Reference to a named set of rules
    */
  @js.native
  sealed trait RuleName
    extends timezonecompleteLib.distLibTzDashDatabaseMod.RuleType
  
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val Offset: Offset with scala.Double = js.native
  /* 2 */ val RuleName: RuleName with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[timezonecompleteLib.distLibTzDashDatabaseMod.RuleType with scala.Double] = js.native
}

