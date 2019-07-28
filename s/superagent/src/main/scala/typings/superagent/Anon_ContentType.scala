package typings.superagent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentType extends js.Object {
  var contentType: js.UndefOr[String] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
}

object Anon_ContentType {
  @scala.inline
  def apply(contentType: String = null, filename: String = null): Anon_ContentType = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    __obj.asInstanceOf[Anon_ContentType]
  }
}

