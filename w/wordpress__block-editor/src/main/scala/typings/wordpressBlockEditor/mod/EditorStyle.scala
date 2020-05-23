package typings.wordpressBlockEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorStyle extends js.Object {
  var baseURL: js.UndefOr[String] = js.undefined
  var css: String
}

object EditorStyle {
  @scala.inline
  def apply(css: String, baseURL: String = null): EditorStyle = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any])
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorStyle]
  }
}

