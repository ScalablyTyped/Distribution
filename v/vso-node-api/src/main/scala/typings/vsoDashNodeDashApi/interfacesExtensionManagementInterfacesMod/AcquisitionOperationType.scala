package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcquisitionOperationType extends js.Object

@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "AcquisitionOperationType")
@js.native
object AcquisitionOperationType extends js.Object {
  /**
    * Buy licenses for this extension and install into the host provided
    */
  @js.native
  sealed trait Buy extends AcquisitionOperationType
  
  /**
    * Not yet used
    */
  @js.native
  sealed trait Get extends AcquisitionOperationType
  
  /**
    * Install this extension into the host provided
    */
  @js.native
  sealed trait Install extends AcquisitionOperationType
  
  /**
    * No action found
    */
  @js.native
  sealed trait None extends AcquisitionOperationType
  
  /**
    * Request admins for purchasing extension
    */
  @js.native
  sealed trait PurchaseRequest extends AcquisitionOperationType
  
  /**
    * Request this extension for installation
    */
  @js.native
  sealed trait Request extends AcquisitionOperationType
  
  /**
    * Try this extension
    */
  @js.native
  sealed trait Try extends AcquisitionOperationType
  
  /* 2 */ val Buy: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.AcquisitionOperationType.Buy with Double = js.native
  /* 0 */ val Get: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.AcquisitionOperationType.Get with Double = js.native
  /* 1 */ val Install: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.AcquisitionOperationType.Install with Double = js.native
  /* 5 */ val None: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.AcquisitionOperationType.None with Double = js.native
  /* 6 */ val PurchaseRequest: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.AcquisitionOperationType.PurchaseRequest with Double = js.native
  /* 4 */ val Request: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.AcquisitionOperationType.Request with Double = js.native
  /* 3 */ val Try: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.AcquisitionOperationType.Try with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AcquisitionOperationType with Double] = js.native
}

