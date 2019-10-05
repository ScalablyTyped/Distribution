package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AssertionLevel extends js.Object

@JSGlobal("TypeScript.AssertionLevel")
@js.native
object AssertionLevel extends js.Object {
  @js.native
  sealed trait Aggressive extends AssertionLevel
  
  @js.native
  sealed trait None extends AssertionLevel
  
  @js.native
  sealed trait Normal extends AssertionLevel
  
  @js.native
  sealed trait VeryAggressive extends AssertionLevel
  
  /* 2 */ val Aggressive: typings.typescriptDashServices.TypeScript.AssertionLevel.Aggressive with Double = js.native
  /* 0 */ val None: typings.typescriptDashServices.TypeScript.AssertionLevel.None with Double = js.native
  /* 1 */ val Normal: typings.typescriptDashServices.TypeScript.AssertionLevel.Normal with Double = js.native
  /* 3 */ val VeryAggressive: typings.typescriptDashServices.TypeScript.AssertionLevel.VeryAggressive with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AssertionLevel with Double] = js.native
}

