package typings.swaggerNodeRunner.mod

import typings.restify.mod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestifyMiddleware extends Middleware {
  /** Register this Middleware with `app`  */
  def register(app: Server): Unit
}

object RestifyMiddleware {
  @scala.inline
  def apply(register: Server => Unit, runner: Runner): RestifyMiddleware = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register), runner = runner.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RestifyMiddleware]
  }
}

