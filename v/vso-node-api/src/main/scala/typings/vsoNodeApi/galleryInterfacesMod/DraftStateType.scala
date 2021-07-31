package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DraftStateType extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "DraftStateType")
@js.native
object DraftStateType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DraftStateType & Double] = js.native
  
  @js.native
  sealed trait Cancelled
    extends StObject
       with DraftStateType
  /* 3 */ val Cancelled: typings.vsoNodeApi.galleryInterfacesMod.DraftStateType.Cancelled & Double = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with DraftStateType
  /* 4 */ val Error: typings.vsoNodeApi.galleryInterfacesMod.DraftStateType.Error & Double = js.native
  
  @js.native
  sealed trait Published
    extends StObject
       with DraftStateType
  /* 2 */ val Published: typings.vsoNodeApi.galleryInterfacesMod.DraftStateType.Published & Double = js.native
  
  @js.native
  sealed trait Unpublished
    extends StObject
       with DraftStateType
  /* 1 */ val Unpublished: typings.vsoNodeApi.galleryInterfacesMod.DraftStateType.Unpublished & Double = js.native
}
