package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 界面-----设置导航条
@js.native
trait SetNavigationBarTitleOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 页面标题 */
  var title: String = js.native
}

object SetNavigationBarTitleOptions {
  @scala.inline
  def apply(title: String): SetNavigationBarTitleOptions = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetNavigationBarTitleOptions]
  }
  @scala.inline
  implicit class SetNavigationBarTitleOptionsOps[Self <: SetNavigationBarTitleOptions] (val x: Self) extends AnyVal {
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

