package typings.wegameApi

import typings.wegameApi.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WxWorker extends StObject {
  
  /**
    * 监听接收主线程/Worker 线程向当前线程发送的消息
    * @param callback.res.message 接收主线程/Worker 线程向当前线程发送的消息
    */
  def onMessage(callback: js.Function1[/* res */ Message, Unit]): Unit = js.native
  
  /**
    * 向主线程或Worker线程发送的消息。
    * @param message 需要发送的消息，必须是一个可序列化的 JavaScript 对象。
    */
  def postMessage(message: js.Any): Unit = js.native
  
  /**
    * 结束当前 worker 线程，仅限在主线程 worker 对象上调用。
    */
  def terminate(): Unit = js.native
}
object WxWorker {
  
  @scala.inline
  def apply(
    onMessage: js.Function1[/* res */ Message, Unit] => Unit,
    postMessage: js.Any => Unit,
    terminate: () => Unit
  ): WxWorker = {
    val __obj = js.Dynamic.literal(onMessage = js.Any.fromFunction1(onMessage), postMessage = js.Any.fromFunction1(postMessage), terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[WxWorker]
  }
  
  @scala.inline
  implicit class WxWorkerMutableBuilder[Self <: WxWorker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnMessage(value: js.Function1[/* res */ Message, Unit] => Unit): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPostMessage(value: js.Any => Unit): Self = StObject.set(x, "postMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTerminate(value: () => Unit): Self = StObject.set(x, "terminate", js.Any.fromFunction0(value))
  }
}
