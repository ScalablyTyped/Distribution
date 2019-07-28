package typings.yog2DashKernel.yog2DashKernelMod

import typings.express.expressMod.NextFunction
import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.IRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router extends IRouter {
  def action(actionName: String): RequestHandler | ActionObject = js.native
  def wrapAsync(fn: js.Function3[/* req */ Request, /* resp */ Response, /* next */ NextFunction, _]): RequestHandler = js.native
}

