package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.AcquisitionOperationType.Buy
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.AcquisitionOperationType.Get
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.AcquisitionOperationType.Install
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.AcquisitionOperationType.None
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.AcquisitionOperationType.PurchaseRequest
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.AcquisitionOperationType.Request
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.AcquisitionOperationType.Try
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AcquisitionOperationType with Double] = js.native
  /* 2 */ @js.native
  object Buy extends TopLevel[Buy with Double]
  
  /* 0 */ @js.native
  object Get extends TopLevel[Get with Double]
  
  /* 1 */ @js.native
  object Install extends TopLevel[Install with Double]
  
  /* 5 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 6 */ @js.native
  object PurchaseRequest extends TopLevel[PurchaseRequest with Double]
  
  /* 4 */ @js.native
  object Request extends TopLevel[Request with Double]
  
  /* 3 */ @js.native
  object Try extends TopLevel[Try with Double]
  
}

