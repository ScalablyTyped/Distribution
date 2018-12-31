package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewImageOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 当前显示图片的链接，不填则默认为 urls 的第一张 */
  var current: js.UndefOr[java.lang.String] = js.undefined
  /** 需要预览的图片链接列表 */
  var urls: js.Array[java.lang.String]
}

