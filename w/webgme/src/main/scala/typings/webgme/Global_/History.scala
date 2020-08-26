package typings.webgme.Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait History extends js.Object {
  var configurable: Boolean = js.native
  var enumerable: Boolean = js.native
  var value: Boolean = js.native
  var writable: Boolean = js.native
}

object History {
  @scala.inline
  def apply(configurable: Boolean, enumerable: Boolean, value: Boolean, writable: Boolean): History = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], enumerable = enumerable.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[History]
  }
  @scala.inline
  implicit class HistoryOps[Self <: History] (val x: Self) extends AnyVal {
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
    def setConfigurable(value: Boolean): Self = this.set("configurable", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnumerable(value: Boolean): Self = this.set("enumerable", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Boolean): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setWritable(value: Boolean): Self = this.set("writable", value.asInstanceOf[js.Any])
  }
  
}

