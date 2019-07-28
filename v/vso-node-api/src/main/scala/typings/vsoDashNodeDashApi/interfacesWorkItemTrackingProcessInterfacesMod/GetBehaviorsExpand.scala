package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GetBehaviorsExpand extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "GetBehaviorsExpand")
@js.native
object GetBehaviorsExpand extends js.Object {
  @js.native
  sealed trait Fields extends GetBehaviorsExpand
  
  @js.native
  sealed trait None extends GetBehaviorsExpand
  
  /* 1 */ val Fields: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod.GetBehaviorsExpand.Fields with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod.GetBehaviorsExpand.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GetBehaviorsExpand with Double] = js.native
}

