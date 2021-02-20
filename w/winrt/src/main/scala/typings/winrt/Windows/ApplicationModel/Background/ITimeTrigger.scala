package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITimeTrigger extends IBackgroundTrigger {
  
  var freshnessTime: Double = js.native
  
  var oneShot: Boolean = js.native
}
object ITimeTrigger {
  
  @scala.inline
  def apply(freshnessTime: Double, oneShot: Boolean): ITimeTrigger = {
    val __obj = js.Dynamic.literal(freshnessTime = freshnessTime.asInstanceOf[js.Any], oneShot = oneShot.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimeTrigger]
  }
  
  @scala.inline
  implicit class ITimeTriggerMutableBuilder[Self <: ITimeTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFreshnessTime(value: Double): Self = StObject.set(x, "freshnessTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneShot(value: Boolean): Self = StObject.set(x, "oneShot", value.asInstanceOf[js.Any])
  }
}
