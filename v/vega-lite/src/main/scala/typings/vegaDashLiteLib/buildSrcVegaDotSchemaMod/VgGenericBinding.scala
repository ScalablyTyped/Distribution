package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgGenericBinding extends VgBinding {
  var element: js.UndefOr[java.lang.String] = js.undefined
  var input: java.lang.String
}

object VgGenericBinding {
  @scala.inline
  def apply(input: java.lang.String, element: java.lang.String = null): VgGenericBinding = {
    val __obj = js.Dynamic.literal(input = input)
    if (element != null) __obj.updateDynamic("element")(element)
    __obj.asInstanceOf[VgGenericBinding]
  }
}

