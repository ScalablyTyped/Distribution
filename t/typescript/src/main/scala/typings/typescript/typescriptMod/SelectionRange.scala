package typings.typescript.typescriptMod

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
    val __obj = js.Dynamic.literal(textSpan = textSpan.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionRange]
  }
}

