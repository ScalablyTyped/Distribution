package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdminResponseForReview extends js.Object {
  var adminResponseForReview: Double
  var deleteAdminReply: Double
  var deletePublisherReply: Double
  var flagReview: Double
  var replyToReview: Double
  var updateReview: Double
}

object Anon_AdminResponseForReview {
  @scala.inline
  def apply(
    adminResponseForReview: Double,
    deleteAdminReply: Double,
    deletePublisherReply: Double,
    flagReview: Double,
    replyToReview: Double,
    updateReview: Double
  ): Anon_AdminResponseForReview = {
    val __obj = js.Dynamic.literal(adminResponseForReview = adminResponseForReview, deleteAdminReply = deleteAdminReply, deletePublisherReply = deletePublisherReply, flagReview = flagReview, replyToReview = replyToReview, updateReview = updateReview)
  
    __obj.asInstanceOf[Anon_AdminResponseForReview]
  }
}

