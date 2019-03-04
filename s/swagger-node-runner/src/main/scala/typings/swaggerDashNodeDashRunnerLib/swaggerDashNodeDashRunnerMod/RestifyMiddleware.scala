package typings
package swaggerDashNodeDashRunnerLib.swaggerDashNodeDashRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestifyMiddleware extends Middleware {
  /** Register this Middleware with `app`  */
  def register(app: restifyLib.restifyMod.Server): scala.Unit
}

object RestifyMiddleware {
  @scala.inline
  def apply(register: js.Function1[restifyLib.restifyMod.Server, scala.Unit], runner: Runner): RestifyMiddleware = {
    val __obj = js.Dynamic.literal(register = register, runner = runner)
  
    __obj.asInstanceOf[RestifyMiddleware]
  }
}

