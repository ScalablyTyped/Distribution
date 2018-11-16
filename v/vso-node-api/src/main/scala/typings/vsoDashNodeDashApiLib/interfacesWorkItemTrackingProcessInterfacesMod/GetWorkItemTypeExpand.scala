package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GetWorkItemTypeExpand extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "GetWorkItemTypeExpand")
@js.native
object GetWorkItemTypeExpand extends js.Object {
  @js.native
  sealed trait Behaviors
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.GetWorkItemTypeExpand
  
  @js.native
  sealed trait Layout
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.GetWorkItemTypeExpand
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.GetWorkItemTypeExpand
  
  @js.native
  sealed trait States
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.GetWorkItemTypeExpand
  
  /* 2 */ val Behaviors: Behaviors with scala.Double = js.native
  /* 4 */ val Layout: Layout with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val States: States with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.GetWorkItemTypeExpand with scala.Double
  ] = js.native
}

