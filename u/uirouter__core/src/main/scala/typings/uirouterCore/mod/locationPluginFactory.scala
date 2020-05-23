package typings.uirouterCore.mod

import typings.uirouterCore.anon.Configuration
import typings.uirouterCore.anon.Instantiable
import typings.uirouterCore.anon.InstantiableLocationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core", "locationPluginFactory")
@js.native
object locationPluginFactory extends js.Object {
  def apply(
    name: String,
    isHtml5: Boolean,
    serviceClass: Instantiable,
    configurationClass: InstantiableLocationConfig
  ): js.Function1[/* uiRouter */ typings.uirouterCore.routerMod.UIRouter, Configuration] = js.native
}

