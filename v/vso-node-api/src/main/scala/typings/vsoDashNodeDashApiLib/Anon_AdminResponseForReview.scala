package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdminResponseForReview extends js.Object {
  var adminResponseForReview: scala.Double
  var deleteAdminReply: scala.Double
  var deletePublisherReply: scala.Double
  var flagReview: scala.Double
  var replyToReview: scala.Double
  var updateReview: scala.Double
}

object Anon_AdminResponseForReview {
  @scala.inline
  def apply(
    adminResponseForReview: scala.Double,
    deleteAdminReply: scala.Double,
    deletePublisherReply: scala.Double,
    flagReview: scala.Double,
    replyToReview: scala.Double,
    updateReview: scala.Double
  ): Anon_AdminResponseForReview = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adminResponseForReview")(adminResponseForReview)
    __obj.updateDynamic("deleteAdminReply")(deleteAdminReply)
    __obj.updateDynamic("deletePublisherReply")(deletePublisherReply)
    __obj.updateDynamic("flagReview")(flagReview)
    __obj.updateDynamic("replyToReview")(replyToReview)
    __obj.updateDynamic("updateReview")(updateReview)
    __obj.asInstanceOf[Anon_AdminResponseForReview]
  }
}

