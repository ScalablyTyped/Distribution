package typings.wordpressEditPost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsLocked extends js.Object {
  var isLocked: Boolean
  var user: Null | String
}

object IsLocked {
  @scala.inline
  def apply(isLocked: Boolean, user: String = null): IsLocked = {
    val __obj = js.Dynamic.literal(isLocked = isLocked.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsLocked]
  }
}

