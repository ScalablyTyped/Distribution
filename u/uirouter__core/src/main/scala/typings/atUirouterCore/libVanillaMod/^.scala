package typings.atUirouterCore.libVanillaMod

import typings.atUirouterCore.Anon_Configuration
import typings.atUirouterCore.Anon_Hash
import typings.atUirouterCore.Anon_IsHtml5
import typings.atUirouterCore.Anon_UiRouter
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
object ^ extends js.Object {
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

