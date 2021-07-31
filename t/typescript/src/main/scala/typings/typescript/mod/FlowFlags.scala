package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FlowFlags extends StObject
@JSImport("typescript", "FlowFlags")
@js.native
object FlowFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FlowFlags & Double] = js.native
  
  @js.native
  sealed trait ArrayMutation
    extends StObject
       with FlowFlags
  /* 256 */ val ArrayMutation: typings.typescript.mod.FlowFlags.ArrayMutation & Double = js.native
  
  @js.native
  sealed trait Assignment
    extends StObject
       with FlowFlags
  /* 16 */ val Assignment: typings.typescript.mod.FlowFlags.Assignment & Double = js.native
  
  @js.native
  sealed trait BranchLabel
    extends StObject
       with FlowFlags
  /* 4 */ val BranchLabel: typings.typescript.mod.FlowFlags.BranchLabel & Double = js.native
  
  @js.native
  sealed trait Call
    extends StObject
       with FlowFlags
  /* 512 */ val Call: typings.typescript.mod.FlowFlags.Call & Double = js.native
  
  @js.native
  sealed trait Condition
    extends StObject
       with FlowFlags
  /* 96 */ val Condition: typings.typescript.mod.FlowFlags.Condition & Double = js.native
  
  @js.native
  sealed trait FalseCondition
    extends StObject
       with FlowFlags
  /* 64 */ val FalseCondition: typings.typescript.mod.FlowFlags.FalseCondition & Double = js.native
  
  @js.native
  sealed trait Label
    extends StObject
       with FlowFlags
  /* 12 */ val Label: typings.typescript.mod.FlowFlags.Label & Double = js.native
  
  @js.native
  sealed trait LoopLabel
    extends StObject
       with FlowFlags
  /* 8 */ val LoopLabel: typings.typescript.mod.FlowFlags.LoopLabel & Double = js.native
  
  @js.native
  sealed trait ReduceLabel
    extends StObject
       with FlowFlags
  /* 1024 */ val ReduceLabel: typings.typescript.mod.FlowFlags.ReduceLabel & Double = js.native
  
  @js.native
  sealed trait Referenced
    extends StObject
       with FlowFlags
  /* 2048 */ val Referenced: typings.typescript.mod.FlowFlags.Referenced & Double = js.native
  
  @js.native
  sealed trait Shared
    extends StObject
       with FlowFlags
  /* 4096 */ val Shared: typings.typescript.mod.FlowFlags.Shared & Double = js.native
  
  @js.native
  sealed trait Start
    extends StObject
       with FlowFlags
  /* 2 */ val Start: typings.typescript.mod.FlowFlags.Start & Double = js.native
  
  @js.native
  sealed trait SwitchClause
    extends StObject
       with FlowFlags
  /* 128 */ val SwitchClause: typings.typescript.mod.FlowFlags.SwitchClause & Double = js.native
  
  @js.native
  sealed trait TrueCondition
    extends StObject
       with FlowFlags
  /* 32 */ val TrueCondition: typings.typescript.mod.FlowFlags.TrueCondition & Double = js.native
  
  @js.native
  sealed trait Unreachable
    extends StObject
       with FlowFlags
  /* 1 */ val Unreachable: typings.typescript.mod.FlowFlags.Unreachable & Double = js.native
}
