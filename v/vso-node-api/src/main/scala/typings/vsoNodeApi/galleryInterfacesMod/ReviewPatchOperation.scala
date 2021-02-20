package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReviewPatchOperation extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ReviewPatchOperation")
@js.native
object ReviewPatchOperation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReviewPatchOperation with Double] = js.native
  
  /**
    * Submit an admin response
    */
  @js.native
  sealed trait AdminResponseForReview extends ReviewPatchOperation
  /* 4 */ val AdminResponseForReview: typings.vsoNodeApi.galleryInterfacesMod.ReviewPatchOperation.AdminResponseForReview with Double = js.native
  
  /**
    * Delete an Admin Reply
    */
  @js.native
  sealed trait DeleteAdminReply extends ReviewPatchOperation
  /* 5 */ val DeleteAdminReply: typings.vsoNodeApi.galleryInterfacesMod.ReviewPatchOperation.DeleteAdminReply with Double = js.native
  
  /**
    * Delete Publisher Reply
    */
  @js.native
  sealed trait DeletePublisherReply extends ReviewPatchOperation
  /* 6 */ val DeletePublisherReply: typings.vsoNodeApi.galleryInterfacesMod.ReviewPatchOperation.DeletePublisherReply with Double = js.native
  
  /**
    * Flag a review
    */
  @js.native
  sealed trait FlagReview extends ReviewPatchOperation
  /* 1 */ val FlagReview: typings.vsoNodeApi.galleryInterfacesMod.ReviewPatchOperation.FlagReview with Double = js.native
  
  /**
    * Submit a reply for a review
    */
  @js.native
  sealed trait ReplyToReview extends ReviewPatchOperation
  /* 3 */ val ReplyToReview: typings.vsoNodeApi.galleryInterfacesMod.ReviewPatchOperation.ReplyToReview with Double = js.native
  
  /**
    * Update an existing review
    */
  @js.native
  sealed trait UpdateReview extends ReviewPatchOperation
  /* 2 */ val UpdateReview: typings.vsoNodeApi.galleryInterfacesMod.ReviewPatchOperation.UpdateReview with Double = js.native
}
