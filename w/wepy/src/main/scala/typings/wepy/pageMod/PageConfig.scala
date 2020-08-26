package typings.wepy.pageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageConfig extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var backgroundTextStyle: js.UndefOr[String] = js.native
  var disableScroll: js.UndefOr[Boolean] = js.native
  var enablePullDownRefresh: js.UndefOr[Boolean] = js.native
  var navigationBarBackgroundColor: js.UndefOr[String] = js.native
  var navigationBarTextStyle: js.UndefOr[String] = js.native
  var navigationBarTitleText: js.UndefOr[String] = js.native
  var onReachBottomDistance: js.UndefOr[Double] = js.native
}

object PageConfig {
  @scala.inline
  def apply(): PageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageConfig]
  }
  @scala.inline
  implicit class PageConfigOps[Self <: PageConfig] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBackgroundTextStyle(value: String): Self = this.set("backgroundTextStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundTextStyle: Self = this.set("backgroundTextStyle", js.undefined)
    @scala.inline
    def setDisableScroll(value: Boolean): Self = this.set("disableScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableScroll: Self = this.set("disableScroll", js.undefined)
    @scala.inline
    def setEnablePullDownRefresh(value: Boolean): Self = this.set("enablePullDownRefresh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePullDownRefresh: Self = this.set("enablePullDownRefresh", js.undefined)
    @scala.inline
    def setNavigationBarBackgroundColor(value: String): Self = this.set("navigationBarBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationBarBackgroundColor: Self = this.set("navigationBarBackgroundColor", js.undefined)
    @scala.inline
    def setNavigationBarTextStyle(value: String): Self = this.set("navigationBarTextStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationBarTextStyle: Self = this.set("navigationBarTextStyle", js.undefined)
    @scala.inline
    def setNavigationBarTitleText(value: String): Self = this.set("navigationBarTitleText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationBarTitleText: Self = this.set("navigationBarTitleText", js.undefined)
    @scala.inline
    def setOnReachBottomDistance(value: Double): Self = this.set("onReachBottomDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnReachBottomDistance: Self = this.set("onReachBottomDistance", js.undefined)
  }
  
}

