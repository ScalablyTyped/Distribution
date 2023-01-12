package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShortcutText extends StObject {
  
  var shortcutText: String
}
object IShortcutText {
  
  inline def apply(shortcutText: String): IShortcutText = {
    val __obj = js.Dynamic.literal(shortcutText = shortcutText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShortcutText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IShortcutText] (val x: Self) extends AnyVal {
    
    inline def setShortcutText(value: String): Self = StObject.set(x, "shortcutText", value.asInstanceOf[js.Any])
  }
}
