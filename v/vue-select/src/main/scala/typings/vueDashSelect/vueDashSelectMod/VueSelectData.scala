package typings.vueDashSelect.vueDashSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueSelectData extends js.Object {
  var mutableOptions: js.Array[_]
  var mutableValue: js.Any
  var open: Boolean
  var search: String
}

object VueSelectData {
  @scala.inline
  def apply(mutableOptions: js.Array[_], mutableValue: js.Any, open: Boolean, search: String): VueSelectData = {
    val __obj = js.Dynamic.literal(mutableOptions = mutableOptions, mutableValue = mutableValue, open = open, search = search)
  
    __obj.asInstanceOf[VueSelectData]
  }
}

