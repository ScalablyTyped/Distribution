package typings.titanium.Titanium

import typings.titanium.HeadingData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when an heading update is received.
  */
@js.native
trait GeolocationHeadingEvent extends GeolocationBaseEvent {
  
  /**
    * If `success` is `false`, the error code is available.
    */
  var code: Double = js.native
  
  /**
    * If `success` is false, a string describing the error.
    */
  var error: String = js.native
  
  /**
    * Dictionary object containing the heading data.
    */
  var heading: HeadingData = js.native
  
  /**
    * Indicate if the heading event was successfully received. Android returns this since SDK 7.5.0.
    */
  var success: Boolean = js.native
}
object GeolocationHeadingEvent {
  
  @scala.inline
  def apply(code: Double, error: String, heading: HeadingData, source: Geolocation, success: Boolean): GeolocationHeadingEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationHeadingEvent]
  }
  
  @scala.inline
  implicit class GeolocationHeadingEventOps[Self <: GeolocationHeadingEvent] (val x: Self) extends AnyVal {
    
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
    def setHeading(value: HeadingData): Self = this.set("heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
  }
}
