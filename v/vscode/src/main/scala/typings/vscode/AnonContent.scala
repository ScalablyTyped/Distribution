package typings.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var language: js.UndefOr[String] = js.undefined
}

object AnonContent {
  @scala.inline
  def apply(content: String = null, language: String = null): AnonContent = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContent]
  }
}

