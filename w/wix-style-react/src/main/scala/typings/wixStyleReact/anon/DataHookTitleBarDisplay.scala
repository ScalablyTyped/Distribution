package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataHookTitleBarDisplay extends StObject {
  
  var dataHook: js.UndefOr[String] = js.undefined
  
  var titleBarDisplay: js.UndefOr[Boolean] = js.undefined
  
  var titleBarVisible: js.UndefOr[Boolean] = js.undefined
}
object DataHookTitleBarDisplay {
  
  inline def apply(): DataHookTitleBarDisplay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataHookTitleBarDisplay]
  }
  
  extension [Self <: DataHookTitleBarDisplay](x: Self) {
    
    inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    
    inline def setTitleBarDisplay(value: Boolean): Self = StObject.set(x, "titleBarDisplay", value.asInstanceOf[js.Any])
    
    inline def setTitleBarDisplayUndefined: Self = StObject.set(x, "titleBarDisplay", js.undefined)
    
    inline def setTitleBarVisible(value: Boolean): Self = StObject.set(x, "titleBarVisible", value.asInstanceOf[js.Any])
    
    inline def setTitleBarVisibleUndefined: Self = StObject.set(x, "titleBarVisible", js.undefined)
  }
}
