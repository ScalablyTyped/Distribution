package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DraftStateType extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "DraftStateType")
@js.native
object DraftStateType extends js.Object {
  @js.native
  sealed trait Cancelled extends DraftStateType
  
  @js.native
  sealed trait Error extends DraftStateType
  
  @js.native
  sealed trait Published extends DraftStateType
  
  @js.native
  sealed trait Unpublished extends DraftStateType
  
  /* 3 */ val Cancelled: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.DraftStateType.Cancelled with Double = js.native
  /* 4 */ val Error: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.DraftStateType.Error with Double = js.native
  /* 2 */ val Published: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.DraftStateType.Published with Double = js.native
  /* 1 */ val Unpublished: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.DraftStateType.Unpublished with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DraftStateType with Double] = js.native
}

