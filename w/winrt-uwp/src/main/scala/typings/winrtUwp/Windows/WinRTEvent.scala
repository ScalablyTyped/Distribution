package typings.winrtUwp.Windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WinRTEvent[TSender] extends js.Object {
  var detail: js.Array[_] = js.native
  var target: TSender = js.native
  var `type`: String = js.native
}

object WinRTEvent {
  @scala.inline
  def apply[TSender](detail: js.Array[_], target: TSender, `type`: String): WinRTEvent[TSender] = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WinRTEvent[TSender]]
  }
  @scala.inline
  implicit class WinRTEventOps[Self <: WinRTEvent[_], TSender] (val x: Self with WinRTEvent[TSender]) extends AnyVal {
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
    def setDetailVarargs(value: js.Any*): Self = this.set("detail", js.Array(value :_*))
    @scala.inline
    def setDetail(value: js.Array[_]): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: TSender): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

