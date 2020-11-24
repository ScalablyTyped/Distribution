package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Argument passed to the callback when a request finishes successfully or erroneously.
  */
@js.native
trait LocationAccuracyAuthorizationResponse extends ErrorResponse {
  
  /**
    * The level of location accuracy the app has granted.
    */
  var accuracyAuthorization: js.UndefOr[Double] = js.native
}
object LocationAccuracyAuthorizationResponse {
  
  @scala.inline
  def apply(): LocationAccuracyAuthorizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationAccuracyAuthorizationResponse]
  }
  
  @scala.inline
  implicit class LocationAccuracyAuthorizationResponseOps[Self <: LocationAccuracyAuthorizationResponse] (val x: Self) extends AnyVal {
    
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
    def setAccuracyAuthorization(value: Double): Self = this.set("accuracyAuthorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccuracyAuthorization: Self = this.set("accuracyAuthorization", js.undefined)
  }
}
