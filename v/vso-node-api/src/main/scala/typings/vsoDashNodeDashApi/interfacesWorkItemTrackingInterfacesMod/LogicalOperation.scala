package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LogicalOperation extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "LogicalOperation")
@js.native
object LogicalOperation extends js.Object {
  @js.native
  sealed trait AND extends LogicalOperation
  
  @js.native
  sealed trait NONE extends LogicalOperation
  
  @js.native
  sealed trait OR extends LogicalOperation
  
  /* 1 */ val AND: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.LogicalOperation.AND with Double = js.native
  /* 0 */ val NONE: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.LogicalOperation.NONE with Double = js.native
  /* 2 */ val OR: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.LogicalOperation.OR with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogicalOperation with Double] = js.native
}

