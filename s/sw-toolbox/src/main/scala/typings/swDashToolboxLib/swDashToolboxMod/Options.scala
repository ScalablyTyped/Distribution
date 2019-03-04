package typings
package swDashToolboxLib.swDashToolboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cache: CacheOptions
  var debug: scala.Boolean
  var networkTimeoutSeconds: scala.Double
}

object Options {
  @scala.inline
  def apply(cache: CacheOptions, debug: scala.Boolean, networkTimeoutSeconds: scala.Double): Options = {
    val __obj = js.Dynamic.literal(cache = cache, debug = debug, networkTimeoutSeconds = networkTimeoutSeconds)
  
    __obj.asInstanceOf[Options]
  }
}

