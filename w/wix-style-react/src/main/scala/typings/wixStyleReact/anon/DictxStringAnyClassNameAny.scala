package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictxStringAnyClassNameAny
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var className: Any
}
object DictxStringAnyClassNameAny {
  
  inline def apply(className: Any): DictxStringAnyClassNameAny = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictxStringAnyClassNameAny]
  }
  
  extension [Self <: DictxStringAnyClassNameAny](x: Self) {
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
  }
}
