package typings.stylableCore.anon

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cache[T /* <: js.Function1[/* repeated */ String, String] */] extends StObject {
  
  var cache: Map[_, _] = js.native
  
  var get: T = js.native
}
object Cache {
  
  @scala.inline
  def apply[T /* <: js.Function1[/* repeated */ String, String] */](cache: Map[_, _], get: T): Cache[T] = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cache[T]]
  }
  
  @scala.inline
  implicit class CacheMutableBuilder[Self <: Cache[_], T /* <: js.Function1[/* repeated */ String, String] */] (val x: Self with Cache[T]) extends AnyVal {
    
    @scala.inline
    def setCache(value: Map[_, _]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: T): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
