package typings.swaggerDashExpressDashMw

import typings.std.Error
import typings.swaggerDashNodeDashRunner.swaggerDashNodeDashRunnerMod.Config
import typings.swaggerDashNodeDashRunner.swaggerDashNodeDashRunnerMod.ConnectMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swagger-express-mw", JSImport.Namespace)
@js.native
object swaggerDashExpressDashMwMod extends js.Object {
  def create(
    config: Config,
    cb: js.Function2[/* err */ js.UndefOr[Error], /* runner */ ConnectMiddleware, Unit]
  ): Unit = js.native
}

