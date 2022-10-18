package typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AcquisitionOperationState extends StObject
@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "AcquisitionOperationState")
@js.native
object AcquisitionOperationState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AcquisitionOperationState & Double] = js.native
  
  /**
    * Allowed to use this AcquisitionOperation
    */
  @js.native
  sealed trait Allow
    extends StObject
       with AcquisitionOperationState
  /* 1 */ val Allow: typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod.AcquisitionOperationState.Allow & Double = js.native
  
  /**
    * Operation has already been completed and is no longer available
    */
  @js.native
  sealed trait Completed
    extends StObject
       with AcquisitionOperationState
  /* 3 */ val Completed: typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod.AcquisitionOperationState.Completed & Double = js.native
  
  /**
    * Not allowed to use this AcquisitionOperation
    */
  @js.native
  sealed trait Disallow
    extends StObject
       with AcquisitionOperationState
  /* 0 */ val Disallow: typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod.AcquisitionOperationState.Disallow & Double = js.native
}
