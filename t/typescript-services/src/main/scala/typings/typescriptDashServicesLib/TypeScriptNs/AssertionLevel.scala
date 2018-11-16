package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AssertionLevel extends js.Object

@JSGlobal("TypeScript.AssertionLevel")
@js.native
object AssertionLevel extends js.Object {
  @js.native
  sealed trait Aggressive
    extends typescriptDashServicesLib.TypeScriptNs.AssertionLevel
  
  @js.native
  sealed trait None
    extends typescriptDashServicesLib.TypeScriptNs.AssertionLevel
  
  @js.native
  sealed trait Normal
    extends typescriptDashServicesLib.TypeScriptNs.AssertionLevel
  
  @js.native
  sealed trait VeryAggressive
    extends typescriptDashServicesLib.TypeScriptNs.AssertionLevel
  
  /* 2 */ val Aggressive: Aggressive with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val Normal: Normal with scala.Double = js.native
  /* 3 */ val VeryAggressive: VeryAggressive with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptDashServicesLib.TypeScriptNs.AssertionLevel with scala.Double] = js.native
}

