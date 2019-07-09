package typings
package typestyleLib.libInternalTypestyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StylesTarget extends js.Object {
  var textContent: java.lang.String | scala.Null
}

object StylesTarget {
  @scala.inline
  def apply(textContent: java.lang.String = null): StylesTarget = {
    val __obj = js.Dynamic.literal()
    if (textContent != null) __obj.updateDynamic("textContent")(textContent)
    __obj.asInstanceOf[StylesTarget]
  }
}

