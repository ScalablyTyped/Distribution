package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 上传
/**
  * 一个可以监听上传进度变化事件，以及取消上传任务的对象
  */
@js.native
trait UploadTask extends js.Object {
  
  //  中断上传任务
  def abort(): Unit = js.native
  
  //  取消监听 HTTP Response Header 事件
  def offHeadersReceived(callback: DataResponseCallback): Unit = js.native
  
  //  取消监听上传进度变化事件
  def offProgressUpdate(callback: js.Function1[/* res */ OnProgressCallbackOptions, js.Object]): Unit = js.native
  
  //  监听 HTTP Response Header 事件。会比请求完成事件更早
  def onHeadersReceived(callback: DataResponseCallback): Unit = js.native
  
  //  上传进度变化事件的回调函数
  def onProgressUpdate(callback: js.Function1[/* res */ OnProgressCallbackOptions, js.Object]): Unit = js.native
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
  
  @scala.inline
  implicit class UploadTaskOps[Self <: UploadTask] (val x: Self) extends AnyVal {
    
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
    def setOffHeadersReceived(value: DataResponseCallback => Unit): Self = this.set("offHeadersReceived", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOffProgressUpdate(value: js.Function1[/* res */ OnProgressCallbackOptions, js.Object] => Unit): Self = this.set("offProgressUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnHeadersReceived(value: DataResponseCallback => Unit): Self = this.set("onHeadersReceived", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnProgressUpdate(value: js.Function1[/* res */ OnProgressCallbackOptions, js.Object] => Unit): Self = this.set("onProgressUpdate", js.Any.fromFunction1(value))
  }
}
