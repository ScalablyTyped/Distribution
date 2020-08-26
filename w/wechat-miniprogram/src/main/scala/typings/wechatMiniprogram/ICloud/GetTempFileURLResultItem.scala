package typings.wechatMiniprogram.ICloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTempFileURLResultItem extends js.Object {
  var errMsg: String = js.native
  var fileID: String = js.native
  var maxAge: Double = js.native
  var status: Double = js.native
  var tempFileURL: String = js.native
}

object GetTempFileURLResultItem {
  @scala.inline
  def apply(errMsg: String, fileID: String, maxAge: Double, status: Double, tempFileURL: String): GetTempFileURLResultItem = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileID = fileID.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tempFileURL = tempFileURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTempFileURLResultItem]
  }
  @scala.inline
  implicit class GetTempFileURLResultItemOps[Self <: GetTempFileURLResultItem] (val x: Self) extends AnyVal {
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
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileID(value: String): Self = this.set("fileID", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTempFileURL(value: String): Self = this.set("tempFileURL", value.asInstanceOf[js.Any])
  }
  
}

