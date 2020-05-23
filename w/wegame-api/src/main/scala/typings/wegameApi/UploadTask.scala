package typings.wegameApi

import typings.wegameApi.anon.TotalBytesExpectedToSend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadTask extends js.Object {
  /**
    * 中断上传任务
    */
  def abort(): Unit
  /**
    * 监听上传进度变化事件
    * @param callback.res.progress 上传进度百分比
    * @param callback.res.totalBytesSent 已经上传的数据长度，单位 Bytes
    * @param callback.res.totalBytesExpectedToSend 预期需要上传的数据总长度，单位 Bytes
    */
  def onProgressUpdate(callback: js.Function1[/* res */ TotalBytesExpectedToSend, Unit]): Unit
}

object UploadTask {
  @scala.inline
  def apply(
    abort: () => Unit,
    onProgressUpdate: js.Function1[/* res */ TotalBytesExpectedToSend, Unit] => Unit
  ): UploadTask = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), onProgressUpdate = js.Any.fromFunction1(onProgressUpdate))
    __obj.asInstanceOf[UploadTask]
  }
}

