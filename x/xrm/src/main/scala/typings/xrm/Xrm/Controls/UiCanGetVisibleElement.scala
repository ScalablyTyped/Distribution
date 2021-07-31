package typings.xrm.Xrm.Controls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for UI elements which can have the visibility value read.
  */
trait UiCanGetVisibleElement extends StObject {
  
  /**
    * Gets the visibility state.
    * @returns true if the tab is visible, otherwise false.
    */
  def getVisible(): Boolean
}
object UiCanGetVisibleElement {
  
  @scala.inline
  def apply(getVisible: () => Boolean): UiCanGetVisibleElement = {
    val __obj = js.Dynamic.literal(getVisible = js.Any.fromFunction0(getVisible))
    __obj.asInstanceOf[UiCanGetVisibleElement]
  }
  
  @scala.inline
  implicit class UiCanGetVisibleElementMutableBuilder[Self <: UiCanGetVisibleElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetVisible(value: () => Boolean): Self = StObject.set(x, "getVisible", js.Any.fromFunction0(value))
  }
}
