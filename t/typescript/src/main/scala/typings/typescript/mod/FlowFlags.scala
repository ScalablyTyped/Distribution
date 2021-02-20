package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FlowFlags extends StObject
@JSImport("typescript", "FlowFlags")
@js.native
object FlowFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FlowFlags with Double] = js.native
  
  @js.native
  sealed trait ArrayMutation extends FlowFlags
  /* 256 */ val ArrayMutation: typings.typescript.mod.FlowFlags.ArrayMutation with Double = js.native
  
  @js.native
  sealed trait Assignment extends FlowFlags
  /* 16 */ val Assignment: typings.typescript.mod.FlowFlags.Assignment with Double = js.native
  
  @js.native
  sealed trait BranchLabel extends FlowFlags
  /* 4 */ val BranchLabel: typings.typescript.mod.FlowFlags.BranchLabel with Double = js.native
  
  @js.native
  sealed trait Call extends FlowFlags
  /* 512 */ val Call: typings.typescript.mod.FlowFlags.Call with Double = js.native
  
  @js.native
  sealed trait Condition extends FlowFlags
  /* 96 */ val Condition: typings.typescript.mod.FlowFlags.Condition with Double = js.native
  
  @js.native
  sealed trait FalseCondition extends FlowFlags
  /* 64 */ val FalseCondition: typings.typescript.mod.FlowFlags.FalseCondition with Double = js.native
  
  @js.native
  sealed trait Label extends FlowFlags
  /* 12 */ val Label: typings.typescript.mod.FlowFlags.Label with Double = js.native
  
  @js.native
  sealed trait LoopLabel extends FlowFlags
  /* 8 */ val LoopLabel: typings.typescript.mod.FlowFlags.LoopLabel with Double = js.native
  
  @js.native
  sealed trait ReduceLabel extends FlowFlags
  /* 1024 */ val ReduceLabel: typings.typescript.mod.FlowFlags.ReduceLabel with Double = js.native
  
  @js.native
  sealed trait Referenced extends FlowFlags
  /* 2048 */ val Referenced: typings.typescript.mod.FlowFlags.Referenced with Double = js.native
  
  @js.native
  sealed trait Shared extends FlowFlags
  /* 4096 */ val Shared: typings.typescript.mod.FlowFlags.Shared with Double = js.native
  
  @js.native
  sealed trait Start extends FlowFlags
  /* 2 */ val Start: typings.typescript.mod.FlowFlags.Start with Double = js.native
  
  @js.native
  sealed trait SwitchClause extends FlowFlags
  /* 128 */ val SwitchClause: typings.typescript.mod.FlowFlags.SwitchClause with Double = js.native
  
  @js.native
  sealed trait TrueCondition extends FlowFlags
  /* 32 */ val TrueCondition: typings.typescript.mod.FlowFlags.TrueCondition with Double = js.native
  
  @js.native
  sealed trait Unreachable extends FlowFlags
  /* 1 */ val Unreachable: typings.typescript.mod.FlowFlags.Unreachable with Double = js.native
}
