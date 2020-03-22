package typings.uirouterCore

import typings.uirouterCore.coreservicesMod.LocationServices
import typings.uirouterCore.routerMod.UIRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/vanilla/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def buildUrl(loc: LocationServices): String = js.native
  def getParams(queryString: String): js.Any = js.native
  def keyValsToObjectR(accum: js.Any, hasKeyVal: js.Tuple2[_, _]): js.Any = js.native
  def locationPluginFactory(
    name: String,
    isHtml5: Boolean,
    serviceClass: AnonInstantiable,
    configurationClass: AnonInstantiableLocationConfig
  ): js.Function1[/* uiRouter */ UIRouter, AnonConfiguration] = js.native
  def parseUrl(url: String): AnonHash = js.native
}

