package typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProvisioningActionType extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "ProvisioningActionType")
@js.native
object ProvisioningActionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProvisioningActionType & Double] = js.native
  
  @js.native
  sealed trait Import
    extends StObject
       with ProvisioningActionType
  /* 0 */ val Import: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.ProvisioningActionType.Import & Double = js.native
  
  @js.native
  sealed trait Validate
    extends StObject
       with ProvisioningActionType
  /* 1 */ val Validate: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.ProvisioningActionType.Validate & Double = js.native
}
