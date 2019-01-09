package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("UploadTask")
@js.native
class UploadTask () extends js.Object {
  /**
    * 中断上传任务
    */
  def abort(): scala.Unit = js.native
  /**
    * 监听上传进度变化事件
    * @param callback.res.progress 上传进度百分比
    * @param callback.res.totalBytesSent 已经上传的数据长度，单位 Bytes
    * @param callback.res.totalBytesExpectedToSend 预期需要上传的数据总长度，单位 Bytes
    */
  def onProgressUpdate(callback: js.Function1[/* res */ Anon_ProgressTotalBytesExpectedToSend, scala.Unit]): scala.Unit = js.native
}

