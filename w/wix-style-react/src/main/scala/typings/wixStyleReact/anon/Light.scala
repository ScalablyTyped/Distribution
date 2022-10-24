package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Light
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var caption: Any
  
  var children: Any
  
  var className: Any
  
  var dataHook: Any
  
  var light: Any
  
  var tagName: Any
}
object Light {
  
  inline def apply(caption: Any, children: Any, className: Any, dataHook: Any, light: Any, tagName: Any): Light = {
    val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Light]
  }
  
  extension [Self <: Light](x: Self) {
    
    inline def setCaption(value: Any): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setLight(value: Any): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setTagName(value: Any): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
  }
}
