package typings.swaggerDashUiDashExpress.swaggerDashUiDashExpressMod

import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swagger-ui-express", "setup")
@js.native
object setup extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(
    swaggerDoc: js.UndefOr[JsonObject],
    opts: js.UndefOr[SwaggerUiOptions],
    options: js.UndefOr[SwaggerOptions],
    customCss: js.UndefOr[String],
    customfavIcon: js.UndefOr[String],
    swaggerUrl: js.UndefOr[String],
    customSiteTitle: js.UndefOr[String]
  ): RequestHandler[ParamsDictionary] = js.native
  def apply(swaggerDoc: JsonObject): RequestHandler[ParamsDictionary] = js.native
  def apply(swaggerDoc: JsonObject, isExplorer: Boolean): RequestHandler[ParamsDictionary] = js.native
}

