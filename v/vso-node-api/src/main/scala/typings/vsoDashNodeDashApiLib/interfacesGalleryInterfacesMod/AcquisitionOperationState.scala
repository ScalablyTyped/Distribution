package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcquisitionOperationState extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "AcquisitionOperationState")
@js.native
object AcquisitionOperationState extends js.Object {
  /**
       * Allowed to use this AcquisitionOperation
       */
  @js.native
  sealed trait Allow
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.AcquisitionOperationState
  
  /**
       * Operation has already been completed and is no longer available
       */
  @js.native
  sealed trait Completed
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.AcquisitionOperationState
  
  /**
       * Not allowed to use this AcquisitionOperation
       */
  @js.native
  sealed trait Disallow
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.AcquisitionOperationState
  
  /* 1 */ val Allow: Allow with scala.Double = js.native
  /* 3 */ val Completed: Completed with scala.Double = js.native
  /* 0 */ val Disallow: Disallow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.AcquisitionOperationState with scala.Double
  ] = js.native
}

