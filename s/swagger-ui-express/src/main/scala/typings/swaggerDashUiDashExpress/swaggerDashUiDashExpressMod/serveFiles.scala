package typings.swaggerDashUiDashExpress.swaggerDashUiDashExpressMod

import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swagger-ui-express", "serveFiles")
@js.native
object serveFiles extends js.Object {
  def apply(): js.Array[RequestHandler[ParamsDictionary]] = js.native
  def apply(swaggerDoc: JsonObject): js.Array[RequestHandler[ParamsDictionary]] = js.native
  def apply(swaggerDoc: JsonObject, opts: SwaggerUiOptions): js.Array[RequestHandler[ParamsDictionary]] = js.native
}

