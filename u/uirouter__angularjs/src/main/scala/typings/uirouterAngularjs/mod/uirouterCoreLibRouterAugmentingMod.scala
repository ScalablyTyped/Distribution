package typings.uirouterAngularjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uirouterCoreLibRouterAugmentingMod {
  
  trait UIRouter extends StObject {
    
    /** @hidden */
    var stateProvider: typings.uirouterAngularjs.stateProviderMod.StateProvider
    
    /** @hidden */
    var urlRouterProvider: typings.uirouterAngularjs.urlRouterProviderMod.UrlRouterProvider
  }
  object UIRouter {
    
    @scala.inline
    def apply(
      stateProvider: typings.uirouterAngularjs.stateProviderMod.StateProvider,
      urlRouterProvider: typings.uirouterAngularjs.urlRouterProviderMod.UrlRouterProvider
    ): typings.uirouterAngularjs.mod.uirouterCoreLibRouterAugmentingMod.UIRouter = {
      val __obj = js.Dynamic.literal(stateProvider = stateProvider.asInstanceOf[js.Any], urlRouterProvider = urlRouterProvider.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.uirouterAngularjs.mod.uirouterCoreLibRouterAugmentingMod.UIRouter]
    }
    
    @scala.inline
    implicit class UIRouterMutableBuilder[Self <: typings.uirouterAngularjs.mod.uirouterCoreLibRouterAugmentingMod.UIRouter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStateProvider(value: typings.uirouterAngularjs.stateProviderMod.StateProvider): Self = StObject.set(x, "stateProvider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlRouterProvider(value: typings.uirouterAngularjs.urlRouterProviderMod.UrlRouterProvider): Self = StObject.set(x, "urlRouterProvider", value.asInstanceOf[js.Any])
    }
  }
}
