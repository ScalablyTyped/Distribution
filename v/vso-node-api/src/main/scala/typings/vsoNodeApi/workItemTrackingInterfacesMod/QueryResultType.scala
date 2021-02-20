package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryResultType extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "QueryResultType")
@js.native
object QueryResultType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryResultType with Double] = js.native
  
  /**
    * A list of work items (for flat queries).
    */
  @js.native
  sealed trait WorkItem extends QueryResultType
  /* 1 */ val WorkItem: typings.vsoNodeApi.workItemTrackingInterfacesMod.QueryResultType.WorkItem with Double = js.native
  
  /**
    * A list of work item links (for OneHop and Tree queries).
    */
  @js.native
  sealed trait WorkItemLink extends QueryResultType
  /* 2 */ val WorkItemLink: typings.vsoNodeApi.workItemTrackingInterfacesMod.QueryResultType.WorkItemLink with Double = js.native
}
