package typings.wixStyleReact.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TitleBarVisible extends StObject {
  
  var dataHook: Requireable[String]
  
  var titleBarDisplay: Requireable[Boolean]
  
  var titleBarVisible: Requireable[Boolean]
}
object TitleBarVisible {
  
  inline def apply(
    dataHook: Requireable[String],
    titleBarDisplay: Requireable[Boolean],
    titleBarVisible: Requireable[Boolean]
  ): TitleBarVisible = {
    val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], titleBarDisplay = titleBarDisplay.asInstanceOf[js.Any], titleBarVisible = titleBarVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleBarVisible]
  }
  
  extension [Self <: TitleBarVisible](x: Self) {
    
    inline def setDataHook(value: Requireable[String]): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setTitleBarDisplay(value: Requireable[Boolean]): Self = StObject.set(x, "titleBarDisplay", value.asInstanceOf[js.Any])
    
    inline def setTitleBarVisible(value: Requireable[Boolean]): Self = StObject.set(x, "titleBarVisible", value.asInstanceOf[js.Any])
  }
}
