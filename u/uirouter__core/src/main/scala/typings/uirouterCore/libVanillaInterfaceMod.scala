package typings.uirouterCore

import typings.uirouterCore.libCommonCoreservicesMod.InjectorLike
import typings.uirouterCore.libCommonCoreservicesMod.LocationConfig
import typings.uirouterCore.libCommonCoreservicesMod.LocationServices
import typings.uirouterCore.libCommonCoreservicesMod.QLike
import typings.uirouterCore.libInterfaceMod.UIRouterPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVanillaInterfaceMod {
  
  @js.native
  trait HistoryLike extends StObject {
    
    def back(): Unit = js.native
    def back(distance: Any): Unit = js.native
    
    def forward(): Unit = js.native
    def forward(distance: Any): Unit = js.native
    
    def pushState(statedata: Any): Unit = js.native
    def pushState(statedata: Any, title: String): Unit = js.native
    def pushState(statedata: Any, title: String, url: String): Unit = js.native
    def pushState(statedata: Any, title: Unit, url: String): Unit = js.native
    
    def replaceState(statedata: Any): Unit = js.native
    def replaceState(statedata: Any, title: String): Unit = js.native
    def replaceState(statedata: Any, title: String, url: String): Unit = js.native
    def replaceState(statedata: Any, title: Unit, url: String): Unit = js.native
  }
  
  trait LocationLike extends StObject {
    
    var hash: String
    
    var pathname: String
    
    var search: String
  }
  object LocationLike {
    
    inline def apply(hash: String, pathname: String, search: String): LocationLike = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocationLike] (val x: Self) extends AnyVal {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LocationPlugin
    extends StObject
       with UIRouterPlugin {
    
    var configuration: LocationConfig = js.native
    
    var service: LocationServices = js.native
  }
  
  @js.native
  trait ServicesPlugin
    extends StObject
       with UIRouterPlugin {
    
    @JSName("$injector")
    var $injector: InjectorLike = js.native
    
    @JSName("$q")
    var $q: QLike = js.native
  }
}
