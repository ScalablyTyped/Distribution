package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPayment extends StObject {
  
  val Settings: TypeofSettingsPaymentMethodOptions
}
object TypeofPayment {
  
  inline def apply(Settings: TypeofSettingsPaymentMethodOptions): TypeofPayment = {
    val __obj = js.Dynamic.literal(Settings = Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPayment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPayment] (val x: Self) extends AnyVal {
    
    inline def setSettings(value: TypeofSettingsPaymentMethodOptions): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
  }
}
