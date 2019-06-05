package typings
package yog2DashKernelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofexpress extends js.Object {
  /**
    * These are the exposed prototypes.
    */
  @JSName("application")
  var application_Original: expressLib.expressMod.Application = js.native
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
  var request: expressLib.expressMod.Request = js.native
  var response: expressLib.expressMod.Response = js.native
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
  def Router(): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Router = js.native
  def Router(options: expressLib.expressMod.RouterOptions): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Router = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  /**
    * These are the exposed prototypes.
    */
  def application(
    req: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request,
    res: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response
  ): js.Any = js.native
  /**
    * These are the exposed prototypes.
    */
  def application(
    req: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request,
    res: nodeLib.httpMod.ServerResponse
  ): js.Any = js.native
  /**
    * These are the exposed prototypes.
    */
  def application(
    req: nodeLib.httpMod.IncomingMessage,
    res: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response
  ): js.Any = js.native
  /**
    * These are the exposed prototypes.
    */
  def application(req: nodeLib.httpMod.IncomingMessage, res: nodeLib.httpMod.ServerResponse): js.Any = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  def json(): connectLib.connectMod.NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  def json(options: bodyDashParserLib.bodyDashParserMod.OptionsJson): connectLib.connectMod.NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with Buffer payloads and is based on body-parser.
    * @since 4.17.0
    */
  def raw(): connectLib.connectMod.NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with Buffer payloads and is based on body-parser.
    * @since 4.17.0
    */
  def raw(options: bodyDashParserLib.bodyDashParserMod.Options): connectLib.connectMod.NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  def static(root: java.lang.String): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Handler = js.native
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  def static(root: java.lang.String, options: serveDashStaticLib.serveDashStaticMod.ServeStaticOptions): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Handler = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with text payloads and is based on body-parser.
    * @since 4.17.0
    */
  def text(): connectLib.connectMod.NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with text payloads and is based on body-parser.
    * @since 4.17.0
    */
  def text(options: bodyDashParserLib.bodyDashParserMod.OptionsText): connectLib.connectMod.NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  def urlencoded(): connectLib.connectMod.NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  def urlencoded(options: bodyDashParserLib.bodyDashParserMod.OptionsUrlencoded): connectLib.connectMod.NextHandleFunction = js.native
}

