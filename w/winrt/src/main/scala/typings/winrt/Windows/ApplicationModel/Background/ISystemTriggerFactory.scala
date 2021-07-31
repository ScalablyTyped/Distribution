package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISystemTriggerFactory extends StObject {
  
  def create(triggerType: SystemTriggerType, oneShot: Boolean): SystemTrigger
}
object ISystemTriggerFactory {
  
  @scala.inline
  def apply(create: (SystemTriggerType, Boolean) => SystemTrigger): ISystemTriggerFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
    __obj.asInstanceOf[ISystemTriggerFactory]
  }
  
  @scala.inline
  implicit class ISystemTriggerFactoryMutableBuilder[Self <: ISystemTriggerFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: (SystemTriggerType, Boolean) => SystemTrigger): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
  }
}
