package typings.titanium.Titanium.Android

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * For Javascript-based services that you create, `pause` fires after each time the JavaScript
  * code executes.
  */
@js.native
trait QuickSettingsServicePauseEvent extends QuickSettingsServiceBaseEvent {
  
  /**
    * Incrementing integer indicating which iteration of an interval-based Service is pausing.
    * For example, if you have an interval-based Service running every 10 seconds, iteration
    * 3 would occur at about 30 seconds after you start the instance (assuming your service
    * code runs quickly).
    */
  var iteration: Double = js.native
}
object QuickSettingsServicePauseEvent {
  
  @scala.inline
  def apply(iteration: Double, source: QuickSettingsService): QuickSettingsServicePauseEvent = {
    val __obj = js.Dynamic.literal(iteration = iteration.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickSettingsServicePauseEvent]
  }
  
  @scala.inline
  implicit class QuickSettingsServicePauseEventMutableBuilder[Self <: QuickSettingsServicePauseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIteration(value: Double): Self = StObject.set(x, "iteration", value.asInstanceOf[js.Any])
  }
}
