package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenDataContext extends js.Object {
  
  /**
    * 开放数据域和主域共享的 sharedCanvas，注意在开放数据域内时getContext只能使用2d模式
    */
  var canvas: Canvas = js.native
  
  /**
    * 向开放数据域发送消息
    * @param message 要发送的消息，message 中及嵌套对象中 key 的 value 只能是 primitive value。即 number、string、boolean、null、undefined。
    */
  def postMessage(message: js.Any): Unit = js.native
}
object OpenDataContext {
  
  @scala.inline
  def apply(canvas: Canvas, postMessage: js.Any => Unit): OpenDataContext = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], postMessage = js.Any.fromFunction1(postMessage))
    __obj.asInstanceOf[OpenDataContext]
  }
  
  @scala.inline
  implicit class OpenDataContextOps[Self <: OpenDataContext] (val x: Self) extends AnyVal {
    
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
    def setCanvas(value: Canvas): Self = this.set("canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostMessage(value: js.Any => Unit): Self = this.set("postMessage", js.Any.fromFunction1(value))
  }
}
