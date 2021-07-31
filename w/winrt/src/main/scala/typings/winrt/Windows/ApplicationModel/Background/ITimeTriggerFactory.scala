package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITimeTriggerFactory extends StObject {
  
  def create(freshnessTime: Double, oneShot: Boolean): TimeTrigger
}
object ITimeTriggerFactory {
  
  @scala.inline
  def apply(create: (Double, Boolean) => TimeTrigger): ITimeTriggerFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
    __obj.asInstanceOf[ITimeTriggerFactory]
  }
  
  @scala.inline
  implicit class ITimeTriggerFactoryMutableBuilder[Self <: ITimeTriggerFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: (Double, Boolean) => TimeTrigger): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
  }
}
