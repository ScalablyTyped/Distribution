package typings.winrt.anon

import typings.winrt.Windows.Data.Json.IJsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var items: js.Array[IJsonValue]
  
  var returnValue: Double
}
object `1` {
  
  inline def apply(items: js.Array[IJsonValue], returnValue: Double): `1` = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setItems(value: js.Array[IJsonValue]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: IJsonValue*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
