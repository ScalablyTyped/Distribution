package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Media.Protection.PlayReady.IPlayReadySecureStopServiceRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsIPlayReadySecureStopServiceRequest extends StObject {
  
  /** The items in the collection. */ var items: IPlayReadySecureStopServiceRequest = js.native
  
  /** The number of items in the collection. */ var returnValue: Double = js.native
}
object ItemsIPlayReadySecureStopServiceRequest {
  
  @scala.inline
  def apply(items: IPlayReadySecureStopServiceRequest, returnValue: Double): ItemsIPlayReadySecureStopServiceRequest = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsIPlayReadySecureStopServiceRequest]
  }
  
  @scala.inline
  implicit class ItemsIPlayReadySecureStopServiceRequestMutableBuilder[Self <: ItemsIPlayReadySecureStopServiceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: IPlayReadySecureStopServiceRequest): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
