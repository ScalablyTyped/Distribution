package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReviewFilterOptions extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ReviewFilterOptions")
@js.native
object ReviewFilterOptions extends js.Object {
  /**
       * Filter out review items with empty review text
       */
  @js.native
  sealed trait FilterEmptyReviews
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ReviewFilterOptions
  
  /**
       * Filter out review items with empty usernames
       */
  @js.native
  sealed trait FilterEmptyUserNames
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ReviewFilterOptions
  
  /**
       * No filtering, all reviews are returned (default option)
       */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ReviewFilterOptions
  
  /* 1 */ val FilterEmptyReviews: FilterEmptyReviews with scala.Double = js.native
  /* 2 */ val FilterEmptyUserNames: FilterEmptyUserNames with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ReviewFilterOptions with scala.Double
  ] = js.native
}

