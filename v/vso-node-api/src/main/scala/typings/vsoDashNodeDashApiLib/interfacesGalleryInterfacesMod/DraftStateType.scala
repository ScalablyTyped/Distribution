package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DraftStateType extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "DraftStateType")
@js.native
object DraftStateType extends js.Object {
  @js.native
  sealed trait Cancelled
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.DraftStateType
  
  @js.native
  sealed trait Error
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.DraftStateType
  
  @js.native
  sealed trait Published
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.DraftStateType
  
  @js.native
  sealed trait Unpublished
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.DraftStateType
  
  /* 3 */ val Cancelled: Cancelled with scala.Double = js.native
  /* 4 */ val Error: Error with scala.Double = js.native
  /* 2 */ val Published: Published with scala.Double = js.native
  /* 1 */ val Unpublished: Unpublished with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.DraftStateType with scala.Double
  ] = js.native
}

