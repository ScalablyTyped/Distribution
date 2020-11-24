package typings.vueRouter.routerMod

import org.scalablytyped.runtime.TopLevel
import typings.vue.pluginMod.PluginFunction
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import typings.vueRouter.anon.Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-router/types/router", "VueRouter")
@js.native
class VueRouter () extends js.Object {
  def this(options: RouterOptions) = this()
  
  def addRoutes(routes: js.Array[RouteConfig]): Unit = js.native
  
  def afterEach(hook: js.Function2[/* to */ Route, /* from */ Route, _]): js.Function = js.native
  
  var app: Vue = js.native
  
  def back(): Unit = js.native
  
  def beforeEach(guard: NavigationGuard[Vue]): js.Function = js.native
  
  def beforeResolve(guard: NavigationGuard[Vue]): js.Function = js.native
  
  var currentRoute: Route = js.native
  
  def forward(): Unit = js.native
  
  def getMatchedComponents(): js.Array[Component] = js.native
  def getMatchedComponents(to: RawLocation): js.Array[Component] = js.native
  def getMatchedComponents(to: Route): js.Array[Component] = js.native
  
  def go(n: Double): Unit = js.native
  
  var mode: RouterMode = js.native
  
  def onError(cb: ErrorHandler): Unit = js.native
  
  def onReady(cb: js.Function): Unit = js.native
  def onReady(cb: js.Function, errorCb: ErrorHandler): Unit = js.native
  
  var options: RouterOptions = js.native
  
  def push(location: RawLocation): Unit = js.native
  def push(location: RawLocation, onComplete: js.UndefOr[scala.Nothing], onAbort: ErrorHandler): Unit = js.native
  def push(location: RawLocation, onComplete: js.Function): Unit = js.native
  def push(location: RawLocation, onComplete: js.Function, onAbort: ErrorHandler): Unit = js.native
  @JSName("push")
  def push_Promise(location: RawLocation): js.Promise[Route] = js.native
  
  def replace(location: RawLocation): Unit = js.native
  def replace(location: RawLocation, onComplete: js.UndefOr[scala.Nothing], onAbort: ErrorHandler): Unit = js.native
  def replace(location: RawLocation, onComplete: js.Function): Unit = js.native
  def replace(location: RawLocation, onComplete: js.Function, onAbort: ErrorHandler): Unit = js.native
  @JSName("replace")
  def replace_Promise(location: RawLocation): js.Promise[Route] = js.native
  
  def resolve(to: RawLocation): Href = js.native
  def resolve(to: RawLocation, current: js.UndefOr[scala.Nothing], append: Boolean): Href = js.native
  def resolve(to: RawLocation, current: Route): Href = js.native
  def resolve(to: RawLocation, current: Route, append: Boolean): Href = js.native
}
/* static members */
@JSImport("vue-router/types/router", "VueRouter")
@js.native
object VueRouter extends js.Object {
  
  var NavigationFailureType: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NavigationFailureType * / any ]: vue-router.vue-router/types/router.NavigationFailureType}
    */ typings.vueRouter.vueRouterStrings.VueRouter with TopLevel[js.Any] = js.native
  
  def install(Vue: VueConstructor[Vue]): Unit = js.native
  def install(Vue: VueConstructor[Vue], options: scala.Nothing): Unit = js.native
  @JSName("install")
  var install_Original: PluginFunction[scala.Nothing] = js.native
  
  def isNavigationFailure(error: js.Any): /* is vue-router.vue-router/types/router.NavigationFailure */ Boolean = js.native
  def isNavigationFailure(error: js.Any, `type`: Double): /* is vue-router.vue-router/types/router.NavigationFailure */ Boolean = js.native
  
  var version: String = js.native
}
