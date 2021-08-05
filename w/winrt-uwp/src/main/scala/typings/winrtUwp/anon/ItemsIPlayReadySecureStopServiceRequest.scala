package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Media.Protection.PlayReady.IPlayReadySecureStopServiceRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsIPlayReadySecureStopServiceRequest extends StObject {
  
  /** The items in the collection. */ var items: IPlayReadySecureStopServiceRequest
  
  /** The number of items in the collection. */ var returnValue: Double
}
object ItemsIPlayReadySecureStopServiceRequest {
  
  inline def apply(items: IPlayReadySecureStopServiceRequest, returnValue: Double): ItemsIPlayReadySecureStopServiceRequest = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsIPlayReadySecureStopServiceRequest]
  }
  
  extension [Self <: ItemsIPlayReadySecureStopServiceRequest](x: Self) {
    
    inline def setItems(value: IPlayReadySecureStopServiceRequest): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
