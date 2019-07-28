package typings.yandexDashMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentString extends js.Object {
  var content: js.UndefOr[String] = js.undefined
}

object Anon_ContentString {
  @scala.inline
  def apply(content: String = null): Anon_ContentString = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    __obj.asInstanceOf[Anon_ContentString]
  }
}

