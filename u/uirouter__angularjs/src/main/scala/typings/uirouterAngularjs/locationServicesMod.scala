package typings.uirouterAngularjs

import typings.angular.mod.ILocationProvider
import typings.angular.mod.ILocationService
import typings.angular.mod.IWindowService
import typings.uirouterCore.coreservicesMod.LocationConfig
import typings.uirouterCore.coreservicesMod.LocationServices
import typings.uirouterCore.mod.UIRouter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locationServicesMod {
  
  @JSImport("@uirouter/angularjs/lib/locationServices", "Ng1LocationServices")
  @js.native
  class Ng1LocationServices protected ()
    extends StObject
       with LocationConfig
       with LocationServices {
    def this($locationProvider: ILocationProvider) = this()
    
    /* private */ @JSName("$browser")
    var $browser: js.Any = js.native
    
    /* private */ @JSName("$location")
    var $location: js.Any = js.native
    
    /* private */ @JSName("$locationProvider")
    var $locationProvider: js.Any = js.native
    
    /* private */ @JSName("$sniffer")
    var $sniffer: js.Any = js.native
    
    /* private */ @JSName("$window")
    var $window: js.Any = js.native
    
    /* private */ var _baseHref: js.Any = js.native
    
    def _runtimeServices(
      $rootScope: js.Any,
      $location: ILocationService,
      $sniffer: js.Any,
      $browser: js.Any,
      $window: IWindowService
    ): Unit = js.native
    
    /* private */ var _urlListeners: js.Any = js.native
    
    @JSName("hashPrefix")
    var hashPrefix_FNg1LocationServices: js.Any = js.native
    
    @JSName("hash")
    var hash_FNg1LocationServices: js.Any = js.native
    
    @JSName("host")
    var host_FNg1LocationServices: js.Any = js.native
    
    def onChange(callback: js.Function): js.Function0[js.Array[js.Function]] = js.native
    
    @JSName("path")
    var path_FNg1LocationServices: js.Any = js.native
    
    @JSName("port")
    var port_FNg1LocationServices: js.Any = js.native
    
    @JSName("protocol")
    var protocol_FNg1LocationServices: js.Any = js.native
    
    @JSName("search")
    var search_FNg1LocationServices: js.Any = js.native
  }
  /* static members */
  object Ng1LocationServices {
    
    @JSImport("@uirouter/angularjs/lib/locationServices", "Ng1LocationServices")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Applys ng1-specific path parameter encoding
      *
      * The Angular 1 `$location` service is a bit weird.
      * It doesn't allow slashes to be encoded/decoded bi-directionally.
      *
      * See the writeup at https://github.com/angular-ui/ui-router/issues/2598
      *
      * This code patches the `path` parameter type so it encoded/decodes slashes as ~2F
      *
      * @param router
      */
    inline def monkeyPatchPathParameterType(router: UIRouter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("monkeyPatchPathParameterType")(router.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
