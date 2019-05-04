package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgSelectBinding extends VgBinding {
  var element: js.UndefOr[java.lang.String] = js.undefined
  var input: vegaDashLiteLib.vegaDashLiteLibStrings.select
  var options: js.Array[java.lang.String]
}

object VgSelectBinding {
  @scala.inline
  def apply(
    input: vegaDashLiteLib.vegaDashLiteLibStrings.select,
    options: js.Array[java.lang.String],
    element: java.lang.String = null
  ): VgSelectBinding = {
    val __obj = js.Dynamic.literal(input = input, options = options)
    if (element != null) __obj.updateDynamic("element")(element)
    __obj.asInstanceOf[VgSelectBinding]
  }
}

