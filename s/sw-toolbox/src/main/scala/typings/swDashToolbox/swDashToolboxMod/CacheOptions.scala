package typings.swDashToolbox.swDashToolboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheOptions extends js.Object {
  var maxAgeSeconds: Double
  var maxEntries: Double
  var name: String
}

object CacheOptions {
  @scala.inline
  def apply(maxAgeSeconds: Double, maxEntries: Double, name: String): CacheOptions = {
    val __obj = js.Dynamic.literal(maxAgeSeconds = maxAgeSeconds.asInstanceOf[js.Any], maxEntries = maxEntries.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CacheOptions]
  }
}

