package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReviewResourceType extends js.Object
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ReviewResourceType")
@js.native
object ReviewResourceType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReviewResourceType with Double] = js.native
  
  @js.native
  sealed trait AdminReply extends ReviewResourceType
  /* 3 */ @js.native
  object AdminReply extends TopLevel[AdminReply with Double]
  
  @js.native
  sealed trait PublisherReply extends ReviewResourceType
  /* 2 */ @js.native
  object PublisherReply extends TopLevel[PublisherReply with Double]
  
  @js.native
  sealed trait Review extends ReviewResourceType
  /* 1 */ @js.native
  object Review
    extends TopLevel[typings.vsoNodeApi.galleryInterfacesMod.ReviewResourceType.Review with Double]
}
