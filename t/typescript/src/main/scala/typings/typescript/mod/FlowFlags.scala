package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FlowFlags extends js.Object

@JSImport("typescript", "FlowFlags")
@js.native
object FlowFlags extends js.Object {
  @js.native
  sealed trait ArrayMutation extends FlowFlags
  
  @js.native
  sealed trait Assignment extends FlowFlags
  
  @js.native
  sealed trait BranchLabel extends FlowFlags
  
  @js.native
  sealed trait Call extends FlowFlags
  
  @js.native
  sealed trait Condition extends FlowFlags
  
  @js.native
  sealed trait FalseCondition extends FlowFlags
  
  @js.native
  sealed trait Label extends FlowFlags
  
  @js.native
  sealed trait LoopLabel extends FlowFlags
  
  @js.native
  sealed trait ReduceLabel extends FlowFlags
  
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FlowFlags with Double] = js.native
  /* 256 */ @js.native
  object ArrayMutation extends TopLevel[ArrayMutation with Double]
  
  /* 16 */ @js.native
  object Assignment extends TopLevel[Assignment with Double]
  
  /* 4 */ @js.native
  object BranchLabel extends TopLevel[BranchLabel with Double]
  
  /* 512 */ @js.native
  object Call extends TopLevel[Call with Double]
  
  /* 96 */ @js.native
  object Condition extends TopLevel[Condition with Double]
  
  /* 64 */ @js.native
  object FalseCondition extends TopLevel[FalseCondition with Double]
  
  /* 12 */ @js.native
  object Label extends TopLevel[Label with Double]
  
  /* 8 */ @js.native
  object LoopLabel extends TopLevel[LoopLabel with Double]
  
  /* 1024 */ @js.native
  object ReduceLabel extends TopLevel[ReduceLabel with Double]
  
  /* 2048 */ @js.native
  object Referenced extends TopLevel[Referenced with Double]
  
  /* 4096 */ @js.native
  object Shared extends TopLevel[Shared with Double]
  
  /* 2 */ @js.native
  object Start extends TopLevel[Start with Double]
  
  /* 128 */ @js.native
  object SwitchClause extends TopLevel[SwitchClause with Double]
  
  /* 32 */ @js.native
  object TrueCondition extends TopLevel[TrueCondition with Double]
  
  /* 1 */ @js.native
  object Unreachable extends TopLevel[Unreachable with Double]
  
}

