package typings.uirouterCore.vanillaInterfaceMod

import typings.uirouterCore.coreservicesMod.LocationConfig
import typings.uirouterCore.coreservicesMod.LocationServices
import typings.uirouterCore.interfaceMod.UIRouterPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationPlugin extends UIRouterPlugin {
  var configuration: LocationConfig = js.native
  var service: LocationServices = js.native
}

