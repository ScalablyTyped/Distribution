package typings.watchify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cache extends js.Object {
  var cache: js.Any
  var packageCache: js.Any
}

object Anon_Cache {
  @scala.inline
  def apply(cache: js.Any, packageCache: js.Any): Anon_Cache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], packageCache = packageCache.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Cache]
  }
}

