package typings.xml

import typings.xml.xmlNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Indent extends js.Object {
  var indent: js.UndefOr[String] = js.undefined
  var stream: `true`
}

object Anon_Indent {
  @scala.inline
  def apply(stream: `true`, indent: String = null): Anon_Indent = {
    val __obj = js.Dynamic.literal(stream = stream)
    if (indent != null) __obj.updateDynamic("indent")(indent)
    __obj.asInstanceOf[Anon_Indent]
  }
}

