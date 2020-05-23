package typings.wegameApi.global

import typings.wegameApi.anon.TotalBytesExpectedToSend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("UploadTask")
@js.native
class UploadTask ()
  extends typings.wegameApi.UploadTask {
  /**
    * 中断上传任务
    */
  /* CompleteClass */
  override def abort(): Unit = js.native
  /**
    * 监听上传进度变化事件
    * @param callback.res.progress 上传进度百分比
    * @param callback.res.totalBytesSent 已经上传的数据长度，单位 Bytes
    * @param callback.res.totalBytesExpectedToSend 预期需要上传的数据总长度，单位 Bytes
    */
  /* CompleteClass */
  override def onProgressUpdate(callback: js.Function1[/* res */ TotalBytesExpectedToSend, Unit]): Unit = js.native
}

