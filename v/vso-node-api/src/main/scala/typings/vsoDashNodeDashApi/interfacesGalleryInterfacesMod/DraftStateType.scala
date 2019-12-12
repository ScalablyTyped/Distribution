package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.DraftStateType.Cancelled
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.DraftStateType.Error
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.DraftStateType.Published
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.DraftStateType.Unpublished
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DraftStateType with Double] = js.native
  /* 3 */ @js.native
  object Cancelled extends TopLevel[Cancelled with Double]
  
  /* 4 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 2 */ @js.native
  object Published extends TopLevel[Published with Double]
  
  /* 1 */ @js.native
  object Unpublished extends TopLevel[Unpublished with Double]
  
}

