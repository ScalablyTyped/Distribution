package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reject extends StObject {
  
  var reject: js.Any
  
  var resolve: js.Any
}
object Reject {
  
  @scala.inline
  def apply(reject: js.Any, resolve: js.Any): Reject = {
    val __obj = js.Dynamic.literal(reject = reject.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reject]
  }
  
  @scala.inline
  implicit class RejectMutableBuilder[Self <: Reject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReject(value: js.Any): Self = StObject.set(x, "reject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolve(value: js.Any): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
  }
}
