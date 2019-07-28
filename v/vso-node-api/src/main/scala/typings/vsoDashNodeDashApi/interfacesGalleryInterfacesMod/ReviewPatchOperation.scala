package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReviewPatchOperation extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ReviewPatchOperation")
@js.native
object ReviewPatchOperation extends js.Object {
  /**
    * Submit an admin response
    */
  @js.native
  sealed trait AdminResponseForReview extends ReviewPatchOperation
  
  /**
    * Delete an Admin Reply
    */
  @js.native
  sealed trait DeleteAdminReply extends ReviewPatchOperation
  
  /**
    * Delete Publisher Reply
    */
  @js.native
  sealed trait DeletePublisherReply extends ReviewPatchOperation
  
  /**
    * Flag a review
    */
  @js.native
  sealed trait FlagReview extends ReviewPatchOperation
  
  /**
    * Submit a reply for a review
    */
  @js.native
  sealed trait ReplyToReview extends ReviewPatchOperation
  
  /**
    * Update an existing review
    */
  @js.native
  sealed trait UpdateReview extends ReviewPatchOperation
  
  /* 4 */ val AdminResponseForReview: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ReviewPatchOperation.AdminResponseForReview with Double = js.native
  /* 5 */ val DeleteAdminReply: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ReviewPatchOperation.DeleteAdminReply with Double = js.native
  /* 6 */ val DeletePublisherReply: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ReviewPatchOperation.DeletePublisherReply with Double = js.native
  /* 1 */ val FlagReview: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ReviewPatchOperation.FlagReview with Double = js.native
  /* 3 */ val ReplyToReview: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ReviewPatchOperation.ReplyToReview with Double = js.native
  /* 2 */ val UpdateReview: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ReviewPatchOperation.UpdateReview with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReviewPatchOperation with Double] = js.native
}

