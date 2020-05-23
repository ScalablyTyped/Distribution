package typings.xss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnIgnoreTag extends js.Object {
  def onIgnoreTag(tag: String, html: String, options: IsClosing): String
  def remove(html: String): String
}

object OnIgnoreTag {
  @scala.inline
  def apply(onIgnoreTag: (String, String, IsClosing) => String, remove: String => String): OnIgnoreTag = {
    val __obj = js.Dynamic.literal(onIgnoreTag = js.Any.fromFunction3(onIgnoreTag), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[OnIgnoreTag]
  }
}

