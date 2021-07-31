package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Approved extends StObject {
  
  var approved: scala.Double
  
  var created: scala.Double
  
  var deleted: scala.Double
  
  var rejected: scala.Double
}
object Approved {
  
  @scala.inline
  def apply(approved: scala.Double, created: scala.Double, deleted: scala.Double, rejected: scala.Double): Approved = {
    val __obj = js.Dynamic.literal(approved = approved.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Approved]
  }
  
  @scala.inline
  implicit class ApprovedMutableBuilder[Self <: Approved] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApproved(value: scala.Double): Self = StObject.set(x, "approved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: scala.Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleted(value: scala.Double): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejected(value: scala.Double): Self = StObject.set(x, "rejected", value.asInstanceOf[js.Any])
  }
}
