package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReviewResourceType extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ReviewResourceType")
@js.native
object ReviewResourceType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReviewResourceType with Double] = js.native
  
  @js.native
  sealed trait AdminReply extends ReviewResourceType
  /* 3 */ val AdminReply: typings.vsoNodeApi.galleryInterfacesMod.ReviewResourceType.AdminReply with Double = js.native
  
  @js.native
  sealed trait PublisherReply extends ReviewResourceType
  /* 2 */ val PublisherReply: typings.vsoNodeApi.galleryInterfacesMod.ReviewResourceType.PublisherReply with Double = js.native
  
  @js.native
  sealed trait Review extends ReviewResourceType
  /* 1 */ val Review: typings.vsoNodeApi.galleryInterfacesMod.ReviewResourceType.Review with Double = js.native
}
