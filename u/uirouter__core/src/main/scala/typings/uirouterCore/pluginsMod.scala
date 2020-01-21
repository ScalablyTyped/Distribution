package typings.uirouterCore

import typings.uirouterCore.routerMod.UIRouter
import typings.uirouterCore.vanillaInterfaceMod.LocationPlugin
import typings.uirouterCore.vanillaInterfaceMod.ServicesPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/vanilla/plugins", JSImport.Namespace)
@js.native
object pluginsMod extends js.Object {
  def hashLocationPlugin(router: UIRouter): LocationPlugin = js.native
  def memoryLocationPlugin(router: UIRouter): LocationPlugin = js.native
  def pushStateLocationPlugin(router: UIRouter): LocationPlugin = js.native
  def servicesPlugin(router: UIRouter): ServicesPlugin = js.native
}

