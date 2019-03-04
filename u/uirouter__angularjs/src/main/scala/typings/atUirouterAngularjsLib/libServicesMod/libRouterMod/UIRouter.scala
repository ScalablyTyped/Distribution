package typings
package atUirouterAngularjsLib.libServicesMod.libRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIRouter extends js.Object {
  /** @hidden */
  var stateProvider: atUirouterAngularjsLib.libStateProviderMod.StateProvider
  /** @hidden */
  var urlRouterProvider: atUirouterAngularjsLib.libUrlRouterProviderMod.UrlRouterProvider
}

object UIRouter {
  @scala.inline
  def apply(
    stateProvider: atUirouterAngularjsLib.libStateProviderMod.StateProvider,
    urlRouterProvider: atUirouterAngularjsLib.libUrlRouterProviderMod.UrlRouterProvider
  ): UIRouter = {
    val __obj = js.Dynamic.literal(stateProvider = stateProvider, urlRouterProvider = urlRouterProvider)
  
    __obj.asInstanceOf[UIRouter]
  }
}

