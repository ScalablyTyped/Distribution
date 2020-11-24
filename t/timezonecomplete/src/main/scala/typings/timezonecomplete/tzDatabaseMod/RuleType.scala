package typings.timezonecomplete.tzDatabaseMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RuleType extends js.Object
@JSImport("timezonecomplete/dist/lib/tz-database", "RuleType")
@js.native
object RuleType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RuleType with Double] = js.native
  
  /**
    * No rule applies
    */
  @js.native
  sealed trait None extends RuleType
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /**
    * Fixed given offset
    */
  @js.native
  sealed trait Offset extends RuleType
  /* 1 */ @js.native
  object Offset extends TopLevel[Offset with Double]
  
  /**
    * Reference to a named set of rules
    */
  @js.native
  sealed trait RuleName extends RuleType
  /* 2 */ @js.native
  object RuleName extends TopLevel[RuleName with Double]
}
