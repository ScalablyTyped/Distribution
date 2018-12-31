package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

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
  sealed trait AdminResponseForReview
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ReviewPatchOperation
  
  /**
    * Delete an Admin Reply
    */
  @js.native
  sealed trait DeleteAdminReply
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ReviewPatchOperation
  
  /**
    * Delete Publisher Reply
    */
  @js.native
  sealed trait DeletePublisherReply
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ReviewPatchOperation
  
  /**
    * Flag a review
    */
  @js.native
  sealed trait FlagReview
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ReviewPatchOperation
  
  /**
    * Submit a reply for a review
    */
  @js.native
  sealed trait ReplyToReview
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ReviewPatchOperation
  
  /**
    * Update an existing review
    */
  @js.native
  sealed trait UpdateReview
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ReviewPatchOperation
  
  /* 4 */ val AdminResponseForReview: AdminResponseForReview with scala.Double = js.native
  /* 5 */ val DeleteAdminReply: DeleteAdminReply with scala.Double = js.native
  /* 6 */ val DeletePublisherReply: DeletePublisherReply with scala.Double = js.native
  /* 1 */ val FlagReview: FlagReview with scala.Double = js.native
  /* 3 */ val ReplyToReview: ReplyToReview with scala.Double = js.native
  /* 2 */ val UpdateReview: UpdateReview with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ReviewPatchOperation with scala.Double
  ] = js.native
}

