package typings
package vueDashSelectLib.vueDashSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueSelectData extends js.Object {
  var mutableOptions: js.Array[_]
  var mutableValue: js.Any
  var open: scala.Boolean
  var search: java.lang.String
}

object VueSelectData {
  @scala.inline
  def apply(mutableOptions: js.Array[_], mutableValue: js.Any, open: scala.Boolean, search: java.lang.String): VueSelectData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mutableOptions")(mutableOptions)
    __obj.updateDynamic("mutableValue")(mutableValue)
    __obj.updateDynamic("open")(open)
    __obj.updateDynamic("search")(search)
    __obj.asInstanceOf[VueSelectData]
  }
}

