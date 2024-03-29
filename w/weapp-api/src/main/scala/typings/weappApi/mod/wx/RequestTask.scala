package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 网络请求任务对象
  */
trait RequestTask extends StObject {
  
  //  中断请求任务
  def abort(): Unit
  
  //  取消监听 HTTP Response Header 事件
  def offHeadersReceived(callback: DataResponseCallback): Unit
  
  //  监听 HTTP Response Header 事件。会比请求完成事件更早
  def onHeadersReceived(callback: DataResponseCallback): Unit
}
object RequestTask {
  
  inline def apply(
    abort: () => Unit,
    offHeadersReceived: DataResponseCallback => Unit,
    onHeadersReceived: DataResponseCallback => Unit
  ): RequestTask = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), offHeadersReceived = js.Any.fromFunction1(offHeadersReceived), onHeadersReceived = js.Any.fromFunction1(onHeadersReceived))
    __obj.asInstanceOf[RequestTask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestTask] (val x: Self) extends AnyVal {
    
    inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    
    inline def setOffHeadersReceived(value: DataResponseCallback => Unit): Self = StObject.set(x, "offHeadersReceived", js.Any.fromFunction1(value))
    
    inline def setOnHeadersReceived(value: DataResponseCallback => Unit): Self = StObject.set(x, "onHeadersReceived", js.Any.fromFunction1(value))
  }
}
