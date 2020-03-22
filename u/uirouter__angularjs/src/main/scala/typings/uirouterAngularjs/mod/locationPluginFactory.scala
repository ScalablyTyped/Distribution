package typings.uirouterAngularjs.mod

import typings.uirouterCore.AnonConfiguration
import typings.uirouterCore.AnonInstantiable
import typings.uirouterCore.AnonInstantiableLocationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "locationPluginFactory")
@js.native
object locationPluginFactory extends js.Object {
  def apply(
    name: String,
    isHtml5: Boolean,
    serviceClass: AnonInstantiable,
    configurationClass: AnonInstantiableLocationConfig
  ): js.Function1[/* uiRouter */ typings.uirouterCore.routerMod.UIRouter, AnonConfiguration] = js.native
}

