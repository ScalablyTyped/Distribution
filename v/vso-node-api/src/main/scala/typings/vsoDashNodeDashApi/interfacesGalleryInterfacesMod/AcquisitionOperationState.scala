package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

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
  sealed trait Allow extends AcquisitionOperationState
  
  /**
    * Operation has already been completed and is no longer available
    */
  @js.native
  sealed trait Completed extends AcquisitionOperationState
  
  /**
    * Not allowed to use this AcquisitionOperation
    */
  @js.native
  sealed trait Disallow extends AcquisitionOperationState
  
  /* 1 */ val Allow: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.AcquisitionOperationState.Allow with Double = js.native
  /* 3 */ val Completed: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.AcquisitionOperationState.Completed with Double = js.native
  /* 0 */ val Disallow: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.AcquisitionOperationState.Disallow with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AcquisitionOperationState with Double] = js.native
}

