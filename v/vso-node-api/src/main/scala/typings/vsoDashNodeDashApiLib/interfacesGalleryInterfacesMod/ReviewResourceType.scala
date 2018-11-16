package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReviewResourceType extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ReviewResourceType")
@js.native
object ReviewResourceType extends js.Object {
  @js.native
  sealed trait AdminReply
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ReviewResourceType
  
  @js.native
  sealed trait PublisherReply
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ReviewResourceType
  
  @js.native
  sealed trait Review
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ReviewResourceType
  
  /* 3 */ val AdminReply: AdminReply with scala.Double = js.native
  /* 2 */ val PublisherReply: PublisherReply with scala.Double = js.native
  /* 1 */ val Review: Review with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ReviewResourceType with scala.Double
  ] = js.native
}

