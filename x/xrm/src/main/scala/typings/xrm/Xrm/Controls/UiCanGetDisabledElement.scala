package typings.xrm.Xrm.Controls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for UI elements which can have the disabled value read.
  */
trait UiCanGetDisabledElement extends StObject {
  
  /**
    * Gets a boolean value, indicating whether the control is disabled.
    * @returns true if it is disabled, otherwise false.
    */
  def getDisabled(): Boolean
}
object UiCanGetDisabledElement {
  
  inline def apply(getDisabled: () => Boolean): UiCanGetDisabledElement = {
    val __obj = js.Dynamic.literal(getDisabled = js.Any.fromFunction0(getDisabled))
    __obj.asInstanceOf[UiCanGetDisabledElement]
  }
  
  extension [Self <: UiCanGetDisabledElement](x: Self) {
    
    inline def setGetDisabled(value: () => Boolean): Self = StObject.set(x, "getDisabled", js.Any.fromFunction0(value))
  }
}
