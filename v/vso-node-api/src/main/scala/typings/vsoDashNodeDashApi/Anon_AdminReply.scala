package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdminReply extends js.Object {
  var adminReply: Double
  var publisherReply: Double
  var review: Double
}

object Anon_AdminReply {
  @scala.inline
  def apply(adminReply: Double, publisherReply: Double, review: Double): Anon_AdminReply = {
    val __obj = js.Dynamic.literal(adminReply = adminReply.asInstanceOf[js.Any], publisherReply = publisherReply.asInstanceOf[js.Any], review = review.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AdminReply]
  }
}

