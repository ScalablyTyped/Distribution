package typings.watchify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache extends js.Object {
  var cache: js.Any = js.native
  var packageCache: js.Any = js.native
}

object Cache {
  @scala.inline
  def apply(cache: js.Any, packageCache: js.Any): Cache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], packageCache = packageCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cache]
  }
  @scala.inline
  implicit class CacheOps[Self <: Cache] (val x: Self) extends AnyVal {
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
    def setCache(value: js.Any): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def setPackageCache(value: js.Any): Self = this.set("packageCache", value.asInstanceOf[js.Any])
  }
  
}

