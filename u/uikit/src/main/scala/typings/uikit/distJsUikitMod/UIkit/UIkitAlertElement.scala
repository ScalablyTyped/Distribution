package typings.uikit.distJsUikitMod.UIkit

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UIkitAlertElement] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
  }
}
