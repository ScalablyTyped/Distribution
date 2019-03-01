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

object SailsMiddleware {
  @scala.inline
  def apply(
    chain: js.Function0[
      js.Function3[
        /* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Request, 
        /* res */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Response, 
        /* next */ expressLib.expressMod.eNs.NextFunction, 
        scala.Unit
      ]
    ],
    runner: Runner
  ): SailsMiddleware = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chain")(chain)
    __obj.updateDynamic("runner")(runner)
    __obj.asInstanceOf[SailsMiddleware]
  }
}

