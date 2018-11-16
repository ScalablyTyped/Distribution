package typings
package swaggerDashNodeDashRunnerLib.swaggerDashNodeDashRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConnectMiddleware extends Middleware {
  def middleware(): js.Function3[
    /* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Request, 
    /* res */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Response, 
    /* next */ expressLib.expressMod.eNs.NextFunction, 
    scala.Unit
  ]
  /** Register this Middleware with `app`  */
  def register(
    app: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Application
  ): scala.Unit
}

