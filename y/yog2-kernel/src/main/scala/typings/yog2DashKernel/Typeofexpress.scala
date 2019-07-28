package typings.yog2DashKernel

import typings.bodyDashParser.bodyDashParserMod.Options
import typings.bodyDashParser.bodyDashParserMod.OptionsJson
import typings.bodyDashParser.bodyDashParserMod.OptionsText
import typings.bodyDashParser.bodyDashParserMod.OptionsUrlencoded
import typings.connect.connectMod.NextHandleFunction
import typings.express.expressMod.Application
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.express.expressMod.RouterOptions
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Handler
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.serveDashStatic.serveDashStaticMod.ServeStaticOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofexpress extends js.Object {
  /**
    * These are the exposed prototypes.
    */
  @JSName("application")
  var application_Original: Application = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSName("json")
  var json_Original: Fn_Options = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with Buffer payloads and is based on body-parser.
    * @since 4.17.0
    */
  @JSName("raw")
  var raw_Original: Fn_OptionsNextHandleFunction_1182122414 = js.native
  var request: Request = js.native
  var response: Response = js.native
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  @JSName("static")
  var static_Original: Anon_Mime = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with text payloads and is based on body-parser.
    * @since 4.17.0
    */
  @JSName("text")
  var text_Original: Fn_OptionsNextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSName("urlencoded")
  var urlencoded_Original: Fn_OptionsNextHandleFunctionOptionsUrlencoded = js.native
  def Router(): typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Router = js.native
  def Router(options: RouterOptions): typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Router = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  /**
    * These are the exposed prototypes.
    */
  def application(
    req: typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request,
    res: typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response
  ): js.Any = js.native
  /**
    * These are the exposed prototypes.
    */
  def application(
    req: typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request,
    res: ServerResponse
  ): js.Any = js.native
  /**
    * These are the exposed prototypes.
    */
  def application(
    req: IncomingMessage,
    res: typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response
  ): js.Any = js.native
  /**
    * These are the exposed prototypes.
    */
  def application(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  def json(): NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  def json(options: OptionsJson): NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with Buffer payloads and is based on body-parser.
    * @since 4.17.0
    */
  def raw(): NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with Buffer payloads and is based on body-parser.
    * @since 4.17.0
    */
  def raw(options: Options): NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  def static(root: String): Handler = js.native
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  def static(root: String, options: ServeStaticOptions): Handler = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with text payloads and is based on body-parser.
    * @since 4.17.0
    */
  def text(): NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with text payloads and is based on body-parser.
    * @since 4.17.0
    */
  def text(options: OptionsText): NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  def urlencoded(): NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  def urlencoded(options: OptionsUrlencoded): NextHandleFunction = js.native
}

