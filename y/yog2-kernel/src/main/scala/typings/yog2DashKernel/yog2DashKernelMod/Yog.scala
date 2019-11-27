package typings.yog2DashKernel.yog2DashKernelMod

import typings.express.expressMod.Express
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.lodash.lodashMod.LoDashStatic
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.yog2DashKernel.Anon_CleanCache
import typings.yog2DashKernel.TypeofRAL
import typings.yog2DashKernel.TypeofRALPromise
import typings.yog2DashKernel.Typeofexpress
import typings.yogDashLog.yogDashLogMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Yog extends js.Object {
  var RAL: TypeofRAL = js.native
  var ROOT_PATH: String = js.native
  var `_`: LoDashStatic = js.native
  @JSName("app")
  var app_Original: Express = js.native
  @JSName("express")
  var express_Original: (js.Function0[
    typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Express
  ]) with Typeofexpress = js.native
  var log: Logger = js.native
  // 当 yog.conf.promise.overrideRAL 为true时，可以当作promise使用
  var ral: TypeofRAL | TypeofRALPromise = js.native
  var ralP: TypeofRALPromise = js.native
  // debug模式时存在
  var reloadApp: js.UndefOr[js.Function1[/* appName */ String, Unit]] = js.native
  // debug模式时存在
  var reloadIsomorphic: js.UndefOr[js.Function0[Unit]] = js.native
  // debug模式时存在
  var reloadView: js.UndefOr[js.Function0[Unit]] = js.native
  var view: Anon_CleanCache = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(
    req: typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request[ParamsDictionary, _, _],
    res: typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response[_]
  ): js.Any = js.native
  def app(
    req: typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request[ParamsDictionary, _, _],
    res: ServerResponse
  ): js.Any = js.native
  def app(
    req: IncomingMessage,
    res: typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response[_]
  ): js.Any = js.native
  def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  def bootstrap(option: YogBootstrapOption): Unit = js.native
  def bootstrap(option: YogBootstrapOption, callback: js.Function0[Unit]): Unit = js.native
  def express(): typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Express = js.native
}

