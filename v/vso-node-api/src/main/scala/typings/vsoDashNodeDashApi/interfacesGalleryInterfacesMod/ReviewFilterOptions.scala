package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

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
  sealed trait FilterEmptyReviews extends ReviewFilterOptions
  
  /**
    * Filter out review items with empty usernames
    */
  @js.native
  sealed trait FilterEmptyUserNames extends ReviewFilterOptions
  
  /**
    * No filtering, all reviews are returned (default option)
    */
  @js.native
  sealed trait None extends ReviewFilterOptions
  
  /* 1 */ val FilterEmptyReviews: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ReviewFilterOptions.FilterEmptyReviews with Double = js.native
  /* 2 */ val FilterEmptyUserNames: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ReviewFilterOptions.FilterEmptyUserNames with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ReviewFilterOptions.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReviewFilterOptions with Double] = js.native
}

