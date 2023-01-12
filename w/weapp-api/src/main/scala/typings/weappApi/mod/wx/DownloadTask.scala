package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 一个可以监听下载进度变化事件，以及取消下载任务的对象
  */
trait DownloadTask extends StObject {
  
  //  中断下载任务
  def abort(): Unit
  
  //  取消监听 HTTP Response Header 事件
  def offHeadersReceived(callback: DataResponseCallback): Unit
  
  //  取消监听下载进度变化事件
  def offProgressUpdate(callback: js.Function1[/* res */ OnProgressCallbackOptions, js.Object]): Unit
  
  //  监听 HTTP Response Header 事件。会比请求完成事件更早
  def onHeadersReceived(callback: DataResponseCallback): Unit
  
  //  下载进度变化事件的回调函数
  def onProgressUpdate(callback: js.Function1[/* res */ OnProgressCallbackOptions, js.Object]): Unit
}
object DownloadTask {
  
  inline def apply(
    abort: () => Unit,
    offHeadersReceived: DataResponseCallback => Unit,
    offProgressUpdate: js.Function1[/* res */ OnProgressCallbackOptions, js.Object] => Unit,
    onHeadersReceived: DataResponseCallback => Unit,
    onProgressUpdate: js.Function1[/* res */ OnProgressCallbackOptions, js.Object] => Unit
  ): DownloadTask = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), offHeadersReceived = js.Any.fromFunction1(offHeadersReceived), offProgressUpdate = js.Any.fromFunction1(offProgressUpdate), onHeadersReceived = js.Any.fromFunction1(onHeadersReceived), onProgressUpdate = js.Any.fromFunction1(onProgressUpdate))
    __obj.asInstanceOf[DownloadTask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DownloadTask] (val x: Self) extends AnyVal {
    
    inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    
    inline def setOffHeadersReceived(value: DataResponseCallback => Unit): Self = StObject.set(x, "offHeadersReceived", js.Any.fromFunction1(value))
    
    inline def setOffProgressUpdate(value: js.Function1[/* res */ OnProgressCallbackOptions, js.Object] => Unit): Self = StObject.set(x, "offProgressUpdate", js.Any.fromFunction1(value))
    
    inline def setOnHeadersReceived(value: DataResponseCallback => Unit): Self = StObject.set(x, "onHeadersReceived", js.Any.fromFunction1(value))
    
    inline def setOnProgressUpdate(value: js.Function1[/* res */ OnProgressCallbackOptions, js.Object] => Unit): Self = StObject.set(x, "onProgressUpdate", js.Any.fromFunction1(value))
  }
}
