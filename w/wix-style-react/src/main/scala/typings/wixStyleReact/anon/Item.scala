package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  var item: Any
  
  var position: Any
}
object Item {
  
  inline def apply(item: Any, position: Any): Item = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  extension [Self <: Item](x: Self) {
    
    inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
