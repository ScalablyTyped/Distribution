package typings.xrm.Xrm.Controls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for UI elements with labels.
  */
trait UiLabelElement extends StObject {
  
  /**
    * Gets the label.
    * @returns The label.
    */
  def getLabel(): String
  
  /**
    * Sets the label.
    * @param label The label.
    */
  def setLabel(label: String): Unit
}
object UiLabelElement {
  
  inline def apply(getLabel: () => String, setLabel: String => Unit): UiLabelElement = {
    val __obj = js.Dynamic.literal(getLabel = js.Any.fromFunction0(getLabel), setLabel = js.Any.fromFunction1(setLabel))
    __obj.asInstanceOf[UiLabelElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UiLabelElement] (val x: Self) extends AnyVal {
    
    inline def setGetLabel(value: () => String): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
    
    inline def setSetLabel(value: String => Unit): Self = StObject.set(x, "setLabel", js.Any.fromFunction1(value))
  }
}
