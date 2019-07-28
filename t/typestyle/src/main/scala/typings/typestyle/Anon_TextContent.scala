package typings.typestyle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TextContent extends js.Object {
  var textContent: String | Null
}

object Anon_TextContent {
  @scala.inline
  def apply(textContent: String = null): Anon_TextContent = {
    val __obj = js.Dynamic.literal()
    if (textContent != null) __obj.updateDynamic("textContent")(textContent)
    __obj.asInstanceOf[Anon_TextContent]
  }
}

