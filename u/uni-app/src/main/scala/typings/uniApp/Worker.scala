package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Worker extends StObject {
  
  /**
    * 监听 Worker 线程向当前线程发送的消息
    */
  def onMessage(): Unit = js.native
  def onMessage(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 向 Worker 线程发送的消息。
    */
  def postMessage(): Unit = js.native
  def postMessage(message: js.Any): Unit = js.native
  
  /**
    * 结束当前 Worker 线程，仅限在主线程 Worker 实例上调用。
    */
  def terminate(): Unit = js.native
}
