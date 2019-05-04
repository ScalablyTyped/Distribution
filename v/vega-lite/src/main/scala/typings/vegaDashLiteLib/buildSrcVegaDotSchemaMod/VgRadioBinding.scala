package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgRadioBinding extends VgBinding {
  var element: js.UndefOr[java.lang.String] = js.undefined
  var input: vegaDashLiteLib.vegaDashLiteLibStrings.radio
  var options: js.Array[java.lang.String]
}

object VgRadioBinding {
  @scala.inline
  def apply(
    input: vegaDashLiteLib.vegaDashLiteLibStrings.radio,
    options: js.Array[java.lang.String],
    element: java.lang.String = null
  ): VgRadioBinding = {
    val __obj = js.Dynamic.literal(input = input, options = options)
    if (element != null) __obj.updateDynamic("element")(element)
    __obj.asInstanceOf[VgRadioBinding]
  }
}

