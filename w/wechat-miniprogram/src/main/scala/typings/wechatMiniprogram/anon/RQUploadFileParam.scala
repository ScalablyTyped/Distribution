package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.AnyObject
import typings.wechatMiniprogram.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined wechat-miniprogram.RQ<wechat-miniprogram.ICloud.UploadFileParam> */
@js.native
trait RQUploadFileParam extends js.Object {
  var cloudPath: String = js.native
  var config: js.UndefOr[ICloudConfig] = js.native
  var filePath: String = js.native
  var header: js.UndefOr[AnyObject] = js.native
}

object RQUploadFileParam {
  @scala.inline
  def apply(cloudPath: String, filePath: String): RQUploadFileParam = {
    val __obj = js.Dynamic.literal(cloudPath = cloudPath.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQUploadFileParam]
  }
  @scala.inline
  implicit class RQUploadFileParamOps[Self <: RQUploadFileParam] (val x: Self) extends AnyVal {
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
    def setCloudPath(value: String): Self = this.set("cloudPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfig(value: ICloudConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setHeader(value: AnyObject): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
  }
  
}

