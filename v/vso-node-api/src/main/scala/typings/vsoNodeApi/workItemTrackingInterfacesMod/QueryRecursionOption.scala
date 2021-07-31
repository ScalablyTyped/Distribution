package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryRecursionOption extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "QueryRecursionOption")
@js.native
object QueryRecursionOption extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryRecursionOption & Double] = js.native
  
  /**
    * Returns work items that satisfy the target criteria, even if no work item satisfies the source and link criteria.
    */
  @js.native
  sealed trait ChildFirst
    extends StObject
       with QueryRecursionOption
  /* 1 */ val ChildFirst: typings.vsoNodeApi.workItemTrackingInterfacesMod.QueryRecursionOption.ChildFirst & Double = js.native
  
  /**
    * Returns work items that satisfy the source, even if no linked work item satisfies the target and link criteria.
    */
  @js.native
  sealed trait ParentFirst
    extends StObject
       with QueryRecursionOption
  /* 0 */ val ParentFirst: typings.vsoNodeApi.workItemTrackingInterfacesMod.QueryRecursionOption.ParentFirst & Double = js.native
}
