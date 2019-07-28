package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LinkChangeType extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "LinkChangeType")
@js.native
object LinkChangeType extends js.Object {
  @js.native
  sealed trait Create extends LinkChangeType
  
  @js.native
  sealed trait Remove extends LinkChangeType
  
  /* 0 */ val Create: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.LinkChangeType.Create with Double = js.native
  /* 1 */ val Remove: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.LinkChangeType.Remove with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LinkChangeType with Double] = js.native
}

