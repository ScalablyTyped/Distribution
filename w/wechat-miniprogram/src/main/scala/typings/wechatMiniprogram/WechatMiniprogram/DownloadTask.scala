package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadTask extends js.Object {
  /** [DownloadTask.abort()](https://developers.weixin.qq.com/miniprogram/dev/api/network/download/DownloadTask.abort.html)
    *
    * 中断下载任务
    *
    * 最低基础库： `1.4.0` */
  def abort(): Unit = js.native
  /** [DownloadTask.offHeadersReceived(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/download/DownloadTask.offHeadersReceived.html)
    *
    * 取消监听 HTTP Response Header 事件
    *
    * 最低基础库： `2.1.0` */
  def offHeadersReceived(/** HTTP Response Header 事件的回调函数 */
  callback: OffHeadersReceivedCallback): Unit = js.native
  /** [DownloadTask.offProgressUpdate(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/download/DownloadTask.offProgressUpdate.html)
    *
    * 取消监听下载进度变化事件
    *
    * 最低基础库： `2.1.0` */
  def offProgressUpdate(/** 下载进度变化事件的回调函数 */
  callback: OffProgressUpdateCallback): Unit = js.native
  /** [DownloadTask.onHeadersReceived(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/download/DownloadTask.onHeadersReceived.html)
    *
    * 监听 HTTP Response Header 事件。会比请求完成事件更早
    *
    * 最低基础库： `2.1.0` */
  def onHeadersReceived(/** HTTP Response Header 事件的回调函数 */
  callback: OnHeadersReceivedCallback): Unit = js.native
  /** [DownloadTask.onProgressUpdate(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/download/DownloadTask.onProgressUpdate.html)
    *
    * 监听下载进度变化事件
    *
    * 最低基础库： `1.4.0` */
  def onProgressUpdate(/** 下载进度变化事件的回调函数 */
  callback: DownloadTaskOnProgressUpdateCallback): Unit = js.native
}

object DownloadTask {
  @scala.inline
  def apply(
    abort: () => Unit,
    offHeadersReceived: OffHeadersReceivedCallback => Unit,
    offProgressUpdate: OffProgressUpdateCallback => Unit,
    onHeadersReceived: OnHeadersReceivedCallback => Unit,
    onProgressUpdate: DownloadTaskOnProgressUpdateCallback => Unit
  ): DownloadTask = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), offHeadersReceived = js.Any.fromFunction1(offHeadersReceived), offProgressUpdate = js.Any.fromFunction1(offProgressUpdate), onHeadersReceived = js.Any.fromFunction1(onHeadersReceived), onProgressUpdate = js.Any.fromFunction1(onProgressUpdate))
    __obj.asInstanceOf[DownloadTask]
  }
  @scala.inline
  implicit class DownloadTaskOps[Self <: DownloadTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbort(value: () => Unit): Self = this.set("abort", js.Any.fromFunction0(value))
    @scala.inline
    def setOffHeadersReceived(value: OffHeadersReceivedCallback => Unit): Self = this.set("offHeadersReceived", js.Any.fromFunction1(value))
    @scala.inline
    def setOffProgressUpdate(value: OffProgressUpdateCallback => Unit): Self = this.set("offProgressUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def setOnHeadersReceived(value: OnHeadersReceivedCallback => Unit): Self = this.set("onHeadersReceived", js.Any.fromFunction1(value))
    @scala.inline
    def setOnProgressUpdate(value: DownloadTaskOnProgressUpdateCallback => Unit): Self = this.set("onProgressUpdate", js.Any.fromFunction1(value))
  }
  
}

