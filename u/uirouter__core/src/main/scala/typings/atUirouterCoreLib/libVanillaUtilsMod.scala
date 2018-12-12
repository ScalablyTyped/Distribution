package typings
package atUirouterCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/vanilla/utils", JSImport.Namespace)
@js.native
object libVanillaUtilsMod extends js.Object {
  def buildUrl(loc: atUirouterCoreLib.libCommonCoreservicesMod.LocationServices): java.lang.String = js.native
  def getParams(queryString: java.lang.String): js.Any = js.native
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
  def parseUrl(url: java.lang.String): atUirouterCoreLib.Anon_Hash = js.native
}

