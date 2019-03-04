package typings
package swDashToolboxLib.swDashToolboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheOptions extends js.Object {
  var maxAgeSeconds: scala.Double
  var maxEntries: scala.Double
  var name: java.lang.String
}

object CacheOptions {
  @scala.inline
  def apply(maxAgeSeconds: scala.Double, maxEntries: scala.Double, name: java.lang.String): CacheOptions = {
    val __obj = js.Dynamic.literal(maxAgeSeconds = maxAgeSeconds, maxEntries = maxEntries, name = name)
  
    __obj.asInstanceOf[CacheOptions]
  }
}

