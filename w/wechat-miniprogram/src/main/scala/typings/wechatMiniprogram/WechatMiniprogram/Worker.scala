package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Worker extends StObject {
  
  /** [Worker.onMessage(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/worker/Worker.onMessage.html)
    *
    * 监听主线程/Worker 线程向当前线程发送的消息的事件。 */
  def onMessage(/** 主线程/Worker 线程向当前线程发送的消息的事件的回调函数 */
  callback: WorkerOnMessageCallback): Unit
  
  /** [Worker.postMessage(Object message)](https://developers.weixin.qq.com/miniprogram/dev/api/worker/Worker.postMessage.html)
  *
  * 向主线程/Worker 线程发送的消息。
  *
  * **示例代码**
  *
  *
  * worker 线程中
  * ```js
  worker.postMessage({
    msg: 'hello from worker'
  })
  ```
  *
  * 主线程中
  * ```js
  const worker = wx.createWorker('workers/request/index.js')
  worker.postMessage({
    msg: 'hello from main'
  })
  ``` */
  def postMessage(/** 需要发送的消息，必须是一个可序列化的 JavaScript key-value 形式的对象。 */
  message: IAnyObject): Unit
  
  /** [Worker.terminate()](https://developers.weixin.qq.com/miniprogram/dev/api/worker/Worker.terminate.html)
    *
    * 结束当前 Worker 线程。仅限在主线程 worker 对象上调用。 */
  def terminate(): Unit
}
object Worker {
  
  @scala.inline
  def apply(onMessage: WorkerOnMessageCallback => Unit, postMessage: IAnyObject => Unit, terminate: () => Unit): Worker = {
    val __obj = js.Dynamic.literal(onMessage = js.Any.fromFunction1(onMessage), postMessage = js.Any.fromFunction1(postMessage), terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[Worker]
  }
  
  @scala.inline
  implicit class WorkerMutableBuilder[Self <: Worker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnMessage(value: WorkerOnMessageCallback => Unit): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPostMessage(value: IAnyObject => Unit): Self = StObject.set(x, "postMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTerminate(value: () => Unit): Self = StObject.set(x, "terminate", js.Any.fromFunction0(value))
  }
}
