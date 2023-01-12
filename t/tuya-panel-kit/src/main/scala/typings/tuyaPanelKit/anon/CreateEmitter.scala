package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.mod.AnyFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEmitter extends StObject {
  
  def addListener(listener: AnyFunction): Unit
  
  def createEmitter(): Unit
  
  /**
    * 跳转面板, 等同于jumpSubPage, 只是传参形式的区别
    * @param uiId uiid
    * @param props 携带参数
    */
  def pushWithUiID(uiId: String, props: Any): Unit
  
  def registerEventListener(): Unit
  
  def removeEmitter(): Unit
  
  def sendEvent(props: Any): Unit
}
object CreateEmitter {
  
  inline def apply(
    addListener: AnyFunction => Unit,
    createEmitter: () => Unit,
    pushWithUiID: (String, Any) => Unit,
    registerEventListener: () => Unit,
    removeEmitter: () => Unit,
    sendEvent: Any => Unit
  ): CreateEmitter = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), createEmitter = js.Any.fromFunction0(createEmitter), pushWithUiID = js.Any.fromFunction2(pushWithUiID), registerEventListener = js.Any.fromFunction0(registerEventListener), removeEmitter = js.Any.fromFunction0(removeEmitter), sendEvent = js.Any.fromFunction1(sendEvent))
    __obj.asInstanceOf[CreateEmitter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateEmitter] (val x: Self) extends AnyVal {
    
    inline def setAddListener(value: AnyFunction => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction1(value))
    
    inline def setCreateEmitter(value: () => Unit): Self = StObject.set(x, "createEmitter", js.Any.fromFunction0(value))
    
    inline def setPushWithUiID(value: (String, Any) => Unit): Self = StObject.set(x, "pushWithUiID", js.Any.fromFunction2(value))
    
    inline def setRegisterEventListener(value: () => Unit): Self = StObject.set(x, "registerEventListener", js.Any.fromFunction0(value))
    
    inline def setRemoveEmitter(value: () => Unit): Self = StObject.set(x, "removeEmitter", js.Any.fromFunction0(value))
    
    inline def setSendEvent(value: Any => Unit): Self = StObject.set(x, "sendEvent", js.Any.fromFunction1(value))
  }
}
