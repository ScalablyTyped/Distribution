package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueryResultType extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "QueryResultType")
@js.native
object QueryResultType extends js.Object {
  /**
    * A list of work items (for flat queries).
    */
  @js.native
  sealed trait WorkItem extends QueryResultType
  
  /**
    * A list of work item links (for OneHop and Tree queries).
    */
  @js.native
  sealed trait WorkItemLink extends QueryResultType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryResultType with Double] = js.native
  /* 1 */ @js.native
  object WorkItem
    extends TopLevel[
          typings.vsoNodeApi.workItemTrackingInterfacesMod.QueryResultType.WorkItem with Double
        ]
  
  /* 2 */ @js.native
  object WorkItemLink
    extends TopLevel[
          typings.vsoNodeApi.workItemTrackingInterfacesMod.QueryResultType.WorkItemLink with Double
        ]
  
}

