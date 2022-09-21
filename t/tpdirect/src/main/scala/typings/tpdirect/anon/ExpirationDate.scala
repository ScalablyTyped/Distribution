package typings.tpdirect.anon

import typings.tpdirect.elementObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpirationDate extends StObject {
  
  var ccv: elementObject
  
  var expirationDate: elementObject
  
  var number: elementObject
}
object ExpirationDate {
  
  inline def apply(ccv: elementObject, expirationDate: elementObject, number: elementObject): ExpirationDate = {
    val __obj = js.Dynamic.literal(ccv = ccv.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpirationDate]
  }
  
  extension [Self <: ExpirationDate](x: Self) {
    
    inline def setCcv(value: elementObject): Self = StObject.set(x, "ccv", value.asInstanceOf[js.Any])
    
    inline def setExpirationDate(value: elementObject): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: elementObject): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
