package typings.superagent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentType extends js.Object {
  var contentType: js.UndefOr[String] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
}

object ContentType {
  @scala.inline
  def apply(contentType: String = null, filename: String = null): ContentType = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentType]
  }
}

