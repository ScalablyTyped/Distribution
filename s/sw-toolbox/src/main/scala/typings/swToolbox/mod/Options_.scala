package typings.swToolbox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options_ extends js.Object {
  var cache: CacheOptions
  var debug: Boolean
  var networkTimeoutSeconds: Double
}

object Options_ {
  @scala.inline
  def apply(cache: CacheOptions, debug: Boolean, networkTimeoutSeconds: Double): Options_ = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], networkTimeoutSeconds = networkTimeoutSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options_]
  }
}

