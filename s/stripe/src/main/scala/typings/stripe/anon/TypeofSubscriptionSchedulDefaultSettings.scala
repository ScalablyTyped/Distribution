package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSubscriptionSchedulDefaultSettings extends StObject {
  
  val DefaultSettings: Any
  
  val Phase: TypeofPhaseAddInvoiceItem
}
object TypeofSubscriptionSchedulDefaultSettings {
  
  inline def apply(DefaultSettings: Any, Phase: TypeofPhaseAddInvoiceItem): TypeofSubscriptionSchedulDefaultSettings = {
    val __obj = js.Dynamic.literal(DefaultSettings = DefaultSettings.asInstanceOf[js.Any], Phase = Phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSubscriptionSchedulDefaultSettings]
  }
  
  extension [Self <: TypeofSubscriptionSchedulDefaultSettings](x: Self) {
    
    inline def setDefaultSettings(value: Any): Self = StObject.set(x, "DefaultSettings", value.asInstanceOf[js.Any])
    
    inline def setPhase(value: TypeofPhaseAddInvoiceItem): Self = StObject.set(x, "Phase", value.asInstanceOf[js.Any])
  }
}
