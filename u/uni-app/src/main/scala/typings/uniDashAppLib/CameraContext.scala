package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraContext extends js.Object {
  /**
    * 开始录像
    */
  def startRecord(): scala.Unit = js.native
  def startRecord(options: CameraContextStartRecordOptions): scala.Unit = js.native
  /**
    * 结束录像，成功则返回封面与视频
    */
  def stopRecord(): scala.Unit = js.native
  def stopRecord(options: CameraContextStopRecordOptions): scala.Unit = js.native
  /**
    * 拍照，可指定质量，成功则返回图片
    */
  def takePhoto(): scala.Unit = js.native
  def takePhoto(options: CameraContextTakePhotoOptions): scala.Unit = js.native
}

