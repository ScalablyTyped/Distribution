package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//  下载
@js.native
trait OnProgressCallbackOptions extends js.Object {
  //  下载进度百分比
  var progress: Double = js.native
  //  预期需要下载的数据总长度，单位 Bytes
  var totalBytesExpectedToWrite: Double = js.native
  //  已经下载的数据长度，单位 Bytes
  var totalBytesWritten: Double = js.native
}

object OnProgressCallbackOptions {
  @scala.inline
  def apply(progress: Double, totalBytesExpectedToWrite: Double, totalBytesWritten: Double): OnProgressCallbackOptions = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], totalBytesExpectedToWrite = totalBytesExpectedToWrite.asInstanceOf[js.Any], totalBytesWritten = totalBytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnProgressCallbackOptions]
  }
  @scala.inline
  implicit class OnProgressCallbackOptionsOps[Self <: OnProgressCallbackOptions] (val x: Self) extends AnyVal {
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
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalBytesExpectedToWrite(value: Double): Self = this.set("totalBytesExpectedToWrite", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalBytesWritten(value: Double): Self = this.set("totalBytesWritten", value.asInstanceOf[js.Any])
  }
  
}

