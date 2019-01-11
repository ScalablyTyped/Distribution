package typings
package swaggerDashExpressDashMwLib.swaggerDashExpressDashMwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swagger-express-mw", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def create(
    config: swaggerDashNodeDashRunnerLib.swaggerDashNodeDashRunnerMod.Config,
    cb: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error], 
      /* runner */ swaggerDashNodeDashRunnerLib.swaggerDashNodeDashRunnerMod.ConnectMiddleware, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

