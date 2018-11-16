package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageType extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessDefinitionsInterfaces", "PageType")
@js.native
object PageType extends js.Object {
  @js.native
  sealed trait Attachments
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.PageType
  
  @js.native
  sealed trait Custom
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.PageType
  
  @js.native
  sealed trait History
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.PageType
  
  @js.native
  sealed trait Links
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.PageType
  
  /* 4 */ val Attachments: Attachments with scala.Double = js.native
  /* 1 */ val Custom: Custom with scala.Double = js.native
  /* 2 */ val History: History with scala.Double = js.native
  /* 3 */ val Links: Links with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.PageType with scala.Double
  ] = js.native
}

