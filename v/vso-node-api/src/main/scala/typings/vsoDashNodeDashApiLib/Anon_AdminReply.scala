package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdminReply extends js.Object {
  var adminReply: scala.Double
  var publisherReply: scala.Double
  var review: scala.Double
}

object Anon_AdminReply {
  @scala.inline
  def apply(adminReply: scala.Double, publisherReply: scala.Double, review: scala.Double): Anon_AdminReply = {
    val __obj = js.Dynamic.literal(adminReply = adminReply, publisherReply = publisherReply, review = review)
  
    __obj.asInstanceOf[Anon_AdminReply]
  }
}

