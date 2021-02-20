package typings.titanium

import org.scalablytyped.runtime.StObject
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
  implicit class LocationAccuracyAuthorizationResponseMutableBuilder[Self <: LocationAccuracyAuthorizationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracyAuthorization(value: Double): Self = StObject.set(x, "accuracyAuthorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccuracyAuthorizationUndefined: Self = StObject.set(x, "accuracyAuthorization", js.undefined)
  }
}
