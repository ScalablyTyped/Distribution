package typings.webpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCache extends js.Object {
  var cache: Boolean
  var workers: Boolean | Double
}

object AnonCache {
  @scala.inline
  def apply(cache: Boolean, workers: Boolean | Double): AnonCache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], workers = workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCache]
  }
}

