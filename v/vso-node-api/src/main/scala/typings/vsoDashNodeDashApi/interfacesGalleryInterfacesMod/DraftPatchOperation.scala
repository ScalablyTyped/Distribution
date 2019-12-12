package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.DraftPatchOperation.Cancel
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.DraftPatchOperation.Publish
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DraftPatchOperation with Double] = js.native
  /* 2 */ @js.native
  object Cancel extends TopLevel[Cancel with Double]
  
  /* 1 */ @js.native
  object Publish extends TopLevel[Publish with Double]
  
}

