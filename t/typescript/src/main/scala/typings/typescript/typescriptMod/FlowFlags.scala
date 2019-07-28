package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FlowFlags extends js.Object

@JSImport("typescript", "FlowFlags")
@js.native
object FlowFlags extends js.Object {
  @js.native
  sealed trait AfterFinally extends FlowFlags
  
  @js.native
  sealed trait ArrayMutation extends FlowFlags
  
  @js.native
  sealed trait Assignment extends FlowFlags
  
  @js.native
  sealed trait BranchLabel extends FlowFlags
  
  @js.native
  sealed trait Condition extends FlowFlags
  
  @js.native
  sealed trait FalseCondition extends FlowFlags
  
  @js.native
  sealed trait Label extends FlowFlags
  
  @js.native
  sealed trait LoopLabel extends FlowFlags
  
  @js.native
  sealed trait PreFinally extends FlowFlags
  
  @js.native
  sealed trait Referenced extends FlowFlags
  
  @js.native
  sealed trait Shared extends FlowFlags
  
  @js.native
  sealed trait Start extends FlowFlags
  
  @js.native
  sealed trait SwitchClause extends FlowFlags
  
  @js.native
  sealed trait TrueCondition extends FlowFlags
  
  @js.native
  sealed trait Unreachable extends FlowFlags
  
  /* 4096 */ val AfterFinally: typings.typescript.typescriptMod.FlowFlags.AfterFinally with Double = js.native
  /* 256 */ val ArrayMutation: typings.typescript.typescriptMod.FlowFlags.ArrayMutation with Double = js.native
  /* 16 */ val Assignment: typings.typescript.typescriptMod.FlowFlags.Assignment with Double = js.native
  /* 4 */ val BranchLabel: typings.typescript.typescriptMod.FlowFlags.BranchLabel with Double = js.native
  /* 96 */ val Condition: typings.typescript.typescriptMod.FlowFlags.Condition with Double = js.native
  /* 64 */ val FalseCondition: typings.typescript.typescriptMod.FlowFlags.FalseCondition with Double = js.native
  /* 12 */ val Label: typings.typescript.typescriptMod.FlowFlags.Label with Double = js.native
  /* 8 */ val LoopLabel: typings.typescript.typescriptMod.FlowFlags.LoopLabel with Double = js.native
  /* 2048 */ val PreFinally: typings.typescript.typescriptMod.FlowFlags.PreFinally with Double = js.native
  /* 512 */ val Referenced: typings.typescript.typescriptMod.FlowFlags.Referenced with Double = js.native
  /* 1024 */ val Shared: typings.typescript.typescriptMod.FlowFlags.Shared with Double = js.native
  /* 2 */ val Start: typings.typescript.typescriptMod.FlowFlags.Start with Double = js.native
  /* 128 */ val SwitchClause: typings.typescript.typescriptMod.FlowFlags.SwitchClause with Double = js.native
  /* 32 */ val TrueCondition: typings.typescript.typescriptMod.FlowFlags.TrueCondition with Double = js.native
  /* 1 */ val Unreachable: typings.typescript.typescriptMod.FlowFlags.Unreachable with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FlowFlags with Double] = js.native
}

