package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReviewFilterOptions extends js.Object
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ReviewFilterOptions")
@js.native
object ReviewFilterOptions extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReviewFilterOptions with Double] = js.native
  
  /**
    * Filter out review items with empty review text
    */
  @js.native
  sealed trait FilterEmptyReviews extends ReviewFilterOptions
  /* 1 */ @js.native
  object FilterEmptyReviews extends TopLevel[FilterEmptyReviews with Double]
  
  /**
    * Filter out review items with empty usernames
    */
  @js.native
  sealed trait FilterEmptyUserNames extends ReviewFilterOptions
  /* 2 */ @js.native
  object FilterEmptyUserNames extends TopLevel[FilterEmptyUserNames with Double]
  
  /**
    * No filtering, all reviews are returned (default option)
    */
  @js.native
  sealed trait None extends ReviewFilterOptions
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
