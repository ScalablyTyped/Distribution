package typings.thunderbirdWebextBrowser.messenger.browserAction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnClickData extends StObject {
  
  /** An integer value of button by which menu item was clicked. */
  var button: js.UndefOr[Double] = js.undefined
  
  /**
    * An array of keyboard modifiers that were held while the menu item was
    * clicked.
    */
  var modifiers: js.Array[OnClickDataModifiers]
}
object OnClickData {
  
  inline def apply(modifiers: js.Array[OnClickDataModifiers]): OnClickData = {
    val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnClickData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnClickData] (val x: Self) extends AnyVal {
    
    inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setModifiers(value: js.Array[OnClickDataModifiers]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersVarargs(value: OnClickDataModifiers*): Self = StObject.set(x, "modifiers", js.Array(value*))
  }
}
