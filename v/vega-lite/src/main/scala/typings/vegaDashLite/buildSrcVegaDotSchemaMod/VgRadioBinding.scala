package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import typings.vegaDashLite.vegaDashLiteStrings.radio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgRadioBinding extends VgBinding {
  var element: js.UndefOr[String] = js.undefined
  var input: radio
  var options: js.Array[String]
}

object VgRadioBinding {
  @scala.inline
  def apply(input: radio, options: js.Array[String], element: String = null): VgRadioBinding = {
    val __obj = js.Dynamic.literal(input = input, options = options)
    if (element != null) __obj.updateDynamic("element")(element)
    __obj.asInstanceOf[VgRadioBinding]
  }
}

