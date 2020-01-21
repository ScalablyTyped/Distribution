package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdminResponseForReview extends js.Object {
  var adminResponseForReview: Double
  var deleteAdminReply: Double
  var deletePublisherReply: Double
  var flagReview: Double
  var replyToReview: Double
  var updateReview: Double
}

object AnonAdminResponseForReview {
  @scala.inline
  def apply(
    adminResponseForReview: Double,
    deleteAdminReply: Double,
    deletePublisherReply: Double,
    flagReview: Double,
    replyToReview: Double,
    updateReview: Double
  ): AnonAdminResponseForReview = {
    val __obj = js.Dynamic.literal(adminResponseForReview = adminResponseForReview.asInstanceOf[js.Any], deleteAdminReply = deleteAdminReply.asInstanceOf[js.Any], deletePublisherReply = deletePublisherReply.asInstanceOf[js.Any], flagReview = flagReview.asInstanceOf[js.Any], replyToReview = replyToReview.asInstanceOf[js.Any], updateReview = updateReview.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAdminResponseForReview]
  }
}

