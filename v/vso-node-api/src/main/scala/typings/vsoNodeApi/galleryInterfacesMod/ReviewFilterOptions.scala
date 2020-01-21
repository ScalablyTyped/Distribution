package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReviewFilterOptions with Double] = js.native
  /* 1 */ @js.native
  object FilterEmptyReviews extends TopLevel[FilterEmptyReviews with Double]
  
  /* 2 */ @js.native
  object FilterEmptyUserNames extends TopLevel[FilterEmptyUserNames with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

