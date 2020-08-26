package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooseVideoSuccess extends js.Object {
  /**
    * 选定视频的时间长度
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * 返回选定视频的长
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * 选定视频的数据量大小
    */
  var size: js.UndefOr[Double] = js.native
  /**
    * 临时文件路径，下载后的文件会存储到一个临时文件
    */
  var tempFilePath: js.UndefOr[String] = js.native
  /**
    * 返回选定视频的宽
    */
  var width: js.UndefOr[Double] = js.native
}

object ChooseVideoSuccess {
  @scala.inline
  def apply(): ChooseVideoSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseVideoSuccess]
  }
  @scala.inline
  implicit class ChooseVideoSuccessOps[Self <: ChooseVideoSuccess] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTempFilePath(value: String): Self = this.set("tempFilePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTempFilePath: Self = this.set("tempFilePath", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

