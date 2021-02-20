package typings.uirouterCore

import typings.uirouterCore.coreservicesMod.InjectorLike
import typings.uirouterCore.coreservicesMod.LocationConfig
import typings.uirouterCore.coreservicesMod.LocationServices
import typings.uirouterCore.coreservicesMod.QLike
import typings.uirouterCore.interfaceMod.UIRouterPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vanillaInterfaceMod {
  
  @js.native
  trait HistoryLike extends StObject {
    
    def back(): Unit = js.native
    def back(distance: js.Any): Unit = js.native
    
    def forward(): Unit = js.native
    def forward(distance: js.Any): Unit = js.native
    
    def pushState(statedata: js.Any): Unit = js.native
    def pushState(statedata: js.Any, title: js.UndefOr[scala.Nothing], url: String): Unit = js.native
    def pushState(statedata: js.Any, title: String): Unit = js.native
    def pushState(statedata: js.Any, title: String, url: String): Unit = js.native
    
    def replaceState(statedata: js.Any): Unit = js.native
    def replaceState(statedata: js.Any, title: js.UndefOr[scala.Nothing], url: String): Unit = js.native
    def replaceState(statedata: js.Any, title: String): Unit = js.native
    def replaceState(statedata: js.Any, title: String, url: String): Unit = js.native
  }
  
  @js.native
  trait LocationLike extends StObject {
    
    var hash: String = js.native
    
    var pathname: String = js.native
    
    var search: String = js.native
  }
  object LocationLike {
    
    @scala.inline
    def apply(hash: String, pathname: String, search: String): LocationLike = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationLike]
    }
    
    @scala.inline
    implicit class LocationLikeMutableBuilder[Self <: LocationLike] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LocationPlugin extends UIRouterPlugin {
    
    var configuration: LocationConfig = js.native
    
    var service: LocationServices = js.native
  }
  
  @js.native
  trait ServicesPlugin extends UIRouterPlugin {
    
    @JSName("$injector")
    var $injector: InjectorLike = js.native
    
    @JSName("$q")
    var $q: QLike = js.native
  }
}
