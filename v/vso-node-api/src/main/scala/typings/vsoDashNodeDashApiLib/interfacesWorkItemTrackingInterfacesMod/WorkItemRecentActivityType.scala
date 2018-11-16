package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorkItemRecentActivityType extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "WorkItemRecentActivityType")
@js.native
object WorkItemRecentActivityType extends js.Object {
  @js.native
  sealed trait Deleted
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemRecentActivityType
  
  @js.native
  sealed trait Edited
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemRecentActivityType
  
  @js.native
  sealed trait Restored
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemRecentActivityType
  
  @js.native
  sealed trait Visited
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemRecentActivityType
  
  /* 2 */ val Deleted: Deleted with scala.Double = js.native
  /* 1 */ val Edited: Edited with scala.Double = js.native
  /* 3 */ val Restored: Restored with scala.Double = js.native
  /* 0 */ val Visited: Visited with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemRecentActivityType with scala.Double
  ] = js.native
}

