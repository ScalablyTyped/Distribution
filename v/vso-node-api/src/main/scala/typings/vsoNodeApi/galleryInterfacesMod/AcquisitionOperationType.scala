package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AcquisitionOperationType extends js.Object
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "AcquisitionOperationType")
@js.native
object AcquisitionOperationType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AcquisitionOperationType with Double] = js.native
  
  /**
    * Buy licenses for this extension and install into the host provided
    */
  @js.native
  sealed trait Buy extends AcquisitionOperationType
  /* 2 */ @js.native
  object Buy extends TopLevel[Buy with Double]
  
  /**
    * Not yet used
    */
  @js.native
  sealed trait Get extends AcquisitionOperationType
  /* 0 */ @js.native
  object Get extends TopLevel[Get with Double]
  
  /**
    * Install this extension into the host provided
    */
  @js.native
  sealed trait Install extends AcquisitionOperationType
  /* 1 */ @js.native
  object Install extends TopLevel[Install with Double]
  
  /**
    * No action found
    */
  @js.native
  sealed trait None extends AcquisitionOperationType
  /* 5 */ @js.native
  object None extends TopLevel[None with Double]
  
  /**
    * Request admins for purchasing extension
    */
  @js.native
  sealed trait PurchaseRequest extends AcquisitionOperationType
  /* 6 */ @js.native
  object PurchaseRequest extends TopLevel[PurchaseRequest with Double]
  
  /**
    * Request this extension for installation
    */
  @js.native
  sealed trait Request extends AcquisitionOperationType
  /* 4 */ @js.native
  object Request extends TopLevel[Request with Double]
  
  /**
    * Try this extension
    */
  @js.native
  sealed trait Try extends AcquisitionOperationType
  /* 3 */ @js.native
  object Try extends TopLevel[Try with Double]
}
