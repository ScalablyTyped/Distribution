package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraContext extends js.Object {
  /** 开始录像 */
  def startRecord(options: StartRecordOptions): scala.Unit
  /** 结束录像，成功则返回封面与视频 */
  def stopRecord(options: StopRecordOptions): scala.Unit
  /** 拍照，可指定质量，成功则返回图片 */
  def takePhoto(options: TakePhotoOptions): scala.Unit
}

object CameraContext {
  @scala.inline
  def apply(
    startRecord: StartRecordOptions => scala.Unit,
    stopRecord: StopRecordOptions => scala.Unit,
    takePhoto: TakePhotoOptions => scala.Unit
  ): CameraContext = {
    val __obj = js.Dynamic.literal(startRecord = js.Any.fromFunction1(startRecord), stopRecord = js.Any.fromFunction1(stopRecord), takePhoto = js.Any.fromFunction1(takePhoto))
  
    __obj.asInstanceOf[CameraContext]
  }
}

