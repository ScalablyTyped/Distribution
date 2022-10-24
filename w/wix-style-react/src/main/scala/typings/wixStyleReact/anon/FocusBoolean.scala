package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusBoolean extends StObject {
  
  var focus: Boolean
}
object FocusBoolean {
  
  inline def apply(focus: Boolean): FocusBoolean = {
    val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusBoolean]
  }
  
  extension [Self <: FocusBoolean](x: Self) {
    
    inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
  }
}
