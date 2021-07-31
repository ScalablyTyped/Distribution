package typings.wordpressComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandleFocusOutside extends StObject {
  
  def handleFocusOutside(): Unit
}
object HandleFocusOutside {
  
  @scala.inline
  def apply(handleFocusOutside: () => Unit): HandleFocusOutside = {
    val __obj = js.Dynamic.literal(handleFocusOutside = js.Any.fromFunction0(handleFocusOutside))
    __obj.asInstanceOf[HandleFocusOutside]
  }
  
  @scala.inline
  implicit class HandleFocusOutsideMutableBuilder[Self <: HandleFocusOutside] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandleFocusOutside(value: () => Unit): Self = StObject.set(x, "handleFocusOutside", js.Any.fromFunction0(value))
  }
}
