package typings
package thepiratebayLib.thepiratebayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  var comment: java.lang.String
  var user: java.lang.String
}

object Comment {
  @scala.inline
  def apply(comment: java.lang.String, user: java.lang.String): Comment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Comment]
  }
}

