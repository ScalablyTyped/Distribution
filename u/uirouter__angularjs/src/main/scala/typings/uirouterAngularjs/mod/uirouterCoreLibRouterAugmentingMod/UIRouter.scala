package typings.uirouterAngularjs.mod.uirouterCoreLibRouterAugmentingMod

import typings.uirouterAngularjs.stateProviderMod.StateProvider
import typings.uirouterAngularjs.urlRouterProviderMod.UrlRouterProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIRouter extends js.Object {
  /** @hidden */
  var stateProvider: StateProvider
  /** @hidden */
  var urlRouterProvider: UrlRouterProvider
}

object UIRouter {
  @scala.inline
  def apply(stateProvider: StateProvider, urlRouterProvider: UrlRouterProvider): UIRouter = {
    val __obj = js.Dynamic.literal(stateProvider = stateProvider.asInstanceOf[js.Any], urlRouterProvider = urlRouterProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIRouter]
  }
}

