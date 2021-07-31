package typings.terminalKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinalCall extends StObject {
  
  var finalCall: Boolean
}
object FinalCall {
  
  @scala.inline
  def apply(finalCall: Boolean): FinalCall = {
    val __obj = js.Dynamic.literal(finalCall = finalCall.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalCall]
  }
  
  @scala.inline
  implicit class FinalCallMutableBuilder[Self <: FinalCall] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinalCall(value: Boolean): Self = StObject.set(x, "finalCall", value.asInstanceOf[js.Any])
  }
}
