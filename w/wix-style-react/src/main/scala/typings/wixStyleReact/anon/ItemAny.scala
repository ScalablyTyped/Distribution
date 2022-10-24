package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemAny extends StObject {
  
  var item: Any
}
object ItemAny {
  
  inline def apply(item: Any): ItemAny = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemAny]
  }
  
  extension [Self <: ItemAny](x: Self) {
    
    inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
