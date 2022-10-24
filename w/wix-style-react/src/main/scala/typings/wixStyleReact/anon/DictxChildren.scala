package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictxChildren
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var children: Any
}
object DictxChildren {
  
  inline def apply(children: Any): DictxChildren = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictxChildren]
  }
  
  extension [Self <: DictxChildren](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}
