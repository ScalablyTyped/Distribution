package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSystemInfoSuccess extends js.Object {
  /**
    * 手机品牌
    */
  var brand: js.UndefOr[String] = js.undefined
  /**
    * 用户字体大小设置
    */
  var fontSizeSetting: js.UndefOr[Double] = js.undefined
  /**
    * 程序设置的语言
    */
  var language: js.UndefOr[String] = js.undefined
  /**
    * 手机型号
    */
  var model: js.UndefOr[String] = js.undefined
  /**
    * 设备像素比
    */
  var pixelRatio: js.UndefOr[String] = js.undefined
  /**
    * 客户端平台
    */
  var platform: js.UndefOr[String] = js.undefined
  /**
    * 屏幕高度
    */
  var screenHeight: js.UndefOr[Double] = js.undefined
  /**
    * 屏幕宽度
    */
  var screenWidth: js.UndefOr[Double] = js.undefined
  /**
    * 状态栏的高度
    */
  var statusBarHeight: js.UndefOr[Double] = js.undefined
  /**
    * 操作系统版本
    */
  var system: js.UndefOr[String] = js.undefined
  /**
    * 5+版本号
    */
  var version: js.UndefOr[Double] = js.undefined
  /**
    * 可使用窗口高度
    */
  var windowHeight: js.UndefOr[Double] = js.undefined
  /**
    * 可使用窗口宽度
    */
  var windowWidth: js.UndefOr[Double] = js.undefined
}

object GetSystemInfoSuccess {
  @scala.inline
  def apply(
    brand: String = null,
    fontSizeSetting: Int | Double = null,
    language: String = null,
    model: String = null,
    pixelRatio: String = null,
    platform: String = null,
    screenHeight: Int | Double = null,
    screenWidth: Int | Double = null,
    statusBarHeight: Int | Double = null,
    system: String = null,
    version: Int | Double = null,
    windowHeight: Int | Double = null,
    windowWidth: Int | Double = null
  ): GetSystemInfoSuccess = {
    val __obj = js.Dynamic.literal()
    if (brand != null) __obj.updateDynamic("brand")(brand)
    if (fontSizeSetting != null) __obj.updateDynamic("fontSizeSetting")(fontSizeSetting.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language)
    if (model != null) __obj.updateDynamic("model")(model)
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (screenHeight != null) __obj.updateDynamic("screenHeight")(screenHeight.asInstanceOf[js.Any])
    if (screenWidth != null) __obj.updateDynamic("screenWidth")(screenWidth.asInstanceOf[js.Any])
    if (statusBarHeight != null) __obj.updateDynamic("statusBarHeight")(statusBarHeight.asInstanceOf[js.Any])
    if (system != null) __obj.updateDynamic("system")(system)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (windowHeight != null) __obj.updateDynamic("windowHeight")(windowHeight.asInstanceOf[js.Any])
    if (windowWidth != null) __obj.updateDynamic("windowWidth")(windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSystemInfoSuccess]
  }
}

