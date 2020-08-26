package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchTabOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
    * 需要跳转的 tabBar 页面的路径
    * （需在 app.json 的 tabBar 字段定义的页面），路径后不能带参数
    */
  var url: String = js.native
}

object SwitchTabOptions {
  @scala.inline
  def apply(url: String): SwitchTabOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchTabOptions]
  }
  @scala.inline
  implicit class SwitchTabOptionsOps[Self <: SwitchTabOptions] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

