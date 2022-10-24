package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsAny extends StObject {
  
  var items: Any
}
object ItemsAny {
  
  inline def apply(items: Any): ItemsAny = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsAny]
  }
  
  extension [Self <: ItemsAny](x: Self) {
    
    inline def setItems(value: Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
  }
}
