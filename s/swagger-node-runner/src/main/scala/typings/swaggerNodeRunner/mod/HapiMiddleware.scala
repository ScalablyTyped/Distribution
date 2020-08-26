package typings.swaggerNodeRunner.mod

import typings.swaggerNodeRunner.anon.Register
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HapiMiddleware extends Middleware {
  /** Back-reference to Config object of `Runner` that has created this middleware */
  var config: ConfigInternal = js.native
  /** Hapi Plugin */
  var plugin: Register = js.native
}

object HapiMiddleware {
  @scala.inline
  def apply(config: ConfigInternal, plugin: Register, runner: Runner): HapiMiddleware = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any])
    __obj.asInstanceOf[HapiMiddleware]
  }
  @scala.inline
  implicit class HapiMiddlewareOps[Self <: HapiMiddleware] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfig(value: ConfigInternal): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlugin(value: Register): Self = this.set("plugin", value.asInstanceOf[js.Any])
  }
  
}

