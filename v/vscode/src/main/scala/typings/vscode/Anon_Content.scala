package typings.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var language: js.UndefOr[String] = js.undefined
}

object Anon_Content {
  @scala.inline
  def apply(content: String = null, language: String = null): Anon_Content = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (language != null) __obj.updateDynamic("language")(language)
    __obj.asInstanceOf[Anon_Content]
  }
}

