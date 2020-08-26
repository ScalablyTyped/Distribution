package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShowTabBarOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 是否需要动画效果，默认无 */
  var aniamtion: js.UndefOr[Boolean] = js.native
}

object ShowTabBarOptions {
  @scala.inline
  def apply(): ShowTabBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowTabBarOptions]
  }
  @scala.inline
  implicit class ShowTabBarOptionsOps[Self <: ShowTabBarOptions] (val x: Self) extends AnyVal {
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
    def setAniamtion(value: Boolean): Self = this.set("aniamtion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAniamtion: Self = this.set("aniamtion", js.undefined)
  }
  
}

