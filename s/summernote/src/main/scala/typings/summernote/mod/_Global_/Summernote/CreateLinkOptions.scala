package typings.summernote.mod._Global_.Summernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLinkOptions extends js.Object {
  var newWindow: Boolean
  var text: String
  var url: String
}

object CreateLinkOptions {
  @scala.inline
  def apply(newWindow: Boolean, text: String, url: String): CreateLinkOptions = {
    val __obj = js.Dynamic.literal(newWindow = newWindow.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLinkOptions]
  }
}

