package typings.watchify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
  var cache: js.Any
  var packageCache: js.Any
}

object Cache {
  @scala.inline
  def apply(cache: js.Any, packageCache: js.Any): Cache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], packageCache = packageCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cache]
  }
}

