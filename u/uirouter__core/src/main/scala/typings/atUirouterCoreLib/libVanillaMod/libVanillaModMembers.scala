package typings
package atUirouterCoreLib.libVanillaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/vanilla", JSImport.Namespace)
@js.native
object libVanillaModMembers extends js.Object {
  @JSName("$injector")
  val $injector: js.Any = js.native
  @JSName("$q")
  val $q: js.Any = js.native
  def buildUrl(loc: atUirouterCoreLib.libCommonCoreservicesMod.LocationServices): java.lang.String = js.native
  def getParams(queryString: java.lang.String): js.Any = js.native
  def hashLocationPlugin(router: atUirouterCoreLib.libRouterMod.UIRouter): atUirouterCoreLib.libVanillaInterfaceMod.LocationPlugin = js.native
  def keyValsToObjectR(accum: js.Any, hasKeyVal: js.Tuple2[_, _]): js.Any = js.native
  def locationPluginFactory(
    name: java.lang.String,
    isHtml5: scala.Boolean,
    serviceClass: atUirouterCoreLib.Anon_UiRouter,
    configurationClass: atUirouterCoreLib.Anon_UiRouterIsHtml5
  ): js.Function1[
    /* uiRouter */ atUirouterCoreLib.libRouterMod.UIRouter, 
    atUirouterCoreLib.Anon_Dispose
  ] = js.native
  def memoryLocationPlugin(router: atUirouterCoreLib.libRouterMod.UIRouter): atUirouterCoreLib.libVanillaInterfaceMod.LocationPlugin = js.native
  def parseUrl(url: java.lang.String): atUirouterCoreLib.Anon_Hash = js.native
  def pushStateLocationPlugin(router: atUirouterCoreLib.libRouterMod.UIRouter): atUirouterCoreLib.libVanillaInterfaceMod.LocationPlugin = js.native
  def servicesPlugin(router: atUirouterCoreLib.libRouterMod.UIRouter): atUirouterCoreLib.libVanillaInterfaceMod.ServicesPlugin = js.native
}

