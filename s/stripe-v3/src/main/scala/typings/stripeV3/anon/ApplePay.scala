package typings.stripeV3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplePay extends StObject {
  
  var applePay: js.UndefOr[Boolean] = js.native
}
object ApplePay {
  
  @scala.inline
  def apply(): ApplePay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplePay]
  }
  
  @scala.inline
  implicit class ApplePayMutableBuilder[Self <: ApplePay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplePay(value: Boolean): Self = StObject.set(x, "applePay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplePayUndefined: Self = StObject.set(x, "applePay", js.undefined)
  }
}
