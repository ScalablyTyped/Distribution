package typings.wordpressEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostName extends js.Object {
  var postName: String
  var prefix: String
  var suffix: js.UndefOr[String] = js.undefined
}

object PostName {
  @scala.inline
  def apply(postName: String, prefix: String, suffix: String = null): PostName = {
    val __obj = js.Dynamic.literal(postName = postName.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostName]
  }
}

