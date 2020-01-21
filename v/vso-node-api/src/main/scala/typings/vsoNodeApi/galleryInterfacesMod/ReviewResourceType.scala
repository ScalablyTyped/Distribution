package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReviewResourceType extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ReviewResourceType")
@js.native
object ReviewResourceType extends js.Object {
  @js.native
  sealed trait AdminReply extends ReviewResourceType
  
  @js.native
  sealed trait PublisherReply extends ReviewResourceType
  
  @js.native
  sealed trait Review extends ReviewResourceType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReviewResourceType with Double] = js.native
  /* 3 */ @js.native
  object AdminReply extends TopLevel[AdminReply with Double]
  
  /* 2 */ @js.native
  object PublisherReply extends TopLevel[PublisherReply with Double]
  
  /* 1 */ @js.native
  object Review
    extends TopLevel[typings.vsoNodeApi.galleryInterfacesMod.ReviewResourceType.Review with Double]
  
}

