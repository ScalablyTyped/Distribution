package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProvisioningActionType extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "ProvisioningActionType")
@js.native
object ProvisioningActionType extends js.Object {
  @js.native
  sealed trait Import
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ProvisioningActionType
  
  @js.native
  sealed trait Validate
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ProvisioningActionType
  
  /* 0 */ val Import: Import with scala.Double = js.native
  /* 1 */ val Validate: Validate with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ProvisioningActionType with scala.Double
  ] = js.native
}

