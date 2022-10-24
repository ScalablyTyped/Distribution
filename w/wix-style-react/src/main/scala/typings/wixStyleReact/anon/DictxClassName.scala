package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictxClassName
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var className: Any
  
  var headingAppearance: Any
}
object DictxClassName {
  
  inline def apply(className: Any, headingAppearance: Any): DictxClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], headingAppearance = headingAppearance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictxClassName]
  }
  
  extension [Self <: DictxClassName](x: Self) {
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setHeadingAppearance(value: Any): Self = StObject.set(x, "headingAppearance", value.asInstanceOf[js.Any])
  }
}
