package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateBoolean extends StObject {
  
  var state: Boolean = js.native
}
object StateBoolean {
  
  @scala.inline
  def apply(state: Boolean): StateBoolean = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateBoolean]
  }
  
  @scala.inline
  implicit class StateBooleanMutableBuilder[Self <: StateBoolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: Boolean): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
