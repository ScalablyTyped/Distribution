package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownDisabled extends StObject {
  
  var dataHook: Any
  
  var downDisabled: Any
  
  var onDown: Any
  
  var onMouseDown: Any
  
  var onUp: Any
  
  var upDisabled: Any
}
object DownDisabled {
  
  inline def apply(dataHook: Any, downDisabled: Any, onDown: Any, onMouseDown: Any, onUp: Any, upDisabled: Any): DownDisabled = {
    val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], downDisabled = downDisabled.asInstanceOf[js.Any], onDown = onDown.asInstanceOf[js.Any], onMouseDown = onMouseDown.asInstanceOf[js.Any], onUp = onUp.asInstanceOf[js.Any], upDisabled = upDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownDisabled]
  }
  
  extension [Self <: DownDisabled](x: Self) {
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDownDisabled(value: Any): Self = StObject.set(x, "downDisabled", value.asInstanceOf[js.Any])
    
    inline def setOnDown(value: Any): Self = StObject.set(x, "onDown", value.asInstanceOf[js.Any])
    
    inline def setOnMouseDown(value: Any): Self = StObject.set(x, "onMouseDown", value.asInstanceOf[js.Any])
    
    inline def setOnUp(value: Any): Self = StObject.set(x, "onUp", value.asInstanceOf[js.Any])
    
    inline def setUpDisabled(value: Any): Self = StObject.set(x, "upDisabled", value.asInstanceOf[js.Any])
  }
}
