package typings.webpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cache extends js.Object {
  var cache: Boolean
  var workers: Boolean | Double
}

object Anon_Cache {
  @scala.inline
  def apply(cache: Boolean, workers: Boolean | Double): Anon_Cache = {
    val __obj = js.Dynamic.literal(cache = cache, workers = workers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Cache]
  }
}

