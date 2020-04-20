package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SystemInfo extends js.Object {
  /** 微信设置的语言 */
  var language: String
  /** 手机型号 */
  var model: String
  /** 设备像素比 */
  var pixelRatio: Double
  /** 微信版本号 */
  var version: String
  /** 窗口高度 */
  var windowHeight: Double
  /** 窗口宽度 */
  var windowWidth: Double
}

object SystemInfo {
  @scala.inline
  def apply(
    language: String,
    model: String,
    pixelRatio: Double,
    version: String,
    windowHeight: Double,
    windowWidth: Double
  ): SystemInfo = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfo]
  }
}

