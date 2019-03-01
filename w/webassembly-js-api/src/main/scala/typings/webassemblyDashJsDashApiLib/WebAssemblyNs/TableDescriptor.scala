package typings
package webassemblyDashJsDashApiLib.WebAssemblyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WebAssembly.Table
  */
trait TableDescriptor extends js.Object {
  var element: webassemblyDashJsDashApiLib.webassemblyDashJsDashApiLibStrings.anyfunc
  var initial: scala.Double
  var maximum: js.UndefOr[scala.Double] = js.undefined
}

object TableDescriptor {
  @scala.inline
  def apply(
    element: webassemblyDashJsDashApiLib.webassemblyDashJsDashApiLibStrings.anyfunc,
    initial: scala.Double,
    maximum: scala.Int | scala.Double = null
  ): TableDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("initial")(initial)
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableDescriptor]
  }
}

