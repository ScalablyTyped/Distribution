package typings.atUirouterCore

import typings.atUirouterCore.libRouterMod.UIRouter
import typings.atUirouterCore.libVanillaInterfaceMod.LocationPlugin
import typings.atUirouterCore.libVanillaInterfaceMod.ServicesPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/vanilla/plugins", JSImport.Namespace)
@js.native
object libVanillaPluginsMod extends js.Object {
  def hashLocationPlugin(router: UIRouter): LocationPlugin = js.native
  def memoryLocationPlugin(router: UIRouter): LocationPlugin = js.native
  def pushStateLocationPlugin(router: UIRouter): LocationPlugin = js.native
  def servicesPlugin(router: UIRouter): ServicesPlugin = js.native
}

