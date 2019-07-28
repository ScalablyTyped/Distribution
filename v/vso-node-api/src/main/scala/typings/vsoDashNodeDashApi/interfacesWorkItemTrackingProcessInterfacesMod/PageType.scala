package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageType extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "PageType")
@js.native
object PageType extends js.Object {
  @js.native
  sealed trait Attachments extends PageType
  
  @js.native
  sealed trait Custom extends PageType
  
  @js.native
  sealed trait History extends PageType
  
  @js.native
  sealed trait Links extends PageType
  
  /* 4 */ val Attachments: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod.PageType.Attachments with Double = js.native
  /* 1 */ val Custom: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod.PageType.Custom with Double = js.native
  /* 2 */ val History: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod.PageType.History with Double = js.native
  /* 3 */ val Links: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod.PageType.Links with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PageType with Double] = js.native
}

