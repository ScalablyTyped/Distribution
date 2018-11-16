package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LogicalOperation extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "LogicalOperation")
@js.native
object LogicalOperation extends js.Object {
  @js.native
  sealed trait AND
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.LogicalOperation
  
  @js.native
  sealed trait NONE
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.LogicalOperation
  
  @js.native
  sealed trait OR
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.LogicalOperation
  
  /* 1 */ val AND: AND with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 2 */ val OR: OR with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.LogicalOperation with scala.Double
  ] = js.native
}

