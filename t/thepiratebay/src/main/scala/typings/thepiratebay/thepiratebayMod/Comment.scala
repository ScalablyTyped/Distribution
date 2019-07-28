package typings.thepiratebay.thepiratebayMod

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
    val __obj = js.Dynamic.literal(comment = comment, user = user)
  
    __obj.asInstanceOf[Comment]
  }
}

