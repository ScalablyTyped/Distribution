package typings.xrm.Xrm.Controls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for UI elements which can have the visibility value updated.
  */
trait UiCanSetVisibleElement extends StObject {
  
  /**
    * Sets the visibility state.
    * @param visible true to show, false to hide.
    */
  def setVisible(visible: Boolean): Unit
}
object UiCanSetVisibleElement {
  
  @scala.inline
  def apply(setVisible: Boolean => Unit): UiCanSetVisibleElement = {
    val __obj = js.Dynamic.literal(setVisible = js.Any.fromFunction1(setVisible))
    __obj.asInstanceOf[UiCanSetVisibleElement]
  }
  
  @scala.inline
  implicit class UiCanSetVisibleElementMutableBuilder[Self <: UiCanSetVisibleElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetVisible(value: Boolean => Unit): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
  }
}
