package typings.xml.anon

import typings.xml.xmlBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Indent extends js.Object {
  var indent: js.UndefOr[String] = js.undefined
  var stream: `true`
}

object Indent {
  @scala.inline
  def apply(stream: `true`, indent: String = null): Indent = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indent]
  }
}

