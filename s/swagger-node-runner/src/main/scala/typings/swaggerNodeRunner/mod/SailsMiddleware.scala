package typings.swaggerNodeRunner.mod

import typings.express.mod.NextFunction
import typings.expressServeStaticCore.mod.global.Express.Request
import typings.expressServeStaticCore.mod.global.Express.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SailsMiddleware extends Middleware {
  
  /** Express style middleware */
  def chain(): js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit] = js.native
}
object SailsMiddleware {
  
  @scala.inline
  def apply(
    chain: () => js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit],
    runner: Runner
  ): SailsMiddleware = {
    val __obj = js.Dynamic.literal(chain = js.Any.fromFunction0(chain), runner = runner.asInstanceOf[js.Any])
    __obj.asInstanceOf[SailsMiddleware]
  }
  
  @scala.inline
  implicit class SailsMiddlewareOps[Self <: SailsMiddleware] (val x: Self) extends AnyVal {
    
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
    def setChain(value: () => js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit]): Self = this.set("chain", js.Any.fromFunction0(value))
  }
}
