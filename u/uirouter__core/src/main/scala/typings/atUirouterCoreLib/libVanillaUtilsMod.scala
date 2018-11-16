package typings
package atUirouterCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/vanilla/utils", JSImport.Namespace)
@js.native
object libVanillaUtilsMod extends js.Object {
  val buildUrl: js.Function1[
    /* loc */ atUirouterCoreLib.libCommonCoreservicesMod.LocationServices, 
    java.lang.String
  ] = js.native
  val getParams: js.Function1[/* queryString */ java.lang.String, js.Any] = js.native
  val keyValsToObjectR: js.Function2[/* accum */ js.Any, /* hasKeyVal */ js.Tuple2[js.Any, js.Any], js.Any] = js.native
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
}

