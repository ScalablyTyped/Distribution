package typings.typestyle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTextContent extends js.Object {
  var textContent: String | Null
}

object AnonTextContent {
  @scala.inline
  def apply(textContent: String = null): AnonTextContent = {
    val __obj = js.Dynamic.literal()
    if (textContent != null) __obj.updateDynamic("textContent")(textContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTextContent]
  }
}

