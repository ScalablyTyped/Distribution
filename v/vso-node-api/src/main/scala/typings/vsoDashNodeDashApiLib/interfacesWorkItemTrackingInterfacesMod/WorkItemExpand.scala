package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorkItemExpand extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "WorkItemExpand")
@js.native
object WorkItemExpand extends js.Object {
  @js.native
  sealed trait All
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand
  
  @js.native
  sealed trait Fields
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand
  
  @js.native
  sealed trait Links
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand
  
  @js.native
  sealed trait Relations
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand
  
  /* 4 */ val All: All with scala.Double = js.native
  /* 2 */ val Fields: Fields with scala.Double = js.native
  /* 3 */ val Links: Links with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val Relations: Relations with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand with scala.Double
  ] = js.native
}

