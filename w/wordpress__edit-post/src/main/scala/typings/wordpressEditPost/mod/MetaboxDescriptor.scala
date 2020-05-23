package typings.wordpressEditPost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaboxDescriptor extends js.Object {
  var id: String
  var title: String
}

object MetaboxDescriptor {
  @scala.inline
  def apply(id: String, title: String): MetaboxDescriptor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaboxDescriptor]
  }
}

