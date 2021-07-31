package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Canceled extends StObject {
  
  var canceled: scala.Double
  
  var failed: scala.Double
  
  var none: scala.Double
  
  var partiallySucceeded: scala.Double
  
  var succeeded: scala.Double
}
object Canceled {
  
  @scala.inline
  def apply(
    canceled: scala.Double,
    failed: scala.Double,
    none: scala.Double,
    partiallySucceeded: scala.Double,
    succeeded: scala.Double
  ): Canceled = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], partiallySucceeded = partiallySucceeded.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Canceled]
  }
  
  @scala.inline
  implicit class CanceledMutableBuilder[Self <: Canceled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanceled(value: scala.Double): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailed(value: scala.Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartiallySucceeded(value: scala.Double): Self = StObject.set(x, "partiallySucceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceeded(value: scala.Double): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
  }
}
