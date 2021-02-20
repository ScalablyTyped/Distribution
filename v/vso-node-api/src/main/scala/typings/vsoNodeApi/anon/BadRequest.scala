package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BadRequest extends StObject {
  
  var badRequest: scala.Double = js.native
  
  var invalidResolution: scala.Double = js.native
  
  var notFound: scala.Double = js.native
  
  var succeeded: scala.Double = js.native
  
  var unsupportedConflictType: scala.Double = js.native
}
object BadRequest {
  
  @scala.inline
  def apply(
    badRequest: scala.Double,
    invalidResolution: scala.Double,
    notFound: scala.Double,
    succeeded: scala.Double,
    unsupportedConflictType: scala.Double
  ): BadRequest = {
    val __obj = js.Dynamic.literal(badRequest = badRequest.asInstanceOf[js.Any], invalidResolution = invalidResolution.asInstanceOf[js.Any], notFound = notFound.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], unsupportedConflictType = unsupportedConflictType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadRequest]
  }
  
  @scala.inline
  implicit class BadRequestMutableBuilder[Self <: BadRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBadRequest(value: scala.Double): Self = StObject.set(x, "badRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidResolution(value: scala.Double): Self = StObject.set(x, "invalidResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotFound(value: scala.Double): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceeded(value: scala.Double): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsupportedConflictType(value: scala.Double): Self = StObject.set(x, "unsupportedConflictType", value.asInstanceOf[js.Any])
  }
}
