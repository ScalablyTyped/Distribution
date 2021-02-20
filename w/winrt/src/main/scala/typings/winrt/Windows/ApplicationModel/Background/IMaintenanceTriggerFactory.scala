package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMaintenanceTriggerFactory extends StObject {
  
  def create(freshnessTime: Double, oneShot: Boolean): MaintenanceTrigger = js.native
}
object IMaintenanceTriggerFactory {
  
  @scala.inline
  def apply(create: (Double, Boolean) => MaintenanceTrigger): IMaintenanceTriggerFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
    __obj.asInstanceOf[IMaintenanceTriggerFactory]
  }
  
  @scala.inline
  implicit class IMaintenanceTriggerFactoryMutableBuilder[Self <: IMaintenanceTriggerFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: (Double, Boolean) => MaintenanceTrigger): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
  }
}
