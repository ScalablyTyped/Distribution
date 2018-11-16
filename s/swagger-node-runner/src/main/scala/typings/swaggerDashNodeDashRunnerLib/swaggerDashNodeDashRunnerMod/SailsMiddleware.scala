package typings
package swaggerDashNodeDashRunnerLib.swaggerDashNodeDashRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SailsMiddleware extends Middleware {
  /** Express style middleware */
  def chain(): js.Function3[
    /* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Request, 
    /* res */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Response, 
    /* next */ expressLib.expressMod.eNs.NextFunction, 
    scala.Unit
  ]
}

