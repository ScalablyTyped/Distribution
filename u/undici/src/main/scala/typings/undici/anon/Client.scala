package typings.undici.anon

import typings.undici.typesDispatcherMod.DispatchInterceptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Client extends StObject {
  
  var Client: js.UndefOr[js.Array[DispatchInterceptor]] = js.undefined
}
object Client {
  
  inline def apply(): Client = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Client]
  }
  
  extension [Self <: Client](x: Self) {
    
    inline def setClient(value: js.Array[DispatchInterceptor]): Self = StObject.set(x, "Client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "Client", js.undefined)
    
    inline def setClientVarargs(value: DispatchInterceptor*): Self = StObject.set(x, "Client", js.Array(value*))
  }
}
