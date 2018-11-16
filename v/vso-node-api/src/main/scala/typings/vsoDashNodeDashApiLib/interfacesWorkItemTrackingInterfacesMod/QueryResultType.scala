package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

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
  sealed trait WorkItem
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryResultType
  
  /**
       * A list of work item links (for OneHop and Tree queries).
       */
  @js.native
  sealed trait WorkItemLink
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryResultType
  
  /* 1 */ val WorkItem: WorkItem with scala.Double = js.native
  /* 2 */ val WorkItemLink: WorkItemLink with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryResultType with scala.Double
  ] = js.native
}

