package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorkItemErrorPolicy extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "WorkItemErrorPolicy")
@js.native
object WorkItemErrorPolicy extends js.Object {
  @js.native
  sealed trait Fail extends WorkItemErrorPolicy
  
  @js.native
  sealed trait Omit extends WorkItemErrorPolicy
  
  /* 1 */ val Fail: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.WorkItemErrorPolicy.Fail with Double = js.native
  /* 2 */ val Omit: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.WorkItemErrorPolicy.Omit with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkItemErrorPolicy with Double] = js.native
}

