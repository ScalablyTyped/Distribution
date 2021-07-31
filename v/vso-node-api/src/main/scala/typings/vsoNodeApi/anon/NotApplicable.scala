package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotApplicable extends StObject {
  
  var error: scala.Double
  
  var failed: scala.Double
  
  var notApplicable: scala.Double
  
  var notSet: scala.Double
  
  var pending: scala.Double
  
  var succeeded: scala.Double
}
object NotApplicable {
  
  @scala.inline
  def apply(
    error: scala.Double,
    failed: scala.Double,
    notApplicable: scala.Double,
    notSet: scala.Double,
    pending: scala.Double,
    succeeded: scala.Double
  ): NotApplicable = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], notApplicable = notApplicable.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotApplicable]
  }
  
  @scala.inline
  implicit class NotApplicableMutableBuilder[Self <: NotApplicable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: scala.Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailed(value: scala.Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotApplicable(value: scala.Double): Self = StObject.set(x, "notApplicable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotSet(value: scala.Double): Self = StObject.set(x, "notSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPending(value: scala.Double): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceeded(value: scala.Double): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
  }
}
