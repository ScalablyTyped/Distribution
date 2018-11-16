package typings
package weappDashApiLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PlayBackgroundAudioOptions extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.undefined
  /** 封面URL */
  var coverImgUrl: js.UndefOr[java.lang.String] = js.undefined
  /** 音乐链接 */
  var dataUrl: java.lang.String
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ResponseCallback] = js.undefined
  /** 音乐标题 */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

