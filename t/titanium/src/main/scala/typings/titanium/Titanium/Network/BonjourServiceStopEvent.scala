package typings.titanium.Titanium.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when a service's publish or resolution was stopped via <Titanium.Network.BonjourService.stop>
  */
@js.native
trait BonjourServiceStopEvent extends BonjourServiceBaseEvent {
  
  /**
    * Error code
    */
  var code: Double = js.native
  
  /**
    * Error message
    */
  var error: String = js.native
  
  /**
    * Reports if the stop operation was successful
    */
  var success: Boolean = js.native
}
object BonjourServiceStopEvent {
  
  @scala.inline
  def apply(code: Double, error: String, source: BonjourService, success: Boolean): BonjourServiceStopEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[BonjourServiceStopEvent]
  }
  
  @scala.inline
  implicit class BonjourServiceStopEventOps[Self <: BonjourServiceStopEvent] (val x: Self) extends AnyVal {
    
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
  }
}
