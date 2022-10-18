package typings.uikit.distJsUikitMod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitNotificationElement extends StObject {
  
  def close(immediate: Boolean): Unit
}
object UIkitNotificationElement {
  
  inline def apply(close: Boolean => Unit): UIkitNotificationElement = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close))
    __obj.asInstanceOf[UIkitNotificationElement]
  }
  
  extension [Self <: UIkitNotificationElement](x: Self) {
    
    inline def setClose(value: Boolean => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
  }
}
