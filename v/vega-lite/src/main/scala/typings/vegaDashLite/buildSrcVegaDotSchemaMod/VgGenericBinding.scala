package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgGenericBinding extends VgBinding {
  var element: js.UndefOr[String] = js.undefined
  var input: String
}

object VgGenericBinding {
  @scala.inline
  def apply(input: String, element: String = null): VgGenericBinding = {
    val __obj = js.Dynamic.literal(input = input)
    if (element != null) __obj.updateDynamic("element")(element)
    __obj.asInstanceOf[VgGenericBinding]
  }
}

