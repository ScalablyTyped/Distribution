package typings.wegameApi.wx.types

import typings.wegameApi.wegameApiStrings.jpg
import typings.wegameApi.wegameApiStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToTempFileSyncParams extends js.Object {
  /**
    * 目标文件的高度，会将截取的部分拉伸或压缩至该数值
    */
  var destHeight: js.UndefOr[Double] = js.native
  /**
    * 目标文件的宽度，会将截取的部分拉伸或压缩至该数值
    */
  var destWidth: js.UndefOr[Double] = js.native
  /**
    * 目标文件的类型
    */
  var fileType: js.UndefOr[jpg | png] = js.native
  /**
    * 截取 canvas 的高度
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * jpg图片的质量，仅当 fileType 为 jpg 时有效。取值范围为 0.0（最低）- 1.0（最高），不含 0。不在范围内时当作 1.0
    */
  var quality: js.UndefOr[Double] = js.native
  /**
    * 截取 canvas 的宽度
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * 截取 canvas 的左上角横坐标
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * 截取 canvas 的左上角纵坐标
    */
  var y: js.UndefOr[Double] = js.native
}

object ToTempFileSyncParams {
  @scala.inline
  def apply(): ToTempFileSyncParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToTempFileSyncParams]
  }
  @scala.inline
  implicit class ToTempFileSyncParamsOps[Self <: ToTempFileSyncParams] (val x: Self) extends AnyVal {
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
    def setDestHeight(value: Double): Self = this.set("destHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestHeight: Self = this.set("destHeight", js.undefined)
    @scala.inline
    def setDestWidth(value: Double): Self = this.set("destWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestWidth: Self = this.set("destWidth", js.undefined)
    @scala.inline
    def setFileType(value: jpg | png): Self = this.set("fileType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileType: Self = this.set("fileType", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

