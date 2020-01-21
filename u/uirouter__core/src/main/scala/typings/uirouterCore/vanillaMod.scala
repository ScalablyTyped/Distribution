package typings.uirouterCore

import typings.uirouterCore.coreservicesMod.InjectorLike
import typings.uirouterCore.coreservicesMod.LocationServices
import typings.uirouterCore.coreservicesMod.QLike
import typings.uirouterCore.routerMod.UIRouter
import typings.uirouterCore.vanillaInterfaceMod.LocationPlugin
import typings.uirouterCore.vanillaInterfaceMod.ServicesPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/vanilla", JSImport.Namespace)
@js.native
object vanillaMod extends js.Object {
  @js.native
  abstract class BaseLocationServices protected ()
    extends typings.uirouterCore.indexMod.BaseLocationServices {
    def this(router: UIRouter, fireAfterUpdate: Boolean) = this()
  }
  
  @js.native
  class BrowserLocationConfig ()
    extends typings.uirouterCore.indexMod.BrowserLocationConfig {
    def this(router: js.Any) = this()
    def this(router: js.Any, _isHtml5: Boolean) = this()
  }
  
  @js.native
  class HashLocationService protected ()
    extends typings.uirouterCore.indexMod.HashLocationService {
    def this(router: UIRouter) = this()
  }
  
  @js.native
  class MemoryLocationConfig ()
    extends typings.uirouterCore.memoryLocationConfigMod.MemoryLocationConfig
  
  @js.native
  class MemoryLocationService protected ()
    extends typings.uirouterCore.indexMod.MemoryLocationService {
    def this(router: UIRouter) = this()
  }
  
  @js.native
  class PushStateLocationService protected ()
    extends typings.uirouterCore.indexMod.PushStateLocationService {
    def this(router: UIRouter) = this()
  }
  
  @JSName("$injector")
  val injector: InjectorLike = js.native
  @JSName("$q")
  val q: QLike = js.native
  def buildUrl(loc: LocationServices): String = js.native
  def getParams(queryString: String): js.Any = js.native
  def hashLocationPlugin(router: UIRouter): LocationPlugin = js.native
  def keyValsToObjectR(accum: js.Any, hasKeyVal: js.Tuple2[_, _]): js.Any = js.native
  def locationPluginFactory(name: String, isHtml5: Boolean, serviceClass: AnonUiRouter, configurationClass: AnonIsHtml5): js.Function1[/* uiRouter */ UIRouter, AnonConfiguration] = js.native
  def memoryLocationPlugin(router: UIRouter): LocationPlugin = js.native
  def parseUrl(url: String): AnonHash = js.native
  def pushStateLocationPlugin(router: UIRouter): LocationPlugin = js.native
  def servicesPlugin(router: UIRouter): ServicesPlugin = js.native
}

