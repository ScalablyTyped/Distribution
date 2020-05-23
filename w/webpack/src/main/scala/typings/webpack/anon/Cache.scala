package typings.webpack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
  var cache: Boolean
  var workers: Boolean | Double
}

object Cache {
  @scala.inline
  def apply(cache: Boolean, workers: Boolean | Double): Cache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], workers = workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cache]
  }
}

