package typings
package wepyLib.pageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageConfig extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var backgroundTextStyle: js.UndefOr[java.lang.String] = js.undefined
  var disableScroll: js.UndefOr[scala.Boolean] = js.undefined
  var enablePullDownRefresh: js.UndefOr[scala.Boolean] = js.undefined
  var navigationBarBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var navigationBarTextStyle: js.UndefOr[java.lang.String] = js.undefined
  var navigationBarTitleText: js.UndefOr[java.lang.String] = js.undefined
  var onReachBottomDistance: js.UndefOr[scala.Double] = js.undefined
}

object PageConfig {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    backgroundTextStyle: java.lang.String = null,
    disableScroll: js.UndefOr[scala.Boolean] = js.undefined,
    enablePullDownRefresh: js.UndefOr[scala.Boolean] = js.undefined,
    navigationBarBackgroundColor: java.lang.String = null,
    navigationBarTextStyle: java.lang.String = null,
    navigationBarTitleText: java.lang.String = null,
    onReachBottomDistance: scala.Int | scala.Double = null
  ): PageConfig = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (backgroundTextStyle != null) __obj.updateDynamic("backgroundTextStyle")(backgroundTextStyle)
    if (!js.isUndefined(disableScroll)) __obj.updateDynamic("disableScroll")(disableScroll)
    if (!js.isUndefined(enablePullDownRefresh)) __obj.updateDynamic("enablePullDownRefresh")(enablePullDownRefresh)
    if (navigationBarBackgroundColor != null) __obj.updateDynamic("navigationBarBackgroundColor")(navigationBarBackgroundColor)
    if (navigationBarTextStyle != null) __obj.updateDynamic("navigationBarTextStyle")(navigationBarTextStyle)
    if (navigationBarTitleText != null) __obj.updateDynamic("navigationBarTitleText")(navigationBarTitleText)
    if (onReachBottomDistance != null) __obj.updateDynamic("onReachBottomDistance")(onReachBottomDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageConfig]
  }
}

