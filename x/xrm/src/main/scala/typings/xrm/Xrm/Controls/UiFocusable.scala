package typings.xrm.Xrm.Controls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for focusable UI elements.
  */
trait UiFocusable extends StObject {
  
  /**
    * Sets focus on the element.
    */
  def setFocus(): Unit
}
object UiFocusable {
  
  inline def apply(setFocus: () => Unit): UiFocusable = {
    val __obj = js.Dynamic.literal(setFocus = js.Any.fromFunction0(setFocus))
    __obj.asInstanceOf[UiFocusable]
  }
  
  extension [Self <: UiFocusable](x: Self) {
    
    inline def setSetFocus(value: () => Unit): Self = StObject.set(x, "setFocus", js.Any.fromFunction0(value))
  }
}
