package typings.swaggerNodeRunner.mod

import typings.express.mod.NextFunction
import typings.expressServeStaticCore.mod.global.Express.Application
import typings.expressServeStaticCore.mod.global.Express.Request
import typings.expressServeStaticCore.mod.global.Express.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectMiddleware extends Middleware {
  
  def middleware(): js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit] = js.native
  
  /** Register this Middleware with `app`  */
  def register(app: Application): Unit = js.native
}
object ConnectMiddleware {
  
  @scala.inline
  def apply(
    middleware: () => js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit],
    register: Application => Unit,
    runner: Runner
  ): ConnectMiddleware = {
    val __obj = js.Dynamic.literal(middleware = js.Any.fromFunction0(middleware), register = js.Any.fromFunction1(register), runner = runner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectMiddleware]
  }
  
  @scala.inline
  implicit class ConnectMiddlewareOps[Self <: ConnectMiddleware] (val x: Self) extends AnyVal {
    
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
    def setMiddleware(value: () => js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit]): Self = this.set("middleware", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegister(value: Application => Unit): Self = this.set("register", js.Any.fromFunction1(value))
  }
}
