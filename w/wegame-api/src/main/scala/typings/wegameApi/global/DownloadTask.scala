package typings.wegameApi.global

import typings.wegameApi.anon.Progress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DownloadTask")
@js.native
class DownloadTask ()
  extends typings.wegameApi.DownloadTask {
  /**
    * 中断下载任务
    */
  /* CompleteClass */
  override def abort(): Unit = js.native
  /**
    * 监听下载进度变化事件
    * @param res.progress 下载进度百分比，值为0至100
    * @param res.totalBytesWritten 已经下载的数据长度，单位 Bytes
    * @param res.totalBytesExpectedToWrite 预期需要下载的数据总长度，单位 Bytes
    */
  /* CompleteClass */
  override def onProgressUpdate(callback: js.Function1[/* res */ Progress, Unit]): Unit = js.native
}

