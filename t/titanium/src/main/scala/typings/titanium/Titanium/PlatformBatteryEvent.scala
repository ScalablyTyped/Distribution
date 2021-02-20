package typings.titanium.Titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the battery state changes. This is measured in 5% increments on iPhone/iPad.
  */
@js.native
trait PlatformBatteryEvent extends PlatformBaseEvent {
  
  /**
    * Percentage battery power level.
    */
  var level: Double = js.native
  
  /**
    * The battery state.
    */
  var state: Double = js.native
}
object PlatformBatteryEvent {
  
  @scala.inline
  def apply(level: Double, source: Platform, state: Double): PlatformBatteryEvent = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformBatteryEvent]
  }
  
  @scala.inline
  implicit class PlatformBatteryEventMutableBuilder[Self <: PlatformBatteryEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: Double): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
