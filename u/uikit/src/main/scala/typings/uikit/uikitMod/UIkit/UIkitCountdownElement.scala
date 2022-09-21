package typings.uikit.uikitMod.UIkit

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
  
  extension [Self <: UIkitCountdownElement](x: Self) {
    
    inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
