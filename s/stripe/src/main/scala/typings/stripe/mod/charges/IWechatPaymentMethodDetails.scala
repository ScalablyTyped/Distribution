package typings.stripe.mod.charges

import typings.stripe.stripeStrings.wechat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWechatPaymentMethodDetails extends IPaymentMethodDetails {
  
  var `type`: wechat = js.native
}
object IWechatPaymentMethodDetails {
  
  @scala.inline
  def apply(`type`: wechat): IWechatPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWechatPaymentMethodDetails]
  }
  
  @scala.inline
  implicit class IWechatPaymentMethodDetailsMutableBuilder[Self <: IWechatPaymentMethodDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: wechat): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
