package typings.vueSelect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueSelectData extends js.Object {
  var mutableOptions: js.Array[_] = js.native
  var mutableValue: js.Any = js.native
  var open: Boolean = js.native
  var search: String = js.native
}

object VueSelectData {
  @scala.inline
  def apply(mutableOptions: js.Array[_], mutableValue: js.Any, open: Boolean, search: String): VueSelectData = {
    val __obj = js.Dynamic.literal(mutableOptions = mutableOptions.asInstanceOf[js.Any], mutableValue = mutableValue.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueSelectData]
  }
  @scala.inline
  implicit class VueSelectDataOps[Self <: VueSelectData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMutableOptionsVarargs(value: js.Any*): Self = this.set("mutableOptions", js.Array(value :_*))
    @scala.inline
    def setMutableOptions(value: js.Array[_]): Self = this.set("mutableOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setMutableValue(value: js.Any): Self = this.set("mutableValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
  }
  
}

