package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorkItemErrorPolicy extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "WorkItemErrorPolicy")
@js.native
object WorkItemErrorPolicy extends js.Object {
  @js.native
  sealed trait Fail
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemErrorPolicy
  
  @js.native
  sealed trait Omit
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemErrorPolicy
  
  /* 1 */ val Fail: Fail with scala.Double = js.native
  /* 2 */ val Omit: Omit with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemErrorPolicy with scala.Double
  ] = js.native
}

