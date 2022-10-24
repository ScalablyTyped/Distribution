package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Features
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var as: Any
  
  var children: Any
  
  var className: Any
  
  var dataHook: Any
  
  var features: Any
  
  var typographyClass: Any
}
object Features {
  
  inline def apply(as: Any, children: Any, className: Any, dataHook: Any, features: Any, typographyClass: Any): Features = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], typographyClass = typographyClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features]
  }
  
  extension [Self <: Features](x: Self) {
    
    inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setFeatures(value: Any): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setTypographyClass(value: Any): Self = StObject.set(x, "typographyClass", value.asInstanceOf[js.Any])
  }
}
