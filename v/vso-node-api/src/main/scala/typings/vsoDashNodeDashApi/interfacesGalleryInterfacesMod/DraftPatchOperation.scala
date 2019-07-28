package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DraftPatchOperation extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "DraftPatchOperation")
@js.native
object DraftPatchOperation extends js.Object {
  @js.native
  sealed trait Cancel extends DraftPatchOperation
  
  @js.native
  sealed trait Publish extends DraftPatchOperation
  
  /* 2 */ val Cancel: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.DraftPatchOperation.Cancel with Double = js.native
  /* 1 */ val Publish: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.DraftPatchOperation.Publish with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DraftPatchOperation with Double] = js.native
}

