package typings.uirouterAngularjs.servicesMod.uirouterCoreLibRouterAugmentingMod

import typings.uirouterAngularjs.stateProviderMod.StateProvider
import typings.uirouterAngularjs.urlRouterProviderMod.UrlRouterProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIRouter extends js.Object {
  /** @hidden */
  var stateProvider: StateProvider = js.native
  /** @hidden */
  var urlRouterProvider: UrlRouterProvider = js.native
}

object UIRouter {
  @scala.inline
  def apply(stateProvider: StateProvider, urlRouterProvider: UrlRouterProvider): UIRouter = {
    val __obj = js.Dynamic.literal(stateProvider = stateProvider.asInstanceOf[js.Any], urlRouterProvider = urlRouterProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIRouter]
  }
  @scala.inline
  implicit class UIRouterOps[Self <: UIRouter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStateProvider(value: StateProvider): Self = this.set("stateProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrlRouterProvider(value: UrlRouterProvider): Self = this.set("urlRouterProvider", value.asInstanceOf[js.Any])
  }
  
}

