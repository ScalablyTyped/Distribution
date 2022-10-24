package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TitleBarDisplayTitleBarVisible extends StObject {
  
  var titleBarDisplay: Boolean
  
  var titleBarVisible: Boolean
}
object TitleBarDisplayTitleBarVisible {
  
  inline def apply(titleBarDisplay: Boolean, titleBarVisible: Boolean): TitleBarDisplayTitleBarVisible = {
    val __obj = js.Dynamic.literal(titleBarDisplay = titleBarDisplay.asInstanceOf[js.Any], titleBarVisible = titleBarVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleBarDisplayTitleBarVisible]
  }
  
  extension [Self <: TitleBarDisplayTitleBarVisible](x: Self) {
    
    inline def setTitleBarDisplay(value: Boolean): Self = StObject.set(x, "titleBarDisplay", value.asInstanceOf[js.Any])
    
    inline def setTitleBarVisible(value: Boolean): Self = StObject.set(x, "titleBarVisible", value.asInstanceOf[js.Any])
  }
}
