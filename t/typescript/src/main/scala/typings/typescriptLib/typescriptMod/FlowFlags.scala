package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FlowFlags extends js.Object

@JSImport("typescript", "FlowFlags")
@js.native
object FlowFlags extends js.Object {
  @js.native
  sealed trait AfterFinally
    extends typescriptLib.typescriptMod.FlowFlags
  
  @js.native
  sealed trait ArrayMutation
    extends typescriptLib.typescriptMod.FlowFlags
  
  @js.native
  sealed trait Assignment
    extends typescriptLib.typescriptMod.FlowFlags
  
  @js.native
  sealed trait BranchLabel
    extends typescriptLib.typescriptMod.FlowFlags
  
  @js.native
  sealed trait Condition
    extends typescriptLib.typescriptMod.FlowFlags
  
  @js.native
  sealed trait FalseCondition
    extends typescriptLib.typescriptMod.FlowFlags
  
  @js.native
  sealed trait Label
    extends typescriptLib.typescriptMod.FlowFlags
  
  @js.native
  sealed trait LoopLabel
    extends typescriptLib.typescriptMod.FlowFlags
  
  @js.native
  sealed trait PreFinally
    extends typescriptLib.typescriptMod.FlowFlags
  
  @js.native
  sealed trait Referenced
    extends typescriptLib.typescriptMod.FlowFlags
  
  @js.native
  sealed trait Shared
    extends typescriptLib.typescriptMod.FlowFlags
  
  @js.native
  sealed trait Start
    extends typescriptLib.typescriptMod.FlowFlags
  
  @js.native
  sealed trait SwitchClause
    extends typescriptLib.typescriptMod.FlowFlags
  
  @js.native
  sealed trait TrueCondition
    extends typescriptLib.typescriptMod.FlowFlags
  
  @js.native
  sealed trait Unreachable
    extends typescriptLib.typescriptMod.FlowFlags
  
  /* 4096 */ val AfterFinally: AfterFinally with scala.Double = js.native
  /* 256 */ val ArrayMutation: ArrayMutation with scala.Double = js.native
  /* 16 */ val Assignment: Assignment with scala.Double = js.native
  /* 4 */ val BranchLabel: BranchLabel with scala.Double = js.native
  /* 96 */ val Condition: Condition with scala.Double = js.native
  /* 64 */ val FalseCondition: FalseCondition with scala.Double = js.native
  /* 12 */ val Label: Label with scala.Double = js.native
  /* 8 */ val LoopLabel: LoopLabel with scala.Double = js.native
  /* 2048 */ val PreFinally: PreFinally with scala.Double = js.native
  /* 512 */ val Referenced: Referenced with scala.Double = js.native
  /* 1024 */ val Shared: Shared with scala.Double = js.native
  /* 2 */ val Start: Start with scala.Double = js.native
  /* 128 */ val SwitchClause: SwitchClause with scala.Double = js.native
  /* 32 */ val TrueCondition: TrueCondition with scala.Double = js.native
  /* 1 */ val Unreachable: Unreachable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptLib.typescriptMod.FlowFlags with scala.Double] = js.native
}

