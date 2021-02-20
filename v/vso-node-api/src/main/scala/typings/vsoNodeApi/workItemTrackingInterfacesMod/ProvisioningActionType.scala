package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProvisioningActionType extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "ProvisioningActionType")
@js.native
object ProvisioningActionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProvisioningActionType with Double] = js.native
  
  @js.native
  sealed trait Import extends ProvisioningActionType
  /* 0 */ val Import: typings.vsoNodeApi.workItemTrackingInterfacesMod.ProvisioningActionType.Import with Double = js.native
  
  @js.native
  sealed trait Validate extends ProvisioningActionType
  /* 1 */ val Validate: typings.vsoNodeApi.workItemTrackingInterfacesMod.ProvisioningActionType.Validate with Double = js.native
}
