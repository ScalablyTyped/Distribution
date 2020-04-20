package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdminReply extends js.Object {
  var adminReply: Double
  var publisherReply: Double
  var review: Double
}

object AnonAdminReply {
  @scala.inline
  def apply(adminReply: Double, publisherReply: Double, review: Double): AnonAdminReply = {
    val __obj = js.Dynamic.literal(adminReply = adminReply.asInstanceOf[js.Any], publisherReply = publisherReply.asInstanceOf[js.Any], review = review.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdminReply]
  }
}

