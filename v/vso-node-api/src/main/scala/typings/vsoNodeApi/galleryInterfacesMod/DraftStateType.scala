package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DraftStateType extends js.Object
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "DraftStateType")
@js.native
object DraftStateType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DraftStateType with Double] = js.native
  
  @js.native
  sealed trait Cancelled extends DraftStateType
  /* 3 */ @js.native
  object Cancelled extends TopLevel[Cancelled with Double]
  
  @js.native
  sealed trait Error extends DraftStateType
  /* 4 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  @js.native
  sealed trait Published extends DraftStateType
  /* 2 */ @js.native
  object Published extends TopLevel[Published with Double]
  
  @js.native
  sealed trait Unpublished extends DraftStateType
  /* 1 */ @js.native
  object Unpublished extends TopLevel[Unpublished with Double]
}
