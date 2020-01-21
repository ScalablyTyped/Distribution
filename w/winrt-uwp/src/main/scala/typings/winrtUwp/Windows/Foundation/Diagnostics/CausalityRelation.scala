package typings.winrtUwp.Windows.Foundation.Diagnostics

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CausalityRelation extends js.Object

/** Tracks ways that synchronous work items may interact with asynchronous operations. */
@JSGlobal("Windows.Foundation.Diagnostics.CausalityRelation")
@js.native
object CausalityRelation extends js.Object {
  /** Indicates that a synchronous work items has assigned a callback or continuation to be run by an asynchronous operation. */
  @js.native
  sealed trait assignDelegate extends CausalityRelation
  
  /** Indicates that a synchronous work item was canceled. */
  @js.native
  sealed trait cancel extends CausalityRelation
  
  /** Indicates that a synchronous work item has satisfied a choice asynchronous operation. */
  @js.native
  sealed trait choice extends CausalityRelation
  
  /** Indicates that a synchronous work item caused an error in an asynchronous operation. */
  @js.native
  sealed trait error extends CausalityRelation
  
  /** Indicates that a synchronous work item has satisfied part of a join asynchronous operation. */
  @js.native
  sealed trait join extends CausalityRelation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CausalityRelation with Double] = js.native
  /* 0 */ @js.native
  object assignDelegate extends TopLevel[assignDelegate with Double]
  
  /* 3 */ @js.native
  object cancel extends TopLevel[cancel with Double]
  
  /* 2 */ @js.native
  object choice extends TopLevel[choice with Double]
  
  /* 4 */ @js.native
  object error extends TopLevel[error with Double]
  
  /* 1 */ @js.native
  object join extends TopLevel[join with Double]
  
}

