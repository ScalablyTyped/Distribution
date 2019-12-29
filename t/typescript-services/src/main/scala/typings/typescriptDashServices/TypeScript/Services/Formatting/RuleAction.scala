package typings.typescriptDashServices.TypeScript.Services.Formatting

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RuleAction extends js.Object

@JSGlobal("TypeScript.Services.Formatting.RuleAction")
@js.native
object RuleAction extends js.Object {
  @js.native
  sealed trait Delete extends RuleAction
  
  @js.native
  sealed trait Ignore extends RuleAction
  
  @js.native
  sealed trait NewLine extends RuleAction
  
  @js.native
  sealed trait Space extends RuleAction
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RuleAction with Double] = js.native
  /* 3 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  /* 0 */ @js.native
  object Ignore extends TopLevel[Ignore with Double]
  
  /* 2 */ @js.native
  object NewLine extends TopLevel[NewLine with Double]
  
  /* 1 */ @js.native
  object Space extends TopLevel[Space with Double]
  
}

