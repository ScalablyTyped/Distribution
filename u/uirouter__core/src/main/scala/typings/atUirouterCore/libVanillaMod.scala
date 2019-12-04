package typings.atUirouterCore

import typings.atUirouterCore.libCommonCoreservicesMod.$InjectorLike
import typings.atUirouterCore.libCommonCoreservicesMod.$QLike
import typings.atUirouterCore.libCommonCoreservicesMod.LocationServices
import typings.atUirouterCore.libRouterMod.UIRouter
import typings.atUirouterCore.libVanillaInterfaceMod.LocationPlugin
import typings.atUirouterCore.libVanillaInterfaceMod.ServicesPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/vanilla", JSImport.Namespace)
@js.native
object libVanillaMod extends js.Object {
  @js.native
  abstract class BaseLocationServices protected ()
    extends typings.atUirouterCore.libVanillaIndexMod.BaseLocationServices {
    def this(router: UIRouter, fireAfterUpdate: Boolean) = this()
  }
  
  @js.native
  class BrowserLocationConfig ()
    extends typings.atUirouterCore.libVanillaIndexMod.BrowserLocationConfig {
    def this(router: js.Any) = this()
    def this(router: js.Any, _isHtml5: Boolean) = this()
  }
  
  @js.native
  class HashLocationService protected ()
    extends typings.atUirouterCore.libVanillaIndexMod.HashLocationService {
    def this(router: UIRouter) = this()
  }
  
  @js.native
  class MemoryLocationConfig ()
    extends typings.atUirouterCore.libVanillaMemoryLocationConfigMod.MemoryLocationConfig
  
  @js.native
  class MemoryLocationService protected ()
    extends typings.atUirouterCore.libVanillaIndexMod.MemoryLocationService {
    def this(router: UIRouter) = this()
  }
  
  @js.native
  class PushStateLocationService protected ()
    extends typings.atUirouterCore.libVanillaIndexMod.PushStateLocationService {
    def this(router: UIRouter) = this()
  }
  
  @JSName("$injector")
  val $injector: $InjectorLike = js.native
  @JSName("$q")
  val $q: $QLike = js.native
  def buildUrl(loc: LocationServices): String = js.native
  def getParams(queryString: String): js.Any = js.native
  def hashLocationPlugin(router: UIRouter): LocationPlugin = js.native
  def keyValsToObjectR(accum: js.Any, hasKeyVal: js.Tuple2[_, _]): js.Any = js.native
  def locationPluginFactory(name: String, isHtml5: Boolean, serviceClass: Anon_UiRouter, configurationClass: Anon_IsHtml5): js.Function1[/* uiRouter */ UIRouter, Anon_Configuration] = js.native
  def memoryLocationPlugin(router: UIRouter): LocationPlugin = js.native
  def parseUrl(url: String): Anon_Hash = js.native
  def pushStateLocationPlugin(router: UIRouter): LocationPlugin = js.native
  def servicesPlugin(router: UIRouter): ServicesPlugin = js.native
}

