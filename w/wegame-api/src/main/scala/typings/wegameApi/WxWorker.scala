package typings.wegameApi

import typings.wegameApi.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WxWorker extends StObject {
  
  /**
    * 监听接收主线程/Worker 线程向当前线程发送的消息
    * @param callback.res.message 接收主线程/Worker 线程向当前线程发送的消息
    */
  def onMessage(callback: js.Function1[/* res */ Message, Unit]): Unit
  
  /**
    * 监听 worker线程被系统回收事件（当iOS系统资源紧张时，worker线程存在被系统回收的可能，开发者可监听此事件并重新创建一个worker）。仅限在主线程 worker 对象上调用。
    */
  def onProcessKilled(callback: js.Function0[Unit]): Unit
  
  /**
    * 向主线程或Worker线程发送的消息。
    * @param message 需要发送的消息，必须是一个可序列化的 JavaScript 对象。
    */
  def postMessage(message: Any): Unit
  
  /**
    * 结束当前 worker 线程，仅限在主线程 worker 对象上调用。
    */
  def terminate(): Unit
}
object WxWorker {
  
  inline def apply(
    onMessage: js.Function1[/* res */ Message, Unit] => Unit,
    onProcessKilled: js.Function0[Unit] => Unit,
    postMessage: Any => Unit,
    terminate: () => Unit
  ): WxWorker = {
    val __obj = js.Dynamic.literal(onMessage = js.Any.fromFunction1(onMessage), onProcessKilled = js.Any.fromFunction1(onProcessKilled), postMessage = js.Any.fromFunction1(postMessage), terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[WxWorker]
  }
  
  extension [Self <: WxWorker](x: Self) {
    
    inline def setOnMessage(value: js.Function1[/* res */ Message, Unit] => Unit): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
    
    inline def setOnProcessKilled(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onProcessKilled", js.Any.fromFunction1(value))
    
    inline def setPostMessage(value: Any => Unit): Self = StObject.set(x, "postMessage", js.Any.fromFunction1(value))
    
    inline def setTerminate(value: () => Unit): Self = StObject.set(x, "terminate", js.Any.fromFunction0(value))
  }
}
