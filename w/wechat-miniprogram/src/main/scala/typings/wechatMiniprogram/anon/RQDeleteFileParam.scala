package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined wechat-miniprogram.RQ<wechat-miniprogram.ICloud.DeleteFileParam> */
@js.native
trait RQDeleteFileParam extends js.Object {
  var config: js.UndefOr[ICloudConfig] = js.native
  var fileList: js.Array[String] = js.native
}

object RQDeleteFileParam {
  @scala.inline
  def apply(fileList: js.Array[String]): RQDeleteFileParam = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQDeleteFileParam]
  }
  @scala.inline
  implicit class RQDeleteFileParamOps[Self <: RQDeleteFileParam] (val x: Self) extends AnyVal {
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
    def setFileListVarargs(value: String*): Self = this.set("fileList", js.Array(value :_*))
    @scala.inline
    def setFileList(value: js.Array[String]): Self = this.set("fileList", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfig(value: ICloudConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
  }
  
}

