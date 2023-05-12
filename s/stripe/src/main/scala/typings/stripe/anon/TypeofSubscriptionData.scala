package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSubscriptionData extends StObject {
  
  val TrialSettings: TypeofTrialSettings
}
object TypeofSubscriptionData {
  
  inline def apply(TrialSettings: TypeofTrialSettings): TypeofSubscriptionData = {
    val __obj = js.Dynamic.literal(TrialSettings = TrialSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSubscriptionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSubscriptionData] (val x: Self) extends AnyVal {
    
    inline def setTrialSettings(value: TypeofTrialSettings): Self = StObject.set(x, "TrialSettings", value.asInstanceOf[js.Any])
  }
}
