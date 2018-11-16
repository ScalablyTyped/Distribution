package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region 设备API列表
// 设备-----系统信息

trait SystemInfo extends js.Object {
  /** 客户端基础库版本 */
  var SDKVersion: java.lang.String
  /** 手机品牌 */
  var brand: java.lang.String
  /** 用户字体大小设置。以“我-设置-通用-字体大小”中的设置为准，单位 px。 */
  var fontSizeSetting: scala.Double
  /** 微信设置的语言 */
  var language: java.lang.String
  /** 手机型号 */
  var model: java.lang.String
  /** 设备像素比 */
  var pixelRatio: scala.Double
  /** 客户端平台 */
  var platform: java.lang.String
  /** 屏幕高度 */
  var screenHeight: scala.Double
  /** 屏幕宽度 */
  var screenWidth: scala.Double
  /** 状态栏的高度 */
  var statusBarHeight: scala.Double
  /** 操作系统版本 */
  var system: java.lang.String
  /** 微信版本号 */
  var version: java.lang.String
  /** 窗口高度 */
  var windowHeight: scala.Double
  /** 窗口宽度 */
  var windowWidth: scala.Double
}

