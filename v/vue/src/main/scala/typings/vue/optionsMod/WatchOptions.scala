package typings.vue.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchOptions extends js.Object {
  var deep: js.UndefOr[Boolean] = js.native
  var immediate: js.UndefOr[Boolean] = js.native
}

object WatchOptions {
  @scala.inline
  def apply(): WatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchOptions]
  }
  @scala.inline
  implicit class WatchOptionsOps[Self <: WatchOptions] (val x: Self) extends AnyVal {
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
    def setDeep(value: Boolean): Self = this.set("deep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeep: Self = this.set("deep", js.undefined)
    @scala.inline
    def setImmediate(value: Boolean): Self = this.set("immediate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImmediate: Self = this.set("immediate", js.undefined)
  }
  
}

