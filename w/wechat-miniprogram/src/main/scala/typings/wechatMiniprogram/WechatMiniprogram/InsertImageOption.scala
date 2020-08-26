package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertImageOption extends js.Object {
  /** 图像无法显示时的替代文本 */
  var alt: js.UndefOr[String] = js.native
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[InsertImageCompleteCallback] = js.native
  /** data 被序列化为 name=value;name1=value2 的格式挂在属性 data-custom 上 */
  var data: js.UndefOr[IAnyObject] = js.native
  /** 添加到图片 img 标签上的类名 */
  var extClass: js.UndefOr[String] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[InsertImageFailCallback] = js.native
  /** 图片高度 (pixels/百分比) */
  var height: js.UndefOr[String] = js.native
  /** 图片地址，仅支持 http(s)、base64、云图片(2.8.0)、临时文件(2.8.3)。 */
  var src: String = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[InsertImageSuccessCallback] = js.native
  /** 图片宽度（pixels/百分比) */
  var width: js.UndefOr[String] = js.native
}

object InsertImageOption {
  @scala.inline
  def apply(src: String): InsertImageOption = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertImageOption]
  }
  @scala.inline
  implicit class InsertImageOptionOps[Self <: InsertImageOption] (val x: Self) extends AnyVal {
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
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setData(value: IAnyObject): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setExtClass(value: String): Self = this.set("extClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtClass: Self = this.set("extClass", js.undefined)
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

