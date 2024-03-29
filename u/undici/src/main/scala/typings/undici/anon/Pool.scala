package typings.undici.anon

import typings.undici.typesDispatcherMod.Dispatcher.DispatchInterceptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pool extends StObject {
  
  var Pool: js.UndefOr[js.Array[DispatchInterceptor]] = js.undefined
}
object Pool {
  
  inline def apply(): Pool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pool]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pool] (val x: Self) extends AnyVal {
    
    inline def setPool(value: js.Array[DispatchInterceptor]): Self = StObject.set(x, "Pool", value.asInstanceOf[js.Any])
    
    inline def setPoolUndefined: Self = StObject.set(x, "Pool", js.undefined)
    
    inline def setPoolVarargs(value: DispatchInterceptor*): Self = StObject.set(x, "Pool", js.Array(value*))
  }
}
