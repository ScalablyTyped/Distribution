package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsIKeyValuePair extends StObject {
  
  /** The items in the map view. */ var items: IKeyValuePair[Any, Any]
  
  /** The number of items in the map view. */ var returnValue: Double
}
object ItemsIKeyValuePair {
  
  inline def apply(items: IKeyValuePair[Any, Any], returnValue: Double): ItemsIKeyValuePair = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsIKeyValuePair]
  }
  
  extension [Self <: ItemsIKeyValuePair](x: Self) {
    
    inline def setItems(value: IKeyValuePair[Any, Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
