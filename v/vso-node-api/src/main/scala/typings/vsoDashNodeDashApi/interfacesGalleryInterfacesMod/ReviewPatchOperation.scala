package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ReviewPatchOperation.AdminResponseForReview
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ReviewPatchOperation.DeleteAdminReply
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ReviewPatchOperation.DeletePublisherReply
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ReviewPatchOperation.FlagReview
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ReviewPatchOperation.ReplyToReview
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ReviewPatchOperation.UpdateReview
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReviewPatchOperation with Double] = js.native
  /* 4 */ @js.native
  object AdminResponseForReview extends TopLevel[AdminResponseForReview with Double]
  
  /* 5 */ @js.native
  object DeleteAdminReply extends TopLevel[DeleteAdminReply with Double]
  
  /* 6 */ @js.native
  object DeletePublisherReply extends TopLevel[DeletePublisherReply with Double]
  
  /* 1 */ @js.native
  object FlagReview extends TopLevel[FlagReview with Double]
  
  /* 3 */ @js.native
  object ReplyToReview extends TopLevel[ReplyToReview with Double]
  
  /* 2 */ @js.native
  object UpdateReview extends TopLevel[UpdateReview with Double]
  
}

