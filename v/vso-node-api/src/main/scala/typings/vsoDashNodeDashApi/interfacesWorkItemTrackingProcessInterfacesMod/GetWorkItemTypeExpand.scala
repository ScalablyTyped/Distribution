package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GetWorkItemTypeExpand extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "GetWorkItemTypeExpand")
@js.native
object GetWorkItemTypeExpand extends js.Object {
  @js.native
  sealed trait Behaviors extends GetWorkItemTypeExpand
  
  @js.native
  sealed trait Layout extends GetWorkItemTypeExpand
  
  @js.native
  sealed trait None extends GetWorkItemTypeExpand
  
  @js.native
  sealed trait States extends GetWorkItemTypeExpand
  
  /* 2 */ val Behaviors: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod.GetWorkItemTypeExpand.Behaviors with Double = js.native
  /* 4 */ val Layout: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod.GetWorkItemTypeExpand.Layout with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod.GetWorkItemTypeExpand.None with Double = js.native
  /* 1 */ val States: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod.GetWorkItemTypeExpand.States with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GetWorkItemTypeExpand with Double] = js.native
}

