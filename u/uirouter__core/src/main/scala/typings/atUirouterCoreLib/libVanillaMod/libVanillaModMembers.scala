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
  val buildUrl: js.Function1[
    /* loc */ atUirouterCoreLib.libCommonCoreservicesMod.LocationServices, 
    java.lang.String
  ] = js.native
  val getParams: js.Function1[/* queryString */ java.lang.String, js.Any] = js.native
  val hashLocationPlugin: js.Function1[
    /* router */ atUirouterCoreLib.libRouterMod.UIRouter, 
    atUirouterCoreLib.libVanillaInterfaceMod.LocationPlugin
  ] = js.native
  val keyValsToObjectR: js.Function2[/* accum */ js.Any, /* hasKeyVal */ js.Tuple2[js.Any, js.Any], js.Any] = js.native
  val memoryLocationPlugin: js.Function1[
    /* router */ atUirouterCoreLib.libRouterMod.UIRouter, 
    atUirouterCoreLib.libVanillaInterfaceMod.LocationPlugin
  ] = js.native
  val pushStateLocationPlugin: js.Function1[
    /* router */ atUirouterCoreLib.libRouterMod.UIRouter, 
    atUirouterCoreLib.libVanillaInterfaceMod.LocationPlugin
  ] = js.native
  def locationPluginFactory(
    name: java.lang.String,
    isHtml5: scala.Boolean,
    serviceClass: atUirouterCoreLib.Anon_UiRouter,
    configurationClass: atUirouterCoreLib.Anon_UiRouterIsHtml5
  ): js.Function1[
    /* uiRouter */ atUirouterCoreLib.libRouterMod.UIRouter, 
    atUirouterCoreLib.Anon_Dispose
  ] = js.native
  def parseUrl(url: java.lang.String): atUirouterCoreLib.Anon_Hash = js.native
  def servicesPlugin(router: atUirouterCoreLib.libRouterMod.UIRouter): atUirouterCoreLib.libVanillaInterfaceMod.ServicesPlugin = js.native
}

