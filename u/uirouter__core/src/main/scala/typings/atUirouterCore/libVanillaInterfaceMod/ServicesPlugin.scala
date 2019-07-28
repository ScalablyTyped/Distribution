package typings.atUirouterCore.libVanillaInterfaceMod

import typings.atUirouterCore.libCommonCoreservicesMod.$InjectorLike
import typings.atUirouterCore.libCommonCoreservicesMod.$QLike
import typings.atUirouterCore.libInterfaceMod.UIRouterPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServicesPlugin extends UIRouterPlugin {
  @JSName("$injector")
  var $injector: $InjectorLike = js.native
  @JSName("$q")
  var $q: $QLike = js.native
}

