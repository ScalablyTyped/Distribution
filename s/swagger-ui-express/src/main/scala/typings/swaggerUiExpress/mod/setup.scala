package typings.swaggerUiExpress.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swagger-ui-express", "setup")
@js.native
object setup extends js.Object {
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(swaggerDoc: js.UndefOr[scala.Nothing], isExplorer: Boolean): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(
    swaggerDoc: js.UndefOr[JsonObject],
    opts: js.UndefOr[SwaggerUiOptions],
    options: js.UndefOr[SwaggerOptions],
    customCss: js.UndefOr[String],
    customfavIcon: js.UndefOr[String],
    swaggerUrl: js.UndefOr[String],
    customSiteTitle: js.UndefOr[String]
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(swaggerDoc: JsonObject): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(swaggerDoc: JsonObject, isExplorer: Boolean): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

