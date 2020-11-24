package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReviewPatchOperation extends js.Object
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ReviewPatchOperation")
@js.native
object ReviewPatchOperation extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReviewPatchOperation with Double] = js.native
  
  /**
    * Submit an admin response
    */
  @js.native
  sealed trait AdminResponseForReview extends ReviewPatchOperation
  /* 4 */ @js.native
  object AdminResponseForReview extends TopLevel[AdminResponseForReview with Double]
  
  /**
    * Delete an Admin Reply
    */
  @js.native
  sealed trait DeleteAdminReply extends ReviewPatchOperation
  /* 5 */ @js.native
  object DeleteAdminReply extends TopLevel[DeleteAdminReply with Double]
  
  /**
    * Delete Publisher Reply
    */
  @js.native
  sealed trait DeletePublisherReply extends ReviewPatchOperation
  /* 6 */ @js.native
  object DeletePublisherReply extends TopLevel[DeletePublisherReply with Double]
  
  /**
    * Flag a review
    */
  @js.native
  sealed trait FlagReview extends ReviewPatchOperation
  /* 1 */ @js.native
  object FlagReview extends TopLevel[FlagReview with Double]
  
  /**
    * Submit a reply for a review
    */
  @js.native
  sealed trait ReplyToReview extends ReviewPatchOperation
  /* 3 */ @js.native
  object ReplyToReview extends TopLevel[ReplyToReview with Double]
  
  /**
    * Update an existing review
    */
  @js.native
  sealed trait UpdateReview extends ReviewPatchOperation
  /* 2 */ @js.native
  object UpdateReview extends TopLevel[UpdateReview with Double]
}
