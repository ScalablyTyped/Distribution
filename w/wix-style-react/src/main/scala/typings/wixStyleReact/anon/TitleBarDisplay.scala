package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TitleBarDisplay extends StObject {
  
  var dataHook: Any
  
  var titleBarDisplay: Any
  
  var titleBarVisible: Any
}
object TitleBarDisplay {
  
  inline def apply(dataHook: Any, titleBarDisplay: Any, titleBarVisible: Any): TitleBarDisplay = {
    val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], titleBarDisplay = titleBarDisplay.asInstanceOf[js.Any], titleBarVisible = titleBarVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleBarDisplay]
  }
  
  extension [Self <: TitleBarDisplay](x: Self) {
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setTitleBarDisplay(value: Any): Self = StObject.set(x, "titleBarDisplay", value.asInstanceOf[js.Any])
    
    inline def setTitleBarVisible(value: Any): Self = StObject.set(x, "titleBarVisible", value.asInstanceOf[js.Any])
  }
}
