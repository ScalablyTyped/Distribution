package typings.swellJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingIdealSnake extends StObject {
  
  var token: js.UndefOr[String] = js.undefined
}
object BillingIdealSnake {
  
  inline def apply(): BillingIdealSnake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingIdealSnake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BillingIdealSnake] (val x: Self) extends AnyVal {
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
