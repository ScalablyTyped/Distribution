package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inprogress extends StObject {
  
  var completed: scala.Double
  
  var failed: scala.Double
  
  var inprogress: scala.Double
  
  var skipped: scala.Double
}
object Inprogress {
  
  @scala.inline
  def apply(completed: scala.Double, failed: scala.Double, inprogress: scala.Double, skipped: scala.Double): Inprogress = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], inprogress = inprogress.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inprogress]
  }
  
  @scala.inline
  implicit class InprogressMutableBuilder[Self <: Inprogress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompleted(value: scala.Double): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailed(value: scala.Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInprogress(value: scala.Double): Self = StObject.set(x, "inprogress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipped(value: scala.Double): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
  }
}
