package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISystemTrigger extends IBackgroundTrigger {
  
  var oneShot: Boolean = js.native
  
  var triggerType: SystemTriggerType = js.native
}
object ISystemTrigger {
  
  @scala.inline
  def apply(oneShot: Boolean, triggerType: SystemTriggerType): ISystemTrigger = {
    val __obj = js.Dynamic.literal(oneShot = oneShot.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISystemTrigger]
  }
  
  @scala.inline
  implicit class ISystemTriggerMutableBuilder[Self <: ISystemTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOneShot(value: Boolean): Self = StObject.set(x, "oneShot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerType(value: SystemTriggerType): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
  }
}
