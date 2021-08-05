package typings.winrt.anon

import typings.winrt.Windows.Foundation.IWwwFormUrlDecoderEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnValue extends StObject {
  
  var items: js.Array[IWwwFormUrlDecoderEntry]
  
  var returnValue: Double
}
object ReturnValue {
  
  inline def apply(items: js.Array[IWwwFormUrlDecoderEntry], returnValue: Double): ReturnValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnValue]
  }
  
  extension [Self <: ReturnValue](x: Self) {
    
    inline def setItems(value: js.Array[IWwwFormUrlDecoderEntry]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: IWwwFormUrlDecoderEntry*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
