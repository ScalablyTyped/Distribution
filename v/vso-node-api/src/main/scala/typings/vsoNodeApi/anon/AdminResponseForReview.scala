package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminResponseForReview extends js.Object {
  var adminResponseForReview: scala.Double
  var deleteAdminReply: scala.Double
  var deletePublisherReply: scala.Double
  var flagReview: scala.Double
  var replyToReview: scala.Double
  var updateReview: scala.Double
}

object AdminResponseForReview {
  @scala.inline
  def apply(
    adminResponseForReview: scala.Double,
    deleteAdminReply: scala.Double,
    deletePublisherReply: scala.Double,
    flagReview: scala.Double,
    replyToReview: scala.Double,
    updateReview: scala.Double
  ): AdminResponseForReview = {
    val __obj = js.Dynamic.literal(adminResponseForReview = adminResponseForReview.asInstanceOf[js.Any], deleteAdminReply = deleteAdminReply.asInstanceOf[js.Any], deletePublisherReply = deletePublisherReply.asInstanceOf[js.Any], flagReview = flagReview.asInstanceOf[js.Any], replyToReview = replyToReview.asInstanceOf[js.Any], updateReview = updateReview.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminResponseForReview]
  }
}

