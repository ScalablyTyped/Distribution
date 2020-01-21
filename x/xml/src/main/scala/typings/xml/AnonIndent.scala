package typings.xml

import typings.xml.xmlBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndent extends js.Object {
  var indent: js.UndefOr[String] = js.undefined
  var stream: `true`
}

object AnonIndent {
  @scala.inline
  def apply(stream: `true`, indent: String = null): AnonIndent = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndent]
  }
}

