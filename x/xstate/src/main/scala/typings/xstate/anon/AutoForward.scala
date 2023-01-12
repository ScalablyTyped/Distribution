package typings.xstate.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoForward extends StObject {
  
  var autoForward: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var sync: js.UndefOr[Boolean] = js.undefined
}
object AutoForward {
  
  inline def apply(): AutoForward = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoForward]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoForward] (val x: Self) extends AnyVal {
    
    inline def setAutoForward(value: Boolean): Self = StObject.set(x, "autoForward", value.asInstanceOf[js.Any])
    
    inline def setAutoForwardUndefined: Self = StObject.set(x, "autoForward", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    
    inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
  }
}
