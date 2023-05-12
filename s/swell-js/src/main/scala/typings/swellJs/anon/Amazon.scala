package typings.swellJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Amazon extends StObject {
  
  var amazon: js.UndefOr[js.Object] = js.undefined
  
  var bancontact: js.UndefOr[js.Object] = js.undefined
  
  var card: js.UndefOr[js.Object] = js.undefined
  
  var ideal: js.UndefOr[js.Object] = js.undefined
  
  var klarna: js.UndefOr[js.Object] = js.undefined
  
  var paysafecard: js.UndefOr[js.Object] = js.undefined
}
object Amazon {
  
  inline def apply(): Amazon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Amazon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Amazon] (val x: Self) extends AnyVal {
    
    inline def setAmazon(value: js.Object): Self = StObject.set(x, "amazon", value.asInstanceOf[js.Any])
    
    inline def setAmazonUndefined: Self = StObject.set(x, "amazon", js.undefined)
    
    inline def setBancontact(value: js.Object): Self = StObject.set(x, "bancontact", value.asInstanceOf[js.Any])
    
    inline def setBancontactUndefined: Self = StObject.set(x, "bancontact", js.undefined)
    
    inline def setCard(value: js.Object): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    inline def setIdeal(value: js.Object): Self = StObject.set(x, "ideal", value.asInstanceOf[js.Any])
    
    inline def setIdealUndefined: Self = StObject.set(x, "ideal", js.undefined)
    
    inline def setKlarna(value: js.Object): Self = StObject.set(x, "klarna", value.asInstanceOf[js.Any])
    
    inline def setKlarnaUndefined: Self = StObject.set(x, "klarna", js.undefined)
    
    inline def setPaysafecard(value: js.Object): Self = StObject.set(x, "paysafecard", value.asInstanceOf[js.Any])
    
    inline def setPaysafecardUndefined: Self = StObject.set(x, "paysafecard", js.undefined)
  }
}
