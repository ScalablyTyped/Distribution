package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSubscriptionSchedul extends StObject {
  
  val DefaultSettings: Any
  
  val Phase: TypeofPhase
}
object TypeofSubscriptionSchedul {
  
  inline def apply(DefaultSettings: Any, Phase: TypeofPhase): TypeofSubscriptionSchedul = {
    val __obj = js.Dynamic.literal(DefaultSettings = DefaultSettings.asInstanceOf[js.Any], Phase = Phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSubscriptionSchedul]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSubscriptionSchedul] (val x: Self) extends AnyVal {
    
    inline def setDefaultSettings(value: Any): Self = StObject.set(x, "DefaultSettings", value.asInstanceOf[js.Any])
    
    inline def setPhase(value: TypeofPhase): Self = StObject.set(x, "Phase", value.asInstanceOf[js.Any])
  }
}
