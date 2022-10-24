package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppearanceChildren extends StObject {
  
  var appearance: Any
  
  var children: Any
}
object AppearanceChildren {
  
  inline def apply(appearance: Any, children: Any): AppearanceChildren = {
    val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppearanceChildren]
  }
  
  extension [Self <: AppearanceChildren](x: Self) {
    
    inline def setAppearance(value: Any): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}
