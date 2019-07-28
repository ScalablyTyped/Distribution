package typings.atUirouterCore.libVanillaInterfaceMod

import typings.atUirouterCore.libCommonCoreservicesMod.LocationConfig
import typings.atUirouterCore.libCommonCoreservicesMod.LocationServices
import typings.atUirouterCore.libInterfaceMod.UIRouterPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationPlugin extends UIRouterPlugin {
  var configuration: LocationConfig = js.native
  var service: LocationServices = js.native
}

