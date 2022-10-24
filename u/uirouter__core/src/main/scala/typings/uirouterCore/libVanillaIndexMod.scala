package typings.uirouterCore

import typings.uirouterCore.anon.Configuration
import typings.uirouterCore.anon.Hash
import typings.uirouterCore.anon.Instantiable
import typings.uirouterCore.anon.InstantiableLocationConfig
import typings.uirouterCore.libCommonCoreservicesMod.InjectorLike
import typings.uirouterCore.libCommonCoreservicesMod.LocationServices
import typings.uirouterCore.libCommonCoreservicesMod.QLike
import typings.uirouterCore.libRouterMod.UIRouter
import typings.uirouterCore.libVanillaInterfaceMod.LocationPlugin
import typings.uirouterCore.libVanillaInterfaceMod.ServicesPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVanillaIndexMod {
  
  @JSImport("@uirouter/core/lib/vanilla/index", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@uirouter/core/lib/vanilla/index", "BaseLocationServices")
  @js.native
  open class BaseLocationServices protected ()
    extends typings.uirouterCore.libVanillaBaseLocationServiceMod.BaseLocationServices {
    def this(router: UIRouter, fireAfterUpdate: Boolean) = this()
  }
  
  @JSImport("@uirouter/core/lib/vanilla/index", "BrowserLocationConfig")
  @js.native
  open class BrowserLocationConfig ()
    extends typings.uirouterCore.libVanillaBrowserLocationConfigMod.BrowserLocationConfig {
    def this(router: Any) = this()
    def this(router: Any, _isHtml5: Boolean) = this()
    def this(router: Unit, _isHtml5: Boolean) = this()
  }
  
  @JSImport("@uirouter/core/lib/vanilla/index", "HashLocationService")
  @js.native
  open class HashLocationService protected ()
    extends typings.uirouterCore.libVanillaHashLocationServiceMod.HashLocationService {
    def this(router: UIRouter) = this()
  }
  
  @JSImport("@uirouter/core/lib/vanilla/index", "MemoryLocationConfig")
  @js.native
  open class MemoryLocationConfig ()
    extends typings.uirouterCore.libVanillaMemoryLocationConfigMod.MemoryLocationConfig
  
  @JSImport("@uirouter/core/lib/vanilla/index", "MemoryLocationService")
  @js.native
  open class MemoryLocationService protected ()
    extends typings.uirouterCore.libVanillaMemoryLocationServiceMod.MemoryLocationService {
    def this(router: UIRouter) = this()
  }
  
  @JSImport("@uirouter/core/lib/vanilla/index", "PushStateLocationService")
  @js.native
  open class PushStateLocationService protected ()
    extends typings.uirouterCore.libVanillaPushStateLocationServiceMod.PushStateLocationService {
    def this(router: UIRouter) = this()
  }
  
  inline def buildUrl(loc: LocationServices): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildUrl")(loc.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getParams(queryString: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getParams")(queryString.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def hashLocationPlugin(router: UIRouter): LocationPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("hashLocationPlugin")(router.asInstanceOf[js.Any]).asInstanceOf[LocationPlugin]
  
  @JSImport("@uirouter/core/lib/vanilla/index", "$injector")
  @js.native
  val injector: InjectorLike = js.native
  
  inline def keyValsToObjectR(accum: Any, param1: js.Tuple2[Any, Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("keyValsToObjectR")(accum.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def locationPluginFactory(
    name: String,
    isHtml5: Boolean,
    serviceClass: Instantiable,
    configurationClass: InstantiableLocationConfig
  ): js.Function1[/* uiRouter */ UIRouter, Configuration] = (^.asInstanceOf[js.Dynamic].applyDynamic("locationPluginFactory")(name.asInstanceOf[js.Any], isHtml5.asInstanceOf[js.Any], serviceClass.asInstanceOf[js.Any], configurationClass.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* uiRouter */ UIRouter, Configuration]]
  
  inline def memoryLocationPlugin(router: UIRouter): LocationPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryLocationPlugin")(router.asInstanceOf[js.Any]).asInstanceOf[LocationPlugin]
  
  inline def parseUrl(url: String): Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Hash]
  
  inline def pushStateLocationPlugin(router: UIRouter): LocationPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("pushStateLocationPlugin")(router.asInstanceOf[js.Any]).asInstanceOf[LocationPlugin]
  
  @JSImport("@uirouter/core/lib/vanilla/index", "$q")
  @js.native
  val q: QLike = js.native
  
  inline def servicesPlugin(router: UIRouter): ServicesPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("servicesPlugin")(router.asInstanceOf[js.Any]).asInstanceOf[ServicesPlugin]
}
