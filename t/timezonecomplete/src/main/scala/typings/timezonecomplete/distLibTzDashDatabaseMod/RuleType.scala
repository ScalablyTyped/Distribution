package typings.timezonecomplete.distLibTzDashDatabaseMod

import org.scalablytyped.runtime.TopLevel
import typings.timezonecomplete.distLibTzDashDatabaseMod.RuleType.None
import typings.timezonecomplete.distLibTzDashDatabaseMod.RuleType.Offset
import typings.timezonecomplete.distLibTzDashDatabaseMod.RuleType.RuleName
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RuleType with Double] = js.native
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Offset extends TopLevel[Offset with Double]
  
  /* 2 */ @js.native
  object RuleName extends TopLevel[RuleName with Double]
  
}

