package typings.uirouterAngularjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object uirouterCoreLibRouterAugmentingMod {
  
  trait UIRouter extends StObject {
    
    /** @hidden */
    var stateProvider: typings.uirouterAngularjs.libStateProviderMod.StateProvider
    
    /** @hidden */
    var urlRouterProvider: typings.uirouterAngularjs.libUrlRouterProviderMod.UrlRouterProvider
  }
  object UIRouter {
    
    inline def apply(
      stateProvider: typings.uirouterAngularjs.libStateProviderMod.StateProvider,
      urlRouterProvider: typings.uirouterAngularjs.libUrlRouterProviderMod.UrlRouterProvider
    ): typings.uirouterAngularjs.mod.uirouterCoreLibRouterAugmentingMod.UIRouter = {
      val __obj = js.Dynamic.literal(stateProvider = stateProvider.asInstanceOf[js.Any], urlRouterProvider = urlRouterProvider.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.uirouterAngularjs.mod.uirouterCoreLibRouterAugmentingMod.UIRouter]
    }
    
    extension [Self <: typings.uirouterAngularjs.mod.uirouterCoreLibRouterAugmentingMod.UIRouter](x: Self) {
      
      inline def setStateProvider(value: typings.uirouterAngularjs.libStateProviderMod.StateProvider): Self = StObject.set(x, "stateProvider", value.asInstanceOf[js.Any])
      
      inline def setUrlRouterProvider(value: typings.uirouterAngularjs.libUrlRouterProviderMod.UrlRouterProvider): Self = StObject.set(x, "urlRouterProvider", value.asInstanceOf[js.Any])
    }
  }
}
