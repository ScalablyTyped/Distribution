package typings.tryghostContentApi.mod

import typings.tryghostContentApi.AnonPagination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagsObject extends js.Object {
  var meta: AnonPagination
  var tags: js.Array[Tag]
}

object TagsObject {
  @scala.inline
  def apply(meta: AnonPagination, tags: js.Array[Tag]): TagsObject = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagsObject]
  }
}

