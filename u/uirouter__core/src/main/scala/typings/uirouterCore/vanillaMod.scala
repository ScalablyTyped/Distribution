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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vanillaMod {
  
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
    def this(router: js.UndefOr[scala.Nothing], _isHtml5: Boolean) = this()
    def this(router: js.Any, _isHtml5: Boolean) = this()
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
  
  @JSImport("@uirouter/core/lib/vanilla", "buildUrl")
  @js.native
  def buildUrl(loc: LocationServices): String = js.native
  
  @JSImport("@uirouter/core/lib/vanilla", "getParams")
  @js.native
  def getParams(queryString: String): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/vanilla", "hashLocationPlugin")
  @js.native
  def hashLocationPlugin(router: UIRouter): LocationPlugin = js.native
  
  @JSImport("@uirouter/core/lib/vanilla", "$injector")
  @js.native
  val injector: InjectorLike = js.native
  
  @JSImport("@uirouter/core/lib/vanilla", "keyValsToObjectR")
  @js.native
  def keyValsToObjectR(accum: js.Any, hasKeyVal: js.Tuple2[_, _]): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/vanilla", "locationPluginFactory")
  @js.native
  def locationPluginFactory(
    name: String,
    isHtml5: Boolean,
    serviceClass: Instantiable,
    configurationClass: InstantiableLocationConfig
  ): js.Function1[/* uiRouter */ UIRouter, Configuration] = js.native
  
  @JSImport("@uirouter/core/lib/vanilla", "memoryLocationPlugin")
  @js.native
  def memoryLocationPlugin(router: UIRouter): LocationPlugin = js.native
  
  @JSImport("@uirouter/core/lib/vanilla", "parseUrl")
  @js.native
  def parseUrl(url: String): Hash = js.native
  
  @JSImport("@uirouter/core/lib/vanilla", "pushStateLocationPlugin")
  @js.native
  def pushStateLocationPlugin(router: UIRouter): LocationPlugin = js.native
  
  @JSImport("@uirouter/core/lib/vanilla", "$q")
  @js.native
  val q: QLike = js.native
  
  @JSImport("@uirouter/core/lib/vanilla", "servicesPlugin")
  @js.native
  def servicesPlugin(router: UIRouter): ServicesPlugin = js.native
}
