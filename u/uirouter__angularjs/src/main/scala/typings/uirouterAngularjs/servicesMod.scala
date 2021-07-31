package typings.uirouterAngularjs

import typings.angular.mod.IRootScopeService
import typings.uirouterAngularjs.stateProviderMod.StateProvider
import typings.uirouterAngularjs.urlRouterProviderMod.UrlRouterProvider
import typings.uirouterCore.commonCommonMod.TypedMap
import typings.uirouterCore.mod.ResolveContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesMod {
  
  @JSImport("@uirouter/angularjs/lib/services", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getLocals(ctx: ResolveContext): TypedMap[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocals")(ctx.asInstanceOf[js.Any]).asInstanceOf[TypedMap[js.Any]]
  
  object watchDigests {
    
    @scala.inline
    def apply($rootScope: IRootScopeService): Unit = ^.asInstanceOf[js.Dynamic].apply($rootScope.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("@uirouter/angularjs/lib/services", "watchDigests")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@uirouter/angularjs/lib/services", "watchDigests.$inject")
    @js.native
    def inject: js.Array[String] = js.native
    
    @scala.inline
    def inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  object uirouterCoreLibRouterAugmentingMod {
    
    trait UIRouter extends StObject {
      
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
      
      @scala.inline
      implicit class UIRouterMutableBuilder[Self <: UIRouter] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setStateProvider(value: StateProvider): Self = StObject.set(x, "stateProvider", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrlRouterProvider(value: UrlRouterProvider): Self = StObject.set(x, "urlRouterProvider", value.asInstanceOf[js.Any])
      }
    }
  }
}
