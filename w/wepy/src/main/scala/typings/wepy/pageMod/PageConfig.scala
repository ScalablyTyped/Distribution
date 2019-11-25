package typings.wepy.pageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageConfig extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var backgroundTextStyle: js.UndefOr[String] = js.undefined
  var disableScroll: js.UndefOr[Boolean] = js.undefined
  var enablePullDownRefresh: js.UndefOr[Boolean] = js.undefined
  var navigationBarBackgroundColor: js.UndefOr[String] = js.undefined
  var navigationBarTextStyle: js.UndefOr[String] = js.undefined
  var navigationBarTitleText: js.UndefOr[String] = js.undefined
  var onReachBottomDistance: js.UndefOr[Double] = js.undefined
}

object PageConfig {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    backgroundTextStyle: String = null,
    disableScroll: js.UndefOr[Boolean] = js.undefined,
    enablePullDownRefresh: js.UndefOr[Boolean] = js.undefined,
    navigationBarBackgroundColor: String = null,
    navigationBarTextStyle: String = null,
    navigationBarTitleText: String = null,
    onReachBottomDistance: Int | Double = null
  ): PageConfig = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (backgroundTextStyle != null) __obj.updateDynamic("backgroundTextStyle")(backgroundTextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScroll)) __obj.updateDynamic("disableScroll")(disableScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePullDownRefresh)) __obj.updateDynamic("enablePullDownRefresh")(enablePullDownRefresh.asInstanceOf[js.Any])
    if (navigationBarBackgroundColor != null) __obj.updateDynamic("navigationBarBackgroundColor")(navigationBarBackgroundColor.asInstanceOf[js.Any])
    if (navigationBarTextStyle != null) __obj.updateDynamic("navigationBarTextStyle")(navigationBarTextStyle.asInstanceOf[js.Any])
    if (navigationBarTitleText != null) __obj.updateDynamic("navigationBarTitleText")(navigationBarTitleText.asInstanceOf[js.Any])
    if (onReachBottomDistance != null) __obj.updateDynamic("onReachBottomDistance")(onReachBottomDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageConfig]
  }
}

