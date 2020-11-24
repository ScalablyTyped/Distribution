package typings.stylableCore.anon

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cache[T /* <: js.Function1[/* repeated */ String, String] */] extends js.Object {
  
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
  implicit class CacheOps[Self <: Cache[_], T /* <: js.Function1[/* repeated */ String, String] */] (val x: Self with Cache[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCache(value: Map[_, _]): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: T): Self = this.set("get", value.asInstanceOf[js.Any])
  }
}
