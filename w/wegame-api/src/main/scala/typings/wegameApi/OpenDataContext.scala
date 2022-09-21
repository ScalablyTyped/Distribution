package typings.wegameApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenDataContext extends StObject {
  
  /**
    * 开放数据域和主域共享的 sharedCanvas，注意在开放数据域内时getContext只能使用2d模式
    */
  var canvas: Canvas
  
  /**
    * 向开放数据域发送消息
    * @param message 要发送的消息，message 中及嵌套对象中 key 的 value 只能是 primitive value。即 number、string、boolean、null、undefined。
    */
  def postMessage(message: Any): Unit
}
object OpenDataContext {
  
  inline def apply(canvas: Canvas, postMessage: Any => Unit): OpenDataContext = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], postMessage = js.Any.fromFunction1(postMessage))
    __obj.asInstanceOf[OpenDataContext]
  }
  
  extension [Self <: OpenDataContext](x: Self) {
    
    inline def setCanvas(value: Canvas): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setPostMessage(value: Any => Unit): Self = StObject.set(x, "postMessage", js.Any.fromFunction1(value))
  }
}
