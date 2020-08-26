package typings.terminalKit.terminalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleLineMenuResponse extends js.Object {
  var canceled: Boolean = js.native
  var selectedIndex: Double = js.native
  var selectedText: String = js.native
  var unexpectedKey: String = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object SingleLineMenuResponse {
  @scala.inline
  def apply(
    canceled: Boolean,
    selectedIndex: Double,
    selectedText: String,
    unexpectedKey: String,
    x: Double,
    y: Double
  ): SingleLineMenuResponse = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], selectedText = selectedText.asInstanceOf[js.Any], unexpectedKey = unexpectedKey.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleLineMenuResponse]
  }
  @scala.inline
  implicit class SingleLineMenuResponseOps[Self <: SingleLineMenuResponse] (val x: Self) extends AnyVal {
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
    def setCanceled(value: Boolean): Self = this.set("canceled", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedIndex(value: Double): Self = this.set("selectedIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedText(value: String): Self = this.set("selectedText", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnexpectedKey(value: String): Self = this.set("unexpectedKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

