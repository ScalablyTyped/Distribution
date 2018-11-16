package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageType extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "PageType")
@js.native
object PageType extends js.Object {
  @js.native
  sealed trait Attachments
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.PageType
  
  @js.native
  sealed trait Custom
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.PageType
  
  @js.native
  sealed trait History
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.PageType
  
  @js.native
  sealed trait Links
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.PageType
  
  /* 4 */ val Attachments: Attachments with scala.Double = js.native
  /* 1 */ val Custom: Custom with scala.Double = js.native
  /* 2 */ val History: History with scala.Double = js.native
  /* 3 */ val Links: Links with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.PageType with scala.Double
  ] = js.native
}

