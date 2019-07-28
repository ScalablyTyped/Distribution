package typings.swaggerDashNodeDashRunner.swaggerDashNodeDashRunnerMod

import typings.swaggerDashNodeDashRunner.Anon_Register
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HapiMiddleware extends Middleware {
  /** Back-reference to Config object of `Runner` that has created this middleware */
  var config: ConfigInternal
  /** Hapi Plugin */
  var plugin: Anon_Register
}

object HapiMiddleware {
  @scala.inline
  def apply(config: ConfigInternal, plugin: Anon_Register, runner: Runner): HapiMiddleware = {
    val __obj = js.Dynamic.literal(config = config, plugin = plugin, runner = runner)
  
    __obj.asInstanceOf[HapiMiddleware]
  }
}

