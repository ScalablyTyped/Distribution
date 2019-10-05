package typings.swDashToolbox.swDashToolboxMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cache: CacheOptions
  var debug: Boolean
  var networkTimeoutSeconds: Double
}

object Options {
  @scala.inline
  def apply(cache: CacheOptions, debug: Boolean, networkTimeoutSeconds: Double): Options = {
    val __obj = js.Dynamic.literal(cache = cache, debug = debug, networkTimeoutSeconds = networkTimeoutSeconds)
  
    __obj.asInstanceOf[Options]
  }
}

@JSImport("sw-toolbox", "options")
@js.native
object options extends TopLevel[Options]

