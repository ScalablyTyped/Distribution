package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GetProcessExpandLevel extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "GetProcessExpandLevel")
@js.native
object GetProcessExpandLevel extends js.Object {
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.GetProcessExpandLevel
  
  @js.native
  sealed trait Projects
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.GetProcessExpandLevel
  
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val Projects: Projects with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.GetProcessExpandLevel with scala.Double
  ] = js.native
}

