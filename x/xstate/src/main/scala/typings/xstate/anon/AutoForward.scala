package typings.xstate.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoForward extends StObject {
  
  var autoForward: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var sync: js.UndefOr[Boolean] = js.native
}
object AutoForward {
  
  @scala.inline
  def apply(): AutoForward = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoForward]
  }
  
  @scala.inline
  implicit class AutoForwardMutableBuilder[Self <: AutoForward] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoForward(value: Boolean): Self = StObject.set(x, "autoForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoForwardUndefined: Self = StObject.set(x, "autoForward", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
  }
}
