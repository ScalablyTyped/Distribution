package typings.uirouterAngularjs.mod

import typings.uirouterCore.commonCommonMod.IInjectable
import typings.uirouterCore.urlInterfaceMod.UrlRuleHandlerFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/angularjs", "UrlRouterProvider")
@js.native
class UrlRouterProvider protected ()
  extends typings.uirouterAngularjs.urlRouterProviderMod.UrlRouterProvider {
  /** @hidden */
  def this(/** @hidden */ router: typings.uirouterCore.mod.UIRouter) = this()
}
/* static members */
@JSImport("@uirouter/angularjs", "UrlRouterProvider")
@js.native
object UrlRouterProvider extends js.Object {
  
  def injectableHandler(router: typings.uirouterCore.mod.UIRouter, handler: IInjectable): UrlRuleHandlerFn = js.native
}
