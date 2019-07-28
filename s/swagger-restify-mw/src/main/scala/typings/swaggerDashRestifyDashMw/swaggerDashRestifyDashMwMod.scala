package typings.swaggerDashRestifyDashMw

import typings.std.Error
import typings.swaggerDashNodeDashRunner.swaggerDashNodeDashRunnerMod.Config
import typings.swaggerDashNodeDashRunner.swaggerDashNodeDashRunnerMod.RestifyMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swagger-restify-mw", JSImport.Namespace)
@js.native
object swaggerDashRestifyDashMwMod extends js.Object {
  def create(
    config: Config,
    cb: js.Function2[/* err */ js.UndefOr[Error], /* middleware */ RestifyMiddleware, Unit]
  ): Unit = js.native
}

