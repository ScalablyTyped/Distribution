package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reason extends StObject {
  
  var reason: js.UndefOr[String] = js.undefined
  
  var valid: Boolean
}
object Reason {
  
  @scala.inline
  def apply(valid: Boolean): Reason = {
    val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reason]
  }
  
  @scala.inline
  implicit class ReasonMutableBuilder[Self <: Reason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
