package typings.tryghostContentApi.mod

import typings.tryghostContentApi.AnonPagination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostObject extends js.Object {
  var meta: AnonPagination
  var posts: js.Array[PostOrPage]
}

object PostObject {
  @scala.inline
  def apply(meta: AnonPagination, posts: js.Array[PostOrPage]): PostObject = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], posts = posts.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PostObject]
  }
}

