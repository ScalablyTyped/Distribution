package typings.swaggerDashUiDashExpress.swaggerDashUiDashExpressMod

import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.serveDashStatic.serveDashStaticMod.ServeStaticOptions
import typings.swaggerDashUiDashExpress.swaggerDashUiDashExpressNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwaggerUiExpress extends js.Object {
  /**
    * Returns handlers for serving Swagger UI files.
    * This includes custom initialization js file and static files of Swagger UI.
    *
    * @returns Express handlers that process requests and return files for Swagger UI.
    */
  var serve: js.Array[RequestHandler[ParamsDictionary]] = js.native
  /**
    * Generates the custom html page for the UI API.
    *
    * @param swaggerDoc json object with the API schema.
    * @param opts swagger-ui-express options.
    * @param options custom swagger options.
    * @param customCss string with a custom css to embed into the page.
    * @param customfavIcon link to a custom favicon.
    * @param swaggerUrl Url of the swagger API schema, can be specified instead of the swaggerDoc.
    * @param customeSiteTitle custom title for a page
    * @returns the generated html page.
    */
  @JSName("generateHTML")
  def generateHTML_false(
    swaggerDoc: js.UndefOr[JsonObject | Null],
    opts: js.UndefOr[SwaggerUiOptions | `false` | Null],
    options: js.UndefOr[SwaggerOptions],
    customCss: js.UndefOr[String | `false` | Null],
    customfavIcon: js.UndefOr[String | `false` | Null],
    swaggerUrl: js.UndefOr[String | `false` | Null],
    customeSiteTitle: js.UndefOr[String | `false` | Null]
  ): String = js.native
  /**
    * Returns handlers for serving Swagger UI files.
    * This includes custom initialization js file and static files of Swagger UI.
    * Additional options object is passed to Swagger UI.
    *
    * @param swaggerDoc json object with the Swagger API schema.
    * @param opts options to pass to Swagger UI.
    * @returns Express handlers that process requests and return files for Swagger UI.
    */
  def serveFiles(): js.Array[RequestHandler[ParamsDictionary]] = js.native
  def serveFiles(swaggerDoc: JsonObject): js.Array[RequestHandler[ParamsDictionary]] = js.native
  def serveFiles(swaggerDoc: JsonObject, opts: SwaggerUiOptions): js.Array[RequestHandler[ParamsDictionary]] = js.native
  /**
    * Returns handlers for serving Swagger UI files.
    * This includes custom initialization js file and static files of Swagger UI.
    * Additional options are passed to the express.static middleware.
    *
    * @param options options object that is passed to the express.static middleware.
    * @returns Express handlers that process requests and return files for Swagger UI.
    */
  def serveWithOptions(options: ServeStaticOptions): js.Array[RequestHandler[ParamsDictionary]] = js.native
  /**
    * Creates a middleware function that returns the pre-generated html file for the Swagger UI page.
    *
    * @param swaggerDoc json object with the API schema.
    * @param opts swagger-ui-express options.
    * @param options custom swagger options.
    * @param customCss string with a custom css to embed into the page.
    * @param customfavIcon link to a custom favicon.
    * @param swaggerUrl Url of the swagger API schema, can be specified instead of the swaggerDoc.
    * @param customeSiteTitle custom title for a page
    * @returns an express middleware function that returns the generated html page.
    */
  @JSName("setup")
  def setup_false(
    swaggerDoc: js.UndefOr[JsonObject | Null],
    opts: js.UndefOr[SwaggerUiOptions | `false` | Null],
    options: js.UndefOr[SwaggerOptions],
    customCss: js.UndefOr[String | `false` | Null],
    customfavIcon: js.UndefOr[String | `false` | Null],
    swaggerUrl: js.UndefOr[String | `false` | Null],
    customeSiteTitle: js.UndefOr[String | `false` | Null]
  ): RequestHandler[ParamsDictionary] = js.native
}

