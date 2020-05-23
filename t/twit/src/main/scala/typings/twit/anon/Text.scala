package typings.twit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends js.Object {
  var text: js.UndefOr[String] = js.undefined
}

object Text {
  @scala.inline
  def apply(text: String = null): Text = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
}

