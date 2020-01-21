package typings.uirouterCore.vanillaInterfaceMod

import typings.uirouterCore.coreservicesMod.InjectorLike
import typings.uirouterCore.coreservicesMod.QLike
import typings.uirouterCore.interfaceMod.UIRouterPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServicesPlugin extends UIRouterPlugin {
  @JSName("$injector")
  var $injector: InjectorLike = js.native
  @JSName("$q")
  var $q: QLike = js.native
}

