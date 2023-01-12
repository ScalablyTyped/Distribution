package typings.winrt.anon

import typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnValueNumber extends StObject {
  
  var items: js.Array[ResourceQualifier]
  
  var returnValue: Double
}
object ReturnValueNumber {
  
  inline def apply(items: js.Array[ResourceQualifier], returnValue: Double): ReturnValueNumber = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnValueNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnValueNumber] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[ResourceQualifier]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: ResourceQualifier*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
