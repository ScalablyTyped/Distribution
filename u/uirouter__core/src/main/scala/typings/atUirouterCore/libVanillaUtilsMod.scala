package typings.atUirouterCore

import typings.atUirouterCore.libCommonCoreservicesMod.LocationServices
import typings.atUirouterCore.libRouterMod.UIRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/vanilla/utils", JSImport.Namespace)
@js.native
object libVanillaUtilsMod extends js.Object {
  def buildUrl(loc: LocationServices): String = js.native
  def getParams(queryString: String): js.Any = js.native
  def keyValsToObjectR(accum: js.Any, hasKeyVal: js.Tuple2[_, _]): js.Any = js.native
  def locationPluginFactory(name: String, isHtml5: Boolean, serviceClass: Anon_UiRouter, configurationClass: Anon_IsHtml5): js.Function1[/* uiRouter */ UIRouter, Anon_Configuration] = js.native
  def parseUrl(url: String): Anon_Hash = js.native
}

