package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import typings.vegaDashLite.vegaDashLiteStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgSelectBinding extends VgBinding {
  var element: js.UndefOr[String] = js.undefined
  var input: select
  var options: js.Array[String]
}

object VgSelectBinding {
  @scala.inline
  def apply(input: select, options: js.Array[String], element: String = null): VgSelectBinding = {
    val __obj = js.Dynamic.literal(input = input, options = options)
    if (element != null) __obj.updateDynamic("element")(element)
    __obj.asInstanceOf[VgSelectBinding]
  }
}

