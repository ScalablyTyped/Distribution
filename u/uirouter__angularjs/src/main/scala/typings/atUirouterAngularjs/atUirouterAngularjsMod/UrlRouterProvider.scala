package typings.atUirouterAngularjs.atUirouterAngularjsMod

import typings.atUirouterCore.libUrlInterfaceMod.UrlRuleHandlerFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "UrlRouterProvider")
@js.native
class UrlRouterProvider protected ()
  extends typings.atUirouterAngularjs.libUrlRouterProviderMod.UrlRouterProvider {
  /** @hidden */
  def this(/** @hidden */ router: typings.atUirouterCore.atUirouterCoreMod.UIRouter) = this()
}

/* static members */
@JSImport("@uirouter/angularjs", "UrlRouterProvider")
@js.native
object UrlRouterProvider extends js.Object {
  def injectableHandler(router: typings.atUirouterCore.atUirouterCoreMod.UIRouter, handler: js.Any): UrlRuleHandlerFn = js.native
}

