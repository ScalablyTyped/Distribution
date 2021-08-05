package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BadRequest extends StObject {
  
  var badRequest: scala.Double
  
  var invalidResolution: scala.Double
  
  var notFound: scala.Double
  
  var succeeded: scala.Double
  
  var unsupportedConflictType: scala.Double
}
object BadRequest {
  
  inline def apply(
    badRequest: scala.Double,
    invalidResolution: scala.Double,
    notFound: scala.Double,
    succeeded: scala.Double,
    unsupportedConflictType: scala.Double
  ): BadRequest = {
    val __obj = js.Dynamic.literal(badRequest = badRequest.asInstanceOf[js.Any], invalidResolution = invalidResolution.asInstanceOf[js.Any], notFound = notFound.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], unsupportedConflictType = unsupportedConflictType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadRequest]
  }
  
  extension [Self <: BadRequest](x: Self) {
    
    inline def setBadRequest(value: scala.Double): Self = StObject.set(x, "badRequest", value.asInstanceOf[js.Any])
    
    inline def setInvalidResolution(value: scala.Double): Self = StObject.set(x, "invalidResolution", value.asInstanceOf[js.Any])
    
    inline def setNotFound(value: scala.Double): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
    
    inline def setSucceeded(value: scala.Double): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
    
    inline def setUnsupportedConflictType(value: scala.Double): Self = StObject.set(x, "unsupportedConflictType", value.asInstanceOf[js.Any])
  }
}
