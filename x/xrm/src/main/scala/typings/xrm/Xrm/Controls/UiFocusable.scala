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
  
  @scala.inline
  def apply(setFocus: () => Unit): UiFocusable = {
    val __obj = js.Dynamic.literal(setFocus = js.Any.fromFunction0(setFocus))
    __obj.asInstanceOf[UiFocusable]
  }
  
  @scala.inline
  implicit class UiFocusableMutableBuilder[Self <: UiFocusable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetFocus(value: () => Unit): Self = StObject.set(x, "setFocus", js.Any.fromFunction0(value))
  }
}
