package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReviewFilterOptions extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ReviewFilterOptions")
@js.native
object ReviewFilterOptions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReviewFilterOptions with Double] = js.native
  
  /**
    * Filter out review items with empty review text
    */
  @js.native
  sealed trait FilterEmptyReviews extends ReviewFilterOptions
  /* 1 */ val FilterEmptyReviews: typings.vsoNodeApi.galleryInterfacesMod.ReviewFilterOptions.FilterEmptyReviews with Double = js.native
  
  /**
    * Filter out review items with empty usernames
    */
  @js.native
  sealed trait FilterEmptyUserNames extends ReviewFilterOptions
  /* 2 */ val FilterEmptyUserNames: typings.vsoNodeApi.galleryInterfacesMod.ReviewFilterOptions.FilterEmptyUserNames with Double = js.native
  
  /**
    * No filtering, all reviews are returned (default option)
    */
  @js.native
  sealed trait None extends ReviewFilterOptions
  /* 0 */ val None: typings.vsoNodeApi.galleryInterfacesMod.ReviewFilterOptions.None with Double = js.native
}
