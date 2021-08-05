package typings.stripe.anon

import typings.stripe.stripeStrings.fraudulent
import typings.stripe.stripeStrings.safe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Userreport extends StObject {
  
  /**
    * If you believe a charge is fraudulent, include a user_report key with a value of fraudulent. If you believe a
    * charge is safe, include a user_report key with a value of safe. Note that you must refund a charge before setting
    * the user_report to fraudulent. Stripe will use the information you send to improve our fraud detection algorithm
    */
  var user_report: js.UndefOr[fraudulent | safe] = js.undefined
}
object Userreport {
  
  inline def apply(): Userreport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Userreport]
  }
  
  extension [Self <: Userreport](x: Self) {
    
    inline def setUser_report(value: fraudulent | safe): Self = StObject.set(x, "user_report", value.asInstanceOf[js.Any])
    
    inline def setUser_reportUndefined: Self = StObject.set(x, "user_report", js.undefined)
  }
}
