package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DraftPatchOperation extends js.Object
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "DraftPatchOperation")
@js.native
object DraftPatchOperation extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DraftPatchOperation with Double] = js.native
  
  @js.native
  sealed trait Cancel extends DraftPatchOperation
  /* 2 */ @js.native
  object Cancel extends TopLevel[Cancel with Double]
  
  @js.native
  sealed trait Publish extends DraftPatchOperation
  /* 1 */ @js.native
  object Publish extends TopLevel[Publish with Double]
}
