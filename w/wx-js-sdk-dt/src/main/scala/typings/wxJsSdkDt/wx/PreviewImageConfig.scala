package typings.wxJsSdkDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 显示照片预览用的配置对象
  */
@js.native
trait PreviewImageConfig extends WxBaseRequestConfig {
  /**
    * 当前显示图片的 http 链接
    */
  var current: String = js.native
  /**
    * 需要预览的图片 http 链接列表
    */
  var urls: js.Array[String] = js.native
}

object PreviewImageConfig {
  @scala.inline
  def apply(current: String, urls: js.Array[String]): PreviewImageConfig = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewImageConfig]
  }
  @scala.inline
  implicit class PreviewImageConfigOps[Self <: PreviewImageConfig] (val x: Self) extends AnyVal {
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
    def setCurrent(value: String): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrlsVarargs(value: String*): Self = this.set("urls", js.Array(value :_*))
    @scala.inline
    def setUrls(value: js.Array[String]): Self = this.set("urls", value.asInstanceOf[js.Any])
  }
  
}

