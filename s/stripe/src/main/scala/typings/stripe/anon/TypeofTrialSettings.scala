package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTrialSettings extends StObject {
  
  val EndBehavior: Any
}
object TypeofTrialSettings {
  
  inline def apply(EndBehavior: Any): TypeofTrialSettings = {
    val __obj = js.Dynamic.literal(EndBehavior = EndBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTrialSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofTrialSettings] (val x: Self) extends AnyVal {
    
    inline def setEndBehavior(value: Any): Self = StObject.set(x, "EndBehavior", value.asInstanceOf[js.Any])
  }
}
