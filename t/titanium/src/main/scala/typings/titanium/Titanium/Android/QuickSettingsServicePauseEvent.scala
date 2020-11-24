package typings.titanium.Titanium.Android

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
  implicit class QuickSettingsServicePauseEventOps[Self <: QuickSettingsServicePauseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIteration(value: Double): Self = this.set("iteration", value.asInstanceOf[js.Any])
  }
}
