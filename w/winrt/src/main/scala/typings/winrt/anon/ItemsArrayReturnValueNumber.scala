package typings.winrt.anon

import typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceCandidate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsArrayReturnValueNumber extends StObject {
  
  var items: js.Array[ResourceCandidate]
  
  var returnValue: Double
}
object ItemsArrayReturnValueNumber {
  
  inline def apply(items: js.Array[ResourceCandidate], returnValue: Double): ItemsArrayReturnValueNumber = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsArrayReturnValueNumber]
  }
  
  extension [Self <: ItemsArrayReturnValueNumber](x: Self) {
    
    inline def setItems(value: js.Array[ResourceCandidate]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: ResourceCandidate*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
