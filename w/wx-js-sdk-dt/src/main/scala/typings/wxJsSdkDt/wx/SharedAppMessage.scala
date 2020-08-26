package typings.wxJsSdkDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 消息分享对象
  * @deprecated
  */
@js.native
trait SharedAppMessage extends ShareTimelineConfig {
  /**
    * 如果 type 是 music 或 video，则要提供数据链接，默认为空
    */
  var dataUrl: js.UndefOr[String] = js.native
  /**
    * 分享描述
    */
  var desc: String = js.native
  /**
    * 分享类型, music、video 或 link，不填默认为 link
    */
  var `type`: js.UndefOr[String] = js.native
}

object SharedAppMessage {
  @scala.inline
  def apply(desc: String, link: String, title: String): SharedAppMessage = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedAppMessage]
  }
  @scala.inline
  implicit class SharedAppMessageOps[Self <: SharedAppMessage] (val x: Self) extends AnyVal {
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
    def setDesc(value: String): Self = this.set("desc", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataUrl(value: String): Self = this.set("dataUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataUrl: Self = this.set("dataUrl", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

