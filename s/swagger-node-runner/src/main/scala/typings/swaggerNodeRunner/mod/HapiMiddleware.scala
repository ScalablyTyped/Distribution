package typings.swaggerNodeRunner.mod

import typings.swaggerNodeRunner.AnonRegister
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HapiMiddleware extends Middleware {
  /** Back-reference to Config object of `Runner` that has created this middleware */
  var config: ConfigInternal
  /** Hapi Plugin */
  var plugin: AnonRegister
}

object HapiMiddleware {
  @scala.inline
  def apply(config: ConfigInternal, plugin: AnonRegister, runner: Runner): HapiMiddleware = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HapiMiddleware]
  }
}

