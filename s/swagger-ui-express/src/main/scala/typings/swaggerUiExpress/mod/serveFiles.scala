package typings.swaggerUiExpress.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swagger-ui-express", "serveFiles")
@js.native
object serveFiles extends js.Object {
  def apply(): js.Array[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  def apply(swaggerDoc: js.UndefOr[scala.Nothing], opts: SwaggerUiOptions): js.Array[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  def apply(swaggerDoc: JsonObject): js.Array[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  def apply(swaggerDoc: JsonObject, opts: SwaggerUiOptions): js.Array[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
}

