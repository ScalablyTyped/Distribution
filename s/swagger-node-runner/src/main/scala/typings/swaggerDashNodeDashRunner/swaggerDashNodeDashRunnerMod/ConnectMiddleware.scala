package typings.swaggerDashNodeDashRunner.swaggerDashNodeDashRunnerMod

import typings.express.expressMod.NextFunction
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Global.Express.Application
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Global.Express.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Global.Express.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectMiddleware extends Middleware {
  def middleware(): js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit]
  /** Register this Middleware with `app`  */
  def register(app: Application): Unit
}

object ConnectMiddleware {
  @scala.inline
  def apply(
    middleware: () => js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit],
    register: Application => Unit,
    runner: Runner
  ): ConnectMiddleware = {
    val __obj = js.Dynamic.literal(middleware = js.Any.fromFunction0(middleware), register = js.Any.fromFunction1(register), runner = runner)
  
    __obj.asInstanceOf[ConnectMiddleware]
  }
}

