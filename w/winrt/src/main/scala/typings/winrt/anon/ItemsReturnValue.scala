package typings.winrt.anon

import typings.winrt.Windows.ApplicationModel.Resources.Core.NamedResource
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsReturnValue extends StObject {
  
  var items: js.Array[IKeyValuePair[String, NamedResource]]
  
  var returnValue: Double
}
object ItemsReturnValue {
  
  inline def apply(items: js.Array[IKeyValuePair[String, NamedResource]], returnValue: Double): ItemsReturnValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsReturnValue]
  }
  
  extension [Self <: ItemsReturnValue](x: Self) {
    
    inline def setItems(value: js.Array[IKeyValuePair[String, NamedResource]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: (IKeyValuePair[String, NamedResource])*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
