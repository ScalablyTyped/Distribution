package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProvisioningActionType extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "ProvisioningActionType")
@js.native
object ProvisioningActionType extends js.Object {
  @js.native
  sealed trait Import extends ProvisioningActionType
  
  @js.native
  sealed trait Validate extends ProvisioningActionType
  
  /* 0 */ val Import: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.ProvisioningActionType.Import with Double = js.native
  /* 1 */ val Validate: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.ProvisioningActionType.Validate with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProvisioningActionType with Double] = js.native
}

