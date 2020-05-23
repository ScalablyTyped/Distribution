package typings.wordpressRichText.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Html extends js.Object {
  var html: String
}

object Html {
  @scala.inline
  def apply(html: String): Html = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[Html]
  }
}

