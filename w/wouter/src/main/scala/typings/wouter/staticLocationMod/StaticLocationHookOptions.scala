package typings.wouter.staticLocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticLocationHookOptions extends js.Object {
  var record: js.UndefOr[Boolean] = js.native
}

object StaticLocationHookOptions {
  @scala.inline
  def apply(): StaticLocationHookOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticLocationHookOptions]
  }
  @scala.inline
  implicit class StaticLocationHookOptionsOps[Self <: StaticLocationHookOptions] (val x: Self) extends AnyVal {
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
    def setRecord(value: Boolean): Self = this.set("record", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecord: Self = this.set("record", js.undefined)
  }
  
}

