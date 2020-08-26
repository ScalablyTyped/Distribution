package typings.vueLs.mod.vueTypesVueAugmentingMod

import typings.vueLs.mod.WebStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueConstructor extends js.Object {
  var ls: WebStorage = js.native
}

object VueConstructor {
  @scala.inline
  def apply(ls: WebStorage): VueConstructor = {
    val __obj = js.Dynamic.literal(ls = ls.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueConstructor]
  }
  @scala.inline
  implicit class VueConstructorOps[Self <: VueConstructor] (val x: Self) extends AnyVal {
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
    def setLs(value: WebStorage): Self = this.set("ls", value.asInstanceOf[js.Any])
  }
  
}

