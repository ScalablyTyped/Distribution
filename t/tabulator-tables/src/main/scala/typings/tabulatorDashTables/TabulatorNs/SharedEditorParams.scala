package typings.tabulatorDashTables.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedEditorParams extends js.Object {
  var elementAttributes: js.UndefOr[JSONRecord] = js.undefined
}

object SharedEditorParams {
  @scala.inline
  def apply(elementAttributes: JSONRecord = null): SharedEditorParams = {
    val __obj = js.Dynamic.literal()
    if (elementAttributes != null) __obj.updateDynamic("elementAttributes")(elementAttributes)
    __obj.asInstanceOf[SharedEditorParams]
  }
}

