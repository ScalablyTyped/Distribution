package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminReply extends js.Object {
  var adminReply: scala.Double
  var publisherReply: scala.Double
  var review: scala.Double
}

object AdminReply {
  @scala.inline
  def apply(adminReply: scala.Double, publisherReply: scala.Double, review: scala.Double): AdminReply = {
    val __obj = js.Dynamic.literal(adminReply = adminReply.asInstanceOf[js.Any], publisherReply = publisherReply.asInstanceOf[js.Any], review = review.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminReply]
  }
}

