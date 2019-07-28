package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorkItemRecentActivityType extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "WorkItemRecentActivityType")
@js.native
object WorkItemRecentActivityType extends js.Object {
  @js.native
  sealed trait Deleted extends WorkItemRecentActivityType
  
  @js.native
  sealed trait Edited extends WorkItemRecentActivityType
  
  @js.native
  sealed trait Restored extends WorkItemRecentActivityType
  
  @js.native
  sealed trait Visited extends WorkItemRecentActivityType
  
  /* 2 */ val Deleted: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.WorkItemRecentActivityType.Deleted with Double = js.native
  /* 1 */ val Edited: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.WorkItemRecentActivityType.Edited with Double = js.native
  /* 3 */ val Restored: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.WorkItemRecentActivityType.Restored with Double = js.native
  /* 0 */ val Visited: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.WorkItemRecentActivityType.Visited with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkItemRecentActivityType with Double] = js.native
}

