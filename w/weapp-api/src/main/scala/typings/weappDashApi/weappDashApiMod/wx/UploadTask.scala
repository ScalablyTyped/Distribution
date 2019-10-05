package typings.weappDashApi.weappDashApiMod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 上传
/**
  * 一个可以监听上传进度变化事件，以及取消上传任务的对象
  */
trait UploadTask extends js.Object {
  //  中断上传任务
  def abort(): Unit
  //  取消监听 HTTP Response Header 事件
  def offHeadersReceived(callback: DataResponseCallback): Unit
  //  取消监听上传进度变化事件
  def offProgressUpdate(callback: js.Function1[/* res */ OnProgressCallbackOptions, js.Object]): Unit
  //  监听 HTTP Response Header 事件。会比请求完成事件更早
  def onHeadersReceived(callback: DataResponseCallback): Unit
  //  上传进度变化事件的回调函数
  def onProgressUpdate(callback: js.Function1[/* res */ OnProgressCallbackOptions, js.Object]): Unit
}

object UploadTask {
  @scala.inline
  def apply(
    abort: () => Unit,
    offHeadersReceived: DataResponseCallback => Unit,
    offProgressUpdate: js.Function1[/* res */ OnProgressCallbackOptions, js.Object] => Unit,
    onHeadersReceived: DataResponseCallback => Unit,
    onProgressUpdate: js.Function1[/* res */ OnProgressCallbackOptions, js.Object] => Unit
  ): UploadTask = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), offHeadersReceived = js.Any.fromFunction1(offHeadersReceived), offProgressUpdate = js.Any.fromFunction1(offProgressUpdate), onHeadersReceived = js.Any.fromFunction1(onHeadersReceived), onProgressUpdate = js.Any.fromFunction1(onProgressUpdate))
  
    __obj.asInstanceOf[UploadTask]
  }
}

