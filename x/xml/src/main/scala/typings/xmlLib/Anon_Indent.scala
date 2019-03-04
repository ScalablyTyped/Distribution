package typings
package xmlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Indent extends js.Object {
  var indent: js.UndefOr[java.lang.String] = js.undefined
  var stream: xmlLib.xmlLibNumbers.`true`
}

object Anon_Indent {
  @scala.inline
  def apply(stream: xmlLib.xmlLibNumbers.`true`, indent: java.lang.String = null): Anon_Indent = {
    val __obj = js.Dynamic.literal(stream = stream)
    if (indent != null) __obj.updateDynamic("indent")(indent)
    __obj.asInstanceOf[Anon_Indent]
  }
}

