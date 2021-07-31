package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DraftPatchOperation extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "DraftPatchOperation")
@js.native
object DraftPatchOperation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DraftPatchOperation & Double] = js.native
  
  @js.native
  sealed trait Cancel
    extends StObject
       with DraftPatchOperation
  /* 2 */ val Cancel: typings.vsoNodeApi.galleryInterfacesMod.DraftPatchOperation.Cancel & Double = js.native
  
  @js.native
  sealed trait Publish
    extends StObject
       with DraftPatchOperation
  /* 1 */ val Publish: typings.vsoNodeApi.galleryInterfacesMod.DraftPatchOperation.Publish & Double = js.native
}
