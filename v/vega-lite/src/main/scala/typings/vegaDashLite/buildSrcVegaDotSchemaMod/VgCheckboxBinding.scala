package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import typings.vegaDashLite.vegaDashLiteStrings.checkbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgCheckboxBinding extends VgBinding {
  var element: js.UndefOr[String] = js.undefined
  var input: checkbox
}

object VgCheckboxBinding {
  @scala.inline
  def apply(input: checkbox, element: String = null): VgCheckboxBinding = {
    val __obj = js.Dynamic.literal(input = input)
    if (element != null) __obj.updateDynamic("element")(element)
    __obj.asInstanceOf[VgCheckboxBinding]
  }
}

