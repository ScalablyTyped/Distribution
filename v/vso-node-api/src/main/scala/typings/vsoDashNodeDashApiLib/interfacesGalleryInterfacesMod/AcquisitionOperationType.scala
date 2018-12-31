package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcquisitionOperationType extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "AcquisitionOperationType")
@js.native
object AcquisitionOperationType extends js.Object {
  /**
    * Buy licenses for this extension and install into the host provided
    */
  @js.native
  sealed trait Buy
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.AcquisitionOperationType
  
  /**
    * Not yet used
    */
  @js.native
  sealed trait Get
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.AcquisitionOperationType
  
  /**
    * Install this extension into the host provided
    */
  @js.native
  sealed trait Install
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.AcquisitionOperationType
  
  /**
    * No action found
    */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.AcquisitionOperationType
  
  /**
    * Request admins for purchasing extension
    */
  @js.native
  sealed trait PurchaseRequest
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.AcquisitionOperationType
  
  /**
    * Request this extension for installation
    */
  @js.native
  sealed trait Request
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.AcquisitionOperationType
  
  /**
    * Try this extension
    */
  @js.native
  sealed trait Try
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.AcquisitionOperationType
  
  /* 2 */ val Buy: Buy with scala.Double = js.native
  /* 0 */ val Get: Get with scala.Double = js.native
  /* 1 */ val Install: Install with scala.Double = js.native
  /* 5 */ val None: None with scala.Double = js.native
  /* 6 */ val PurchaseRequest: PurchaseRequest with scala.Double = js.native
  /* 4 */ val Request: Request with scala.Double = js.native
  /* 3 */ val Try: Try with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.AcquisitionOperationType with scala.Double
  ] = js.native
}

