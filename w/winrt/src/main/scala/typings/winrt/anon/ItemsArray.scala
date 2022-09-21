package typings.winrt.anon

import typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsArray extends StObject {
  
  var items: js.Array[IKeyValuePair[String, ResourceMap]]
  
  var returnValue: Double
}
object ItemsArray {
  
  inline def apply(items: js.Array[IKeyValuePair[String, ResourceMap]], returnValue: Double): ItemsArray = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsArray]
  }
  
  extension [Self <: ItemsArray](x: Self) {
    
    inline def setItems(value: js.Array[IKeyValuePair[String, ResourceMap]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: (IKeyValuePair[String, ResourceMap])*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
