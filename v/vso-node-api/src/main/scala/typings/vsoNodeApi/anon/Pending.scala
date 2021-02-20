package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pending extends StObject {
  
  var approved: scala.Double = js.native
  
  var canceled: scala.Double = js.native
  
  var pending: scala.Double = js.native
  
  var reassigned: scala.Double = js.native
  
  var rejected: scala.Double = js.native
  
  var skipped: scala.Double = js.native
  
  var undefined: scala.Double = js.native
}
object Pending {
  
  @scala.inline
  def apply(
    approved: scala.Double,
    canceled: scala.Double,
    pending: scala.Double,
    reassigned: scala.Double,
    rejected: scala.Double,
    skipped: scala.Double,
    undefined: scala.Double
  ): Pending = {
    val __obj = js.Dynamic.literal(approved = approved.asInstanceOf[js.Any], canceled = canceled.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], reassigned = reassigned.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pending]
  }
  
  @scala.inline
  implicit class PendingMutableBuilder[Self <: Pending] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApproved(value: scala.Double): Self = StObject.set(x, "approved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanceled(value: scala.Double): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPending(value: scala.Double): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReassigned(value: scala.Double): Self = StObject.set(x, "reassigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejected(value: scala.Double): Self = StObject.set(x, "rejected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipped(value: scala.Double): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndefined(value: scala.Double): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
  }
}
