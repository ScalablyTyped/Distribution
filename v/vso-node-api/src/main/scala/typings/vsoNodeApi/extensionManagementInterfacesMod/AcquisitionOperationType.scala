package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AcquisitionOperationType extends StObject
@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "AcquisitionOperationType")
@js.native
object AcquisitionOperationType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AcquisitionOperationType with Double] = js.native
  
  /**
    * Buy licenses for this extension and install into the host provided
    */
  @js.native
  sealed trait Buy extends AcquisitionOperationType
  /* 2 */ val Buy: typings.vsoNodeApi.extensionManagementInterfacesMod.AcquisitionOperationType.Buy with Double = js.native
  
  /**
    * Not yet used
    */
  @js.native
  sealed trait Get extends AcquisitionOperationType
  /* 0 */ val Get: typings.vsoNodeApi.extensionManagementInterfacesMod.AcquisitionOperationType.Get with Double = js.native
  
  /**
    * Install this extension into the host provided
    */
  @js.native
  sealed trait Install extends AcquisitionOperationType
  /* 1 */ val Install: typings.vsoNodeApi.extensionManagementInterfacesMod.AcquisitionOperationType.Install with Double = js.native
  
  /**
    * No action found
    */
  @js.native
  sealed trait None extends AcquisitionOperationType
  /* 5 */ val None: typings.vsoNodeApi.extensionManagementInterfacesMod.AcquisitionOperationType.None with Double = js.native
  
  /**
    * Request admins for purchasing extension
    */
  @js.native
  sealed trait PurchaseRequest extends AcquisitionOperationType
  /* 6 */ val PurchaseRequest: typings.vsoNodeApi.extensionManagementInterfacesMod.AcquisitionOperationType.PurchaseRequest with Double = js.native
  
  /**
    * Request this extension for installation
    */
  @js.native
  sealed trait Request extends AcquisitionOperationType
  /* 4 */ val Request: typings.vsoNodeApi.extensionManagementInterfacesMod.AcquisitionOperationType.Request with Double = js.native
  
  /**
    * Try this extension
    */
  @js.native
  sealed trait Try extends AcquisitionOperationType
  /* 3 */ val Try: typings.vsoNodeApi.extensionManagementInterfacesMod.AcquisitionOperationType.Try with Double = js.native
}
