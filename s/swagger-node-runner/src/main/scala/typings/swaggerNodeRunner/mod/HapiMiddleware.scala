package typings.swaggerNodeRunner.mod

import typings.swaggerNodeRunner.anon.Register
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HapiMiddleware extends Middleware {
  /** Back-reference to Config object of `Runner` that has created this middleware */
  var config: ConfigInternal
  /** Hapi Plugin */
  var plugin: Register
}

object HapiMiddleware {
  @scala.inline
  def apply(config: ConfigInternal, plugin: Register, runner: Runner): HapiMiddleware = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any])
    __obj.asInstanceOf[HapiMiddleware]
  }
}

