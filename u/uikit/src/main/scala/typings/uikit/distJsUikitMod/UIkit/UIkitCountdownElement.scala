package typings.uikit.distJsUikitMod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitCountdownElement extends StObject {
  
  def start(): Unit
  
  def stop(): Unit
}
object UIkitCountdownElement {
  
  inline def apply(start: () => Unit, stop: () => Unit): UIkitCountdownElement = {
    val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[UIkitCountdownElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UIkitCountdownElement] (val x: Self) extends AnyVal {
    
    inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
