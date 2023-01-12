package typings.undici.anon

import typings.undici.typesDispatcherMod.DispatchInterceptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Agent extends StObject {
  
  var Agent: js.UndefOr[js.Array[DispatchInterceptor]] = js.undefined
}
object Agent {
  
  inline def apply(): Agent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Agent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Agent] (val x: Self) extends AnyVal {
    
    inline def setAgent(value: js.Array[DispatchInterceptor]): Self = StObject.set(x, "Agent", value.asInstanceOf[js.Any])
    
    inline def setAgentUndefined: Self = StObject.set(x, "Agent", js.undefined)
    
    inline def setAgentVarargs(value: DispatchInterceptor*): Self = StObject.set(x, "Agent", js.Array(value*))
  }
}
