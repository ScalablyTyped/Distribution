package typings.atUirouterAngularjs.libServicesMod.libRouterMod

import typings.atUirouterAngularjs.libStateProviderMod.StateProvider
import typings.atUirouterAngularjs.libUrlRouterProviderMod.UrlRouterProvider
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
    val __obj = js.Dynamic.literal(stateProvider = stateProvider, urlRouterProvider = urlRouterProvider)
  
    __obj.asInstanceOf[UIRouter]
  }
}

