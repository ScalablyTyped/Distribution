package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisallowNonLinearStack extends StObject {
  
  var disallowNonLinearStack: js.UndefOr[Boolean] = js.undefined
}
object DisallowNonLinearStack {
  
  @scala.inline
  def apply(): DisallowNonLinearStack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisallowNonLinearStack]
  }
  
  @scala.inline
  implicit class DisallowNonLinearStackMutableBuilder[Self <: DisallowNonLinearStack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisallowNonLinearStack(value: Boolean): Self = StObject.set(x, "disallowNonLinearStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisallowNonLinearStackUndefined: Self = StObject.set(x, "disallowNonLinearStack", js.undefined)
  }
}
