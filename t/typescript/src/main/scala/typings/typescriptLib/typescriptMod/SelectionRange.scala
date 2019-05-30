package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionRange extends js.Object {
  var parent: js.UndefOr[SelectionRange] = js.undefined
  var textSpan: TextSpan
}

object SelectionRange {
  @scala.inline
  def apply(textSpan: TextSpan, parent: SelectionRange = null): SelectionRange = {
    val __obj = js.Dynamic.literal(textSpan = textSpan)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[SelectionRange]
  }
}

