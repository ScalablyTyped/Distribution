package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GetBehaviorsExpand extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "GetBehaviorsExpand")
@js.native
object GetBehaviorsExpand extends js.Object {
  @js.native
  sealed trait Fields
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.GetBehaviorsExpand
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.GetBehaviorsExpand
  
  /* 1 */ val Fields: Fields with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.GetBehaviorsExpand with scala.Double
  ] = js.native
}

