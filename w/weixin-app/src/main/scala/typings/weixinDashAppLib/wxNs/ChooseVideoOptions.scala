package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 媒体-----视频
trait ChooseVideoOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 前置或者后置摄像头，默认为前后都有，即：['front', 'back'] */
  var camera: js.UndefOr[CameraDevice] = js.undefined
  /** 是否压缩所选的视频源文件，默认值为true，需要压缩 */
  var compressed: js.UndefOr[scala.Boolean] = js.undefined
  /** 拍摄视频最长拍摄时间，单位秒。最长支持60秒 */
  var maxDuration: js.UndefOr[scala.Double] = js.undefined
  /** album 从相册选视频，camera 使用相机拍摄，默认为：['album', 'camera'] */
  var sourceType: js.UndefOr[js.Array[VideoSourceType]] = js.undefined
  /** 接口调用成功，返回视频文件的临时文件路径，详见返回参数说明 */
  @JSName("success")
  var success_ChooseVideoOptions: js.UndefOr[js.Function1[/* res */ VideoData, scala.Unit]] = js.undefined
}

