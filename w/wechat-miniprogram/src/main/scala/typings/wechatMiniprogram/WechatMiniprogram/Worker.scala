package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Worker extends js.Object {
  
  /** [Worker.onMessage(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/worker/Worker.onMessage.html)
    *
    * 监听主线程/Worker 线程向当前线程发送的消息的事件。 */
  def onMessage(/** 主线程/Worker 线程向当前线程发送的消息的事件的回调函数 */
  callback: WorkerOnMessageCallback): Unit = js.native
  
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
  message: IAnyObject): Unit = js.native
  
  /** [Worker.terminate()](https://developers.weixin.qq.com/miniprogram/dev/api/worker/Worker.terminate.html)
    *
    * 结束当前 Worker 线程。仅限在主线程 worker 对象上调用。 */
  def terminate(): Unit = js.native
}
object Worker {
  
  @scala.inline
  def apply(onMessage: WorkerOnMessageCallback => Unit, postMessage: IAnyObject => Unit, terminate: () => Unit): Worker = {
    val __obj = js.Dynamic.literal(onMessage = js.Any.fromFunction1(onMessage), postMessage = js.Any.fromFunction1(postMessage), terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[Worker]
  }
  
  @scala.inline
  implicit class WorkerOps[Self <: Worker] (val x: Self) extends AnyVal {
    
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
    def setOnMessage(value: WorkerOnMessageCallback => Unit): Self = this.set("onMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPostMessage(value: IAnyObject => Unit): Self = this.set("postMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTerminate(value: () => Unit): Self = this.set("terminate", js.Any.fromFunction0(value))
  }
}
