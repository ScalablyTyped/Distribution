package typings.watchify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCache extends js.Object {
  var cache: js.Any
  var packageCache: js.Any
}

object AnonCache {
  @scala.inline
  def apply(cache: js.Any, packageCache: js.Any): AnonCache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], packageCache = packageCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCache]
  }
}

