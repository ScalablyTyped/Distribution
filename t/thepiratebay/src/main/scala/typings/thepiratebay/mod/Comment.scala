package typings.thepiratebay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  var comment: String
  var user: String
}

object Comment {
  @scala.inline
  def apply(comment: String, user: String): Comment = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Comment]
  }
}

