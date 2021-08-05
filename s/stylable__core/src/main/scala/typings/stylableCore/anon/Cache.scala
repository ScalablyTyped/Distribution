package typings.stylableCore.anon

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cache[T /* <: js.Function1[/* repeated */ String, String] */] extends StObject {
  
  var cache: Map[js.Any, js.Any]
  
  var get: T
}
object Cache {
  
  inline def apply[T /* <: js.Function1[/* repeated */ String, String] */](cache: Map[js.Any, js.Any], get: T): Cache[T] = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cache[T]]
  }
  
  extension [Self <: Cache[?], T /* <: js.Function1[/* repeated */ String, String] */](x: Self & Cache[T]) {
    
    inline def setCache(value: Map[js.Any, js.Any]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setGet(value: T): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
