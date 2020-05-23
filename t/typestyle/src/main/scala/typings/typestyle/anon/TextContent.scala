package typings.typestyle.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextContent extends js.Object {
  var textContent: String | Null
}

object TextContent {
  @scala.inline
  def apply(textContent: String = null): TextContent = {
    val __obj = js.Dynamic.literal(textContent = textContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextContent]
  }
}

