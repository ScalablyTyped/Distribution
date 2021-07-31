package typings.uirouterCore

import typings.uirouterCore.anon.Configuration
import typings.uirouterCore.anon.Hash
import typings.uirouterCore.anon.Instantiable
import typings.uirouterCore.anon.InstantiableLocationConfig
import typings.uirouterCore.coreservicesMod.InjectorLike
import typings.uirouterCore.coreservicesMod.LocationServices
import typings.uirouterCore.coreservicesMod.QLike
import typings.uirouterCore.routerMod.UIRouter
import typings.uirouterCore.vanillaInterfaceMod.LocationPlugin
import typings.uirouterCore.vanillaInterfaceMod.ServicesPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vanillaMod {
  
  @JSImport("@uirouter/core/lib/vanilla", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@uirouter/core/lib/vanilla", "BaseLocationServices")
  @js.native
  abstract class BaseLocationServices protected ()
    extends typings.uirouterCore.indexMod.BaseLocationServices {
    def this(router: UIRouter, fireAfterUpdate: Boolean) = this()
  }
  
  @JSImport("@uirouter/core/lib/vanilla", "BrowserLocationConfig")
  @js.native
  class BrowserLocationConfig ()
    extends typings.uirouterCore.indexMod.BrowserLocationConfig {
    def this(router: js.Any) = this()
    def this(router: js.Any, _isHtml5: Boolean) = this()
    def this(router: Unit, _isHtml5: Boolean) = this()
  }
  
  @JSImport("@uirouter/core/lib/vanilla", "HashLocationService")
  @js.native
  class HashLocationService protected ()
    extends typings.uirouterCore.indexMod.HashLocationService {
    def this(router: UIRouter) = this()
  }
  
  @JSImport("@uirouter/core/lib/vanilla", "MemoryLocationConfig")
  @js.native
  class MemoryLocationConfig ()
    extends typings.uirouterCore.indexMod.MemoryLocationConfig
  
  @JSImport("@uirouter/core/lib/vanilla", "MemoryLocationService")
  @js.native
  class MemoryLocationService protected ()
    extends typings.uirouterCore.indexMod.MemoryLocationService {
    def this(router: UIRouter) = this()
  }
  
  @JSImport("@uirouter/core/lib/vanilla", "PushStateLocationService")
  @js.native
  class PushStateLocationService protected ()
    extends typings.uirouterCore.indexMod.PushStateLocationService {
    def this(router: UIRouter) = this()
  }
  
  @scala.inline
  def buildUrl(loc: LocationServices): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildUrl")(loc.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getParams(queryString: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getParams")(queryString.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def hashLocationPlugin(router: UIRouter): LocationPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("hashLocationPlugin")(router.asInstanceOf[js.Any]).asInstanceOf[LocationPlugin]
  
  @JSImport("@uirouter/core/lib/vanilla", "$injector")
  @js.native
  val injector: InjectorLike = js.native
  
  @scala.inline
  def keyValsToObjectR(accum: js.Any, hasKeyVal: js.Tuple2[js.Any, js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("keyValsToObjectR")(accum.asInstanceOf[js.Any], hasKeyVal.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def locationPluginFactory(
    name: String,
    isHtml5: Boolean,
    serviceClass: Instantiable,
    configurationClass: InstantiableLocationConfig
  ): js.Function1[/* uiRouter */ UIRouter, Configuration] = (^.asInstanceOf[js.Dynamic].applyDynamic("locationPluginFactory")(name.asInstanceOf[js.Any], isHtml5.asInstanceOf[js.Any], serviceClass.asInstanceOf[js.Any], configurationClass.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* uiRouter */ UIRouter, Configuration]]
  
  @scala.inline
  def memoryLocationPlugin(router: UIRouter): LocationPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryLocationPlugin")(router.asInstanceOf[js.Any]).asInstanceOf[LocationPlugin]
  
  @scala.inline
  def parseUrl(url: String): Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Hash]
  
  @scala.inline
  def pushStateLocationPlugin(router: UIRouter): LocationPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("pushStateLocationPlugin")(router.asInstanceOf[js.Any]).asInstanceOf[LocationPlugin]
  
  @JSImport("@uirouter/core/lib/vanilla", "$q")
  @js.native
  val q: QLike = js.native
  
  @scala.inline
  def servicesPlugin(router: UIRouter): ServicesPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("servicesPlugin")(router.asInstanceOf[js.Any]).asInstanceOf[ServicesPlugin]
}
