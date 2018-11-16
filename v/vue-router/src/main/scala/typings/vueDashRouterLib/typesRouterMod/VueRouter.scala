package typings
package vueDashRouterLib.typesRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue-router/types/router", "VueRouter")
@js.native
class VueRouter () extends js.Object {
  def this(options: RouterOptions) = this()
  var app: vueLib.typesVueMod.Vue = js.native
  var currentRoute: Route = js.native
  var mode: RouterMode = js.native
  def addRoutes(routes: js.Array[RouteConfig]): scala.Unit = js.native
  def afterEach(hook: js.Function2[/* to */ Route, /* from */ Route, _]): js.Function = js.native
  def back(): scala.Unit = js.native
  def beforeEach(guard: NavigationGuard): js.Function = js.native
  def beforeResolve(guard: NavigationGuard): js.Function = js.native
  def forward(): scala.Unit = js.native
  def getMatchedComponents(): js.Array[Component] = js.native
  def getMatchedComponents(to: RawLocation): js.Array[Component] = js.native
  def getMatchedComponents(to: Route): js.Array[Component] = js.native
  def go(n: scala.Double): scala.Unit = js.native
  def onError(cb: js.Function): scala.Unit = js.native
  def onReady(cb: js.Function): scala.Unit = js.native
  def onReady(cb: js.Function, errorCb: js.Function): scala.Unit = js.native
  def push(location: RawLocation): scala.Unit = js.native
  def push(location: RawLocation, onComplete: js.Function): scala.Unit = js.native
  def push(location: RawLocation, onComplete: js.Function, onAbort: js.Function): scala.Unit = js.native
  def replace(location: RawLocation): scala.Unit = js.native
  def replace(location: RawLocation, onComplete: js.Function): scala.Unit = js.native
  def replace(location: RawLocation, onComplete: js.Function, onAbort: js.Function): scala.Unit = js.native
  def resolve(to: RawLocation): vueDashRouterLib.Anon_Location = js.native
  def resolve(to: RawLocation, current: Route): vueDashRouterLib.Anon_Location = js.native
  def resolve(to: RawLocation, current: Route, append: scala.Boolean): vueDashRouterLib.Anon_Location = js.native
}

@JSImport("vue-router/types/router", "VueRouter")
@js.native
object VueRouter extends js.Object {
  @JSName("install")
  var install_Original: vueLib.typesPluginMod.PluginFunction[scala.Nothing] = js.native
  def install(Vue: vueLib.typesVueMod.VueConstructor[vueLib.typesVueMod.Vue]): scala.Unit = js.native
  def install(Vue: vueLib.typesVueMod.VueConstructor[vueLib.typesVueMod.Vue], options: scala.Nothing): scala.Unit = js.native
}

