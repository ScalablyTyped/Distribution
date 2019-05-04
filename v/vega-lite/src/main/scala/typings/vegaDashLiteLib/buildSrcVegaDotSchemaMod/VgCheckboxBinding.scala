package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgCheckboxBinding extends VgBinding {
  var element: js.UndefOr[java.lang.String] = js.undefined
  var input: vegaDashLiteLib.vegaDashLiteLibStrings.checkbox
}

object VgCheckboxBinding {
  @scala.inline
  def apply(input: vegaDashLiteLib.vegaDashLiteLibStrings.checkbox, element: java.lang.String = null): VgCheckboxBinding = {
    val __obj = js.Dynamic.literal(input = input)
    if (element != null) __obj.updateDynamic("element")(element)
    __obj.asInstanceOf[VgCheckboxBinding]
  }
}

