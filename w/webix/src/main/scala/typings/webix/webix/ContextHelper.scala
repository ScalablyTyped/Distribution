package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextHelper extends StObject {
  
  def attachTo(view: obj): Unit
  
  def getContext(): obj
  
  def setContext(context: obj): Unit
}
object ContextHelper {
  
  inline def apply(attachTo: obj => Unit, getContext: () => obj, setContext: obj => Unit): ContextHelper = {
    val __obj = js.Dynamic.literal(attachTo = js.Any.fromFunction1(attachTo), getContext = js.Any.fromFunction0(getContext), setContext = js.Any.fromFunction1(setContext))
    __obj.asInstanceOf[ContextHelper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContextHelper] (val x: Self) extends AnyVal {
    
    inline def setAttachTo(value: obj => Unit): Self = StObject.set(x, "attachTo", js.Any.fromFunction1(value))
    
    inline def setGetContext(value: () => obj): Self = StObject.set(x, "getContext", js.Any.fromFunction0(value))
    
    inline def setSetContext(value: obj => Unit): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
  }
}
