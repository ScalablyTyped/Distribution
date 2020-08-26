package typings.xstate.invokeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvokedPromiseOptions extends js.Object {
  var id: js.UndefOr[String] = js.native
}

object InvokedPromiseOptions {
  @scala.inline
  def apply(): InvokedPromiseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvokedPromiseOptions]
  }
  @scala.inline
  implicit class InvokedPromiseOptionsOps[Self <: InvokedPromiseOptions] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

