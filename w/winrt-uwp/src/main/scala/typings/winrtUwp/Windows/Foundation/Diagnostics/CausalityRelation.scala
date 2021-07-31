package typings.winrtUwp.Windows.Foundation.Diagnostics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CausalityRelation extends StObject
/** Tracks ways that synchronous work items may interact with asynchronous operations. */
@JSGlobal("Windows.Foundation.Diagnostics.CausalityRelation")
@js.native
object CausalityRelation extends StObject {
  
  /** Indicates that a synchronous work items has assigned a callback or continuation to be run by an asynchronous operation. */
  @js.native
  sealed trait assignDelegate
    extends StObject
       with CausalityRelation
  
  /** Indicates that a synchronous work item was canceled. */
  @js.native
  sealed trait cancel
    extends StObject
       with CausalityRelation
  
  /** Indicates that a synchronous work item has satisfied a choice asynchronous operation. */
  @js.native
  sealed trait choice
    extends StObject
       with CausalityRelation
  
  /** Indicates that a synchronous work item caused an error in an asynchronous operation. */
  @js.native
  sealed trait error
    extends StObject
       with CausalityRelation
  
  /** Indicates that a synchronous work item has satisfied part of a join asynchronous operation. */
  @js.native
  sealed trait join
    extends StObject
       with CausalityRelation
}
