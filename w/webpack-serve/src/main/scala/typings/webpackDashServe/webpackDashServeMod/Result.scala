package typings.webpackDashServe.webpackDashServeMod

import typings.webpackDashServe.Anon_Compiler
import typings.webpackDashServe.Anon_CompilerStats
import typings.webpackDashServe.Anon_CompilerStatsAny
import typings.webpackDashServe.Anon_Options
import typings.webpackDashServe.webpackDashServeStrings.`build-finished`
import typings.webpackDashServe.webpackDashServeStrings.`build-started`
import typings.webpackDashServe.webpackDashServeStrings.`compiler-error`
import typings.webpackDashServe.webpackDashServeStrings.`compiler-warning`
import typings.webpackDashServe.webpackDashServeStrings.listening
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  /** An instance of a Koa application, extended with a server property, and stop method, which is used to programatically stop the server */
  var app: InitializedKoa = js.native
  /** Access to a frozen copy of the internal options object used by the module. */
  var options: InitializedOptions = js.native
  @JSName("on")
  def on_buildfinished(`type`: `build-finished`, callback: js.Function1[/* args */ Anon_CompilerStats, Unit]): Unit = js.native
  /** A function which binds a serve event-name to a function */
  @JSName("on")
  def on_buildstarted(`type`: `build-started`, callback: js.Function1[/* args */ Anon_Compiler, Unit]): Unit = js.native
  @JSName("on")
  def on_compilererror(`type`: `compiler-error`, callback: js.Function1[/* args */ Anon_CompilerStatsAny, Unit]): Unit = js.native
  @JSName("on")
  def on_compilerwarning(`type`: `compiler-warning`, callback: js.Function1[/* args */ Anon_CompilerStatsAny, Unit]): Unit = js.native
  @JSName("on")
  def on_listening(`type`: listening, callback: js.Function1[/* args */ Anon_Options, Unit]): Unit = js.native
}

