package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrowSize
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var arrowSize: Any
  
  var buttonSkin: Any
  
  var className: Any
  
  var controlsStartEnd: Any
  
  var dataHook: Any
  
  var icon: Any
}
object ArrowSize {
  
  inline def apply(arrowSize: Any, buttonSkin: Any, className: Any, controlsStartEnd: Any, dataHook: Any, icon: Any): ArrowSize = {
    val __obj = js.Dynamic.literal(arrowSize = arrowSize.asInstanceOf[js.Any], buttonSkin = buttonSkin.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], controlsStartEnd = controlsStartEnd.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowSize]
  }
  
  extension [Self <: ArrowSize](x: Self) {
    
    inline def setArrowSize(value: Any): Self = StObject.set(x, "arrowSize", value.asInstanceOf[js.Any])
    
    inline def setButtonSkin(value: Any): Self = StObject.set(x, "buttonSkin", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setControlsStartEnd(value: Any): Self = StObject.set(x, "controlsStartEnd", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: Any): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
  }
}
