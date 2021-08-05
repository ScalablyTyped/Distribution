package typings.wordpressComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandleFocusOutside extends StObject {
  
  def handleFocusOutside(): Unit
}
object HandleFocusOutside {
  
  inline def apply(handleFocusOutside: () => Unit): HandleFocusOutside = {
    val __obj = js.Dynamic.literal(handleFocusOutside = js.Any.fromFunction0(handleFocusOutside))
    __obj.asInstanceOf[HandleFocusOutside]
  }
  
  extension [Self <: HandleFocusOutside](x: Self) {
    
    inline def setHandleFocusOutside(value: () => Unit): Self = StObject.set(x, "handleFocusOutside", js.Any.fromFunction0(value))
  }
}
