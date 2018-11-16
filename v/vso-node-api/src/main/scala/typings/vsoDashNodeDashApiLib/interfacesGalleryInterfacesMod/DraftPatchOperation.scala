package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DraftPatchOperation extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "DraftPatchOperation")
@js.native
object DraftPatchOperation extends js.Object {
  @js.native
  sealed trait Cancel
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.DraftPatchOperation
  
  @js.native
  sealed trait Publish
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.DraftPatchOperation
  
  /* 2 */ val Cancel: Cancel with scala.Double = js.native
  /* 1 */ val Publish: Publish with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.DraftPatchOperation with scala.Double
  ] = js.native
}

