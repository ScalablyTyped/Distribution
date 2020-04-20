package typings.swaggerUiExpress.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.serveStatic.mod.ServeStaticOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swagger-ui-express", "serveWithOptions")
@js.native
object serveWithOptions extends js.Object {
  def apply(options: ServeStaticOptions): js.Array[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
}

