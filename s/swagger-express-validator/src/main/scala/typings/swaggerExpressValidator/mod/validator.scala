package typings.swaggerExpressValidator.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swagger-express-validator", "validator")
@js.native
object validator extends js.Object {
  def apply(options: Options): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

