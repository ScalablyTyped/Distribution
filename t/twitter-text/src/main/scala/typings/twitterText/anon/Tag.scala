package typings.twitterText.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  var tag: String
}

object Tag {
  @scala.inline
  def apply(tag: String): Tag = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
}

