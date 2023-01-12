package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISystemTrigger
  extends StObject
     with IBackgroundTrigger {
  
  var oneShot: Boolean
  
  var triggerType: SystemTriggerType
}
object ISystemTrigger {
  
  inline def apply(oneShot: Boolean, triggerType: SystemTriggerType): ISystemTrigger = {
    val __obj = js.Dynamic.literal(oneShot = oneShot.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISystemTrigger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISystemTrigger] (val x: Self) extends AnyVal {
    
    inline def setOneShot(value: Boolean): Self = StObject.set(x, "oneShot", value.asInstanceOf[js.Any])
    
    inline def setTriggerType(value: SystemTriggerType): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
  }
}
