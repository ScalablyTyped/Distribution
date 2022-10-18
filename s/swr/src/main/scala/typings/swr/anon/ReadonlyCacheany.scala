package typings.swr.anon

import typings.swr.distTypesMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<swr.swr/dist/types.Cache<any>> */
trait ReadonlyCacheany extends StObject {
  
  val delete: js.Function1[/* key */ Key, Unit]
  
  val get: js.Function1[/* key */ Key, js.UndefOr[Any | Null]]
  
  val set: js.Function2[/* key */ Key, /* value */ Any, Unit]
}
object ReadonlyCacheany {
  
  inline def apply(
    delete: /* key */ Key => Unit,
    get: /* key */ Key => js.UndefOr[Any | Null],
    set: (/* key */ Key, /* value */ Any) => Unit
  ): ReadonlyCacheany = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[ReadonlyCacheany]
  }
  
  extension [Self <: ReadonlyCacheany](x: Self) {
    
    inline def setDelete(value: /* key */ Key => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    inline def setGet(value: /* key */ Key => js.UndefOr[Any | Null]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setSet(value: (/* key */ Key, /* value */ Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
