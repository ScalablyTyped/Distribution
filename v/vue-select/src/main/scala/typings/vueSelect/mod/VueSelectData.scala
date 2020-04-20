package typings.vueSelect.mod

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
    val __obj = js.Dynamic.literal(mutableOptions = mutableOptions.asInstanceOf[js.Any], mutableValue = mutableValue.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueSelectData]
  }
}

