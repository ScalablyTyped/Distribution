package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSDocTagInfo extends js.Object {
  var name: String
  var text: js.UndefOr[String] = js.undefined
}

object JSDocTagInfo {
  @scala.inline
  def apply(name: String, text: String = null): JSDocTagInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSDocTagInfo]
  }
}

