package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorkItemExpand extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "WorkItemExpand")
@js.native
object WorkItemExpand extends js.Object {
  @js.native
  sealed trait All extends WorkItemExpand
  
  @js.native
  sealed trait Fields extends WorkItemExpand
  
  @js.native
  sealed trait Links extends WorkItemExpand
  
  @js.native
  sealed trait None extends WorkItemExpand
  
  @js.native
  sealed trait Relations extends WorkItemExpand
  
  /* 4 */ val All: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand.All with Double = js.native
  /* 2 */ val Fields: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand.Fields with Double = js.native
  /* 3 */ val Links: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand.Links with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand.None with Double = js.native
  /* 1 */ val Relations: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand.Relations with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkItemExpand with Double] = js.native
}

