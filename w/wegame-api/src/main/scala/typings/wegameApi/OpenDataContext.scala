package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenDataContext extends js.Object {
  /**
    * 开放数据域和主域共享的 sharedCanvas，注意在开放数据域内时getContext只能使用2d模式
    */
  var canvas: Canvas
  /**
    * 向开放数据域发送消息
    * @param message 要发送的消息，message 中及嵌套对象中 key 的 value 只能是 primitive value。即 number、string、boolean、null、undefined。
    */
  def postMessage(message: js.Any): Unit
}

object OpenDataContext {
  @scala.inline
  def apply(canvas: Canvas, postMessage: js.Any => Unit): OpenDataContext = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], postMessage = js.Any.fromFunction1(postMessage))
    __obj.asInstanceOf[OpenDataContext]
  }
}

