package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderRadius
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var borderRadius: Any
  
  var className: Any
  
  var dataHook: Any
  
  var fit: Any
  
  var position: Any
  
  var showBorder: Any
  
  var src: Any
  
  var style: Any
  
  var transparent: Any
}
object BorderRadius {
  
  inline def apply(
    borderRadius: Any,
    className: Any,
    dataHook: Any,
    fit: Any,
    position: Any,
    showBorder: Any,
    src: Any,
    style: Any,
    transparent: Any
  ): BorderRadius = {
    val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], showBorder = showBorder.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderRadius]
  }
  
  extension [Self <: BorderRadius](x: Self) {
    
    inline def setBorderRadius(value: Any): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setFit(value: Any): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setShowBorder(value: Any): Self = StObject.set(x, "showBorder", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: Any): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setTransparent(value: Any): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
  }
}
