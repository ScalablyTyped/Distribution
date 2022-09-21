package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPaymentSettingsTypeofSettingsPaymentMethodOptionsTypeofPaymentMethodOptionAlipay extends StObject {
  
  val Settings: TypeofSettingsPaymentMethodOptionsTypeofPaymentMethodOptionAlipay
}
object TypeofPaymentSettingsTypeofSettingsPaymentMethodOptionsTypeofPaymentMethodOptionAlipay {
  
  inline def apply(Settings: TypeofSettingsPaymentMethodOptionsTypeofPaymentMethodOptionAlipay): TypeofPaymentSettingsTypeofSettingsPaymentMethodOptionsTypeofPaymentMethodOptionAlipay = {
    val __obj = js.Dynamic.literal(Settings = Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPaymentSettingsTypeofSettingsPaymentMethodOptionsTypeofPaymentMethodOptionAlipay]
  }
  
  extension [Self <: TypeofPaymentSettingsTypeofSettingsPaymentMethodOptionsTypeofPaymentMethodOptionAlipay](x: Self) {
    
    inline def setSettings(value: TypeofSettingsPaymentMethodOptionsTypeofPaymentMethodOptionAlipay): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
  }
}
