package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReviewResourceType extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ReviewResourceType")
@js.native
object ReviewResourceType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReviewResourceType & Double] = js.native
  
  @js.native
  sealed trait AdminReply
    extends StObject
       with ReviewResourceType
  /* 3 */ val AdminReply: typings.vsoNodeApi.interfacesGalleryInterfacesMod.ReviewResourceType.AdminReply & Double = js.native
  
  @js.native
  sealed trait PublisherReply
    extends StObject
       with ReviewResourceType
  /* 2 */ val PublisherReply: typings.vsoNodeApi.interfacesGalleryInterfacesMod.ReviewResourceType.PublisherReply & Double = js.native
  
  @js.native
  sealed trait Review
    extends StObject
       with ReviewResourceType
  /* 1 */ val Review: typings.vsoNodeApi.interfacesGalleryInterfacesMod.ReviewResourceType.Review & Double = js.native
}
