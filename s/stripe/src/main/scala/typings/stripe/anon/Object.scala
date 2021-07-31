package typings.stripe.anon

import typings.stripe.stripeStrings.alipay_account
import typings.stripe.stripeStrings.all
import typings.stripe.stripeStrings.bitcoin_receiver
import typings.stripe.stripeStrings.card
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Object extends StObject {
  
  /**
    * Return charges that match this source type string. Available options are
    * "all", "alipay_account", "bitcoin_receiver", or "card".
    */
  var `object`: all | alipay_account | bitcoin_receiver | card
}
object Object {
  
  @scala.inline
  def apply(`object`: all | alipay_account | bitcoin_receiver | card): Object = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object]
  }
  
  @scala.inline
  implicit class ObjectMutableBuilder[Self <: Object] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObject(value: all | alipay_account | bitcoin_receiver | card): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
