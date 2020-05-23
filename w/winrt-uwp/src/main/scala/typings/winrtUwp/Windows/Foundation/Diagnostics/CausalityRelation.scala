package typings.winrtUwp.Windows.Foundation.Diagnostics

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
  
}

