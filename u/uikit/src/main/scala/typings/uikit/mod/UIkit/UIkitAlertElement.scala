package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitAlertElement extends StObject {
  
  def close(): Unit
}
object UIkitAlertElement {
  
  inline def apply(close: () => Unit): UIkitAlertElement = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[UIkitAlertElement]
  }
  
  extension [Self <: UIkitAlertElement](x: Self) {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
  }
}
