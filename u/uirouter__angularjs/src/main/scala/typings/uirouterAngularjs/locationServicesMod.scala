package typings.uirouterAngularjs

import typings.angular.mod.ILocationProvider
import typings.angular.mod.ILocationService
import typings.angular.mod.IWindowService
import typings.uirouterCore.coreservicesMod.LocationConfig
import typings.uirouterCore.coreservicesMod.LocationServices
import typings.uirouterCore.mod.UIRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs/lib/locationServices", JSImport.Namespace)
@js.native
object locationServicesMod extends js.Object {
  @js.native
  class Ng1LocationServices protected ()
    extends LocationConfig
       with LocationServices {
    def this($locationProvider: ILocationProvider) = this()
    @JSName("$browser")
    var $browser: js.Any = js.native
    @JSName("$location")
    var $location: js.Any = js.native
    @JSName("$locationProvider")
    var $locationProvider: js.Any = js.native
    @JSName("$sniffer")
    var $sniffer: js.Any = js.native
    @JSName("$window")
    var $window: js.Any = js.native
    var _baseHref: js.Any = js.native
    var _urlListeners: js.Any = js.native
    @JSName("hashPrefix")
    var hashPrefix_FNg1LocationServices: js.Any = js.native
    @JSName("hash")
    var hash_FNg1LocationServices: js.Any = js.native
    @JSName("host")
    var host_FNg1LocationServices: js.Any = js.native
    @JSName("path")
    var path_FNg1LocationServices: js.Any = js.native
    @JSName("port")
    var port_FNg1LocationServices: js.Any = js.native
    @JSName("protocol")
    var protocol_FNg1LocationServices: js.Any = js.native
    @JSName("search")
    var search_FNg1LocationServices: js.Any = js.native
    def _runtimeServices(
      $rootScope: js.Any,
      $location: ILocationService,
      $sniffer: js.Any,
      $browser: js.Any,
      $window: IWindowService
    ): Unit = js.native
    def onChange(callback: js.Function): js.Function0[js.Array[js.Function]] = js.native
  }
  
  /* static members */
  @js.native
  object Ng1LocationServices extends js.Object {
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
    def monkeyPatchPathParameterType(router: UIRouter): Unit = js.native
  }
  
}

