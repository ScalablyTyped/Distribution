package typings.stripe.anon

import typings.stripe.stripeStrings.fraudulent
import typings.stripe.stripeStrings.safe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stripereport extends StObject {
  
  /**
    * Assessments from Stripe have the key stripe_report and, if set, the value "fraudulent".
    */
  var stripe_report: js.UndefOr[fraudulent] = js.native
  
  /**
    * Assessments reported by you have the key user_report and, if set, possible values of "safe" and "fraudulent".
    */
  var user_report: js.UndefOr[fraudulent | safe] = js.native
}
object Stripereport {
  
  @scala.inline
  def apply(): Stripereport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stripereport]
  }
  
  @scala.inline
  implicit class StripereportMutableBuilder[Self <: Stripereport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStripe_report(value: fraudulent): Self = StObject.set(x, "stripe_report", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripe_reportUndefined: Self = StObject.set(x, "stripe_report", js.undefined)
    
    @scala.inline
    def setUser_report(value: fraudulent | safe): Self = StObject.set(x, "user_report", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_reportUndefined: Self = StObject.set(x, "user_report", js.undefined)
  }
}
