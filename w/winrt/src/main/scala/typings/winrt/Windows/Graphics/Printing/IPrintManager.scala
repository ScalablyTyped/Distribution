package typings.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPrintManager extends js.Object {
  var onprinttaskrequested: js.Any = js.native
}

object IPrintManager {
  @scala.inline
  def apply(onprinttaskrequested: js.Any): IPrintManager = {
    val __obj = js.Dynamic.literal(onprinttaskrequested = onprinttaskrequested.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintManager]
  }
  @scala.inline
  implicit class IPrintManagerOps[Self <: IPrintManager] (val x: Self) extends AnyVal {
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
    def setOnprinttaskrequested(value: js.Any): Self = this.set("onprinttaskrequested", value.asInstanceOf[js.Any])
  }
  
}

