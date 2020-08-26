package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClipboardDataSuccessRes extends js.Object {
  /**
    * 剪贴板的内容
    */
  var data: js.UndefOr[String] = js.native
}

object GetClipboardDataSuccessRes {
  @scala.inline
  def apply(): GetClipboardDataSuccessRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClipboardDataSuccessRes]
  }
  @scala.inline
  implicit class GetClipboardDataSuccessResOps[Self <: GetClipboardDataSuccessRes] (val x: Self) extends AnyVal {
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
  
}

