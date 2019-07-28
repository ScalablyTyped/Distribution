package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

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
  
  /* 3 */ val AdminReply: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ReviewResourceType.AdminReply with Double = js.native
  /* 2 */ val PublisherReply: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ReviewResourceType.PublisherReply with Double = js.native
  /* 1 */ val Review: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ReviewResourceType.Review with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReviewResourceType with Double] = js.native
}

