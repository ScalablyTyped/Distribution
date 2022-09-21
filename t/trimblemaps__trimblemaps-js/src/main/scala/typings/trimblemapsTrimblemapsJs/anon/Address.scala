package typings.trimblemapsTrimblemapsJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  var address: Addr
  
  var failure: js.UndefOr[js.Function1[/* response */ Any, Unit]] = js.undefined
  
  var listSize: js.UndefOr[Double] = js.undefined
  
  def success(response: Any): Unit
}
object Address {
  
  inline def apply(address: Addr, success: Any => Unit): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setAddress(value: Addr): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setFailure(value: /* response */ Any => Unit): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
    
    inline def setListSize(value: Double): Self = StObject.set(x, "listSize", value.asInstanceOf[js.Any])
    
    inline def setListSizeUndefined: Self = StObject.set(x, "listSize", js.undefined)
    
    inline def setSuccess(value: Any => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
