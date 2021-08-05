package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotDeployed extends StObject {
  
  var all: scala.Double
  
  var failed: scala.Double
  
  var inProgress: scala.Double
  
  var notDeployed: scala.Double
  
  var partiallySucceeded: scala.Double
  
  var succeeded: scala.Double
  
  var undefined: scala.Double
}
object NotDeployed {
  
  inline def apply(
    all: scala.Double,
    failed: scala.Double,
    inProgress: scala.Double,
    notDeployed: scala.Double,
    partiallySucceeded: scala.Double,
    succeeded: scala.Double,
    undefined: scala.Double
  ): NotDeployed = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], notDeployed = notDeployed.asInstanceOf[js.Any], partiallySucceeded = partiallySucceeded.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotDeployed]
  }
  
  extension [Self <: NotDeployed](x: Self) {
    
    inline def setAll(value: scala.Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setFailed(value: scala.Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setInProgress(value: scala.Double): Self = StObject.set(x, "inProgress", value.asInstanceOf[js.Any])
    
    inline def setNotDeployed(value: scala.Double): Self = StObject.set(x, "notDeployed", value.asInstanceOf[js.Any])
    
    inline def setPartiallySucceeded(value: scala.Double): Self = StObject.set(x, "partiallySucceeded", value.asInstanceOf[js.Any])
    
    inline def setSucceeded(value: scala.Double): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
    
    inline def setUndefined(value: scala.Double): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
  }
}
