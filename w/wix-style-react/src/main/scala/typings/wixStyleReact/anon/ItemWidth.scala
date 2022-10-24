package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemWidth extends StObject {
  
  var itemWidth: Null
  
  var offsetOfHandle: Y
}
object ItemWidth {
  
  inline def apply(itemWidth: Null, offsetOfHandle: Y): ItemWidth = {
    val __obj = js.Dynamic.literal(itemWidth = itemWidth.asInstanceOf[js.Any], offsetOfHandle = offsetOfHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemWidth]
  }
  
  extension [Self <: ItemWidth](x: Self) {
    
    inline def setItemWidth(value: Null): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
    
    inline def setOffsetOfHandle(value: Y): Self = StObject.set(x, "offsetOfHandle", value.asInstanceOf[js.Any])
  }
}
