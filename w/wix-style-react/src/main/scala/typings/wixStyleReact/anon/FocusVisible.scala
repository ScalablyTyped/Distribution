package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusVisible extends StObject {
  
  var focus: Boolean
  
  var focusVisible: Boolean
}
object FocusVisible {
  
  inline def apply(focus: Boolean, focusVisible: Boolean): FocusVisible = {
    val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusVisible]
  }
  
  extension [Self <: FocusVisible](x: Self) {
    
    inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
  }
}
