package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenLocale extends StObject {
  
  var children: Any
  
  var locale: Any
}
object ChildrenLocale {
  
  inline def apply(children: Any, locale: Any): ChildrenLocale = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenLocale]
  }
  
  extension [Self <: ChildrenLocale](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
  }
}
