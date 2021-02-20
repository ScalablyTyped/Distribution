package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanceledFailed extends StObject {
  
  var canceled: scala.Double = js.native
  
  var failed: scala.Double = js.native
  
  var succeeded: scala.Double = js.native
}
object CanceledFailed {
  
  @scala.inline
  def apply(canceled: scala.Double, failed: scala.Double, succeeded: scala.Double): CanceledFailed = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanceledFailed]
  }
  
  @scala.inline
  implicit class CanceledFailedMutableBuilder[Self <: CanceledFailed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanceled(value: scala.Double): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailed(value: scala.Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceeded(value: scala.Double): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
  }
}
